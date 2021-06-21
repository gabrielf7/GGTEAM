package com.ggteam.projetoecommerceggt.svMain;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

// Model
import com.ggteam.projetoecommerceggt.models.UserClient;

// DAO
import com.ggteam.projetoecommerceggt.dao.ResourcesDAO;
import com.ggteam.projetoecommerceggt.dao.ClientDAO;

/**
 *
 * @author on github *
 * -> @gabrielf7 (JoaoGabriel)
 * -> @jvpererinha (JoaoVictorD.)
 * -> @gustavo3g (GustavoBarros)
 * -> @ (TallysSilva)
 */
@WebServlet(name = "ClientEdit", urlPatterns = {"/ClientEdit"})
public class HomeClientEdit extends HttpServlet {
  
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html; charset=UTF-8");
    
    ResourcesDAO srcDao = new ResourcesDAO();
    ClientDAO client = new ClientDAO();
    UserClient usr = new UserClient();
    String id = request.getParameter("usr");

    srcDao.getLoginSession(
      "IdUser",
      "/Login",
      request, response
    );
    if (id != null){
      usr = client.getClientID(Integer.parseInt(id));
      request.getSession().setAttribute("perfil", usr);
      request.getSession().setAttribute("UserName", usr.getNickname());
    
      srcDao.getIncludeURL(
        "/homeClient/client_edit.jsp", 
        request, response
      );
    } else {
      srcDao.getIncludeURL(
        "/homeClient/client.jsp", 
        request, response
      );
    }
  }
  
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, UnsupportedEncodingException {
    request.setCharacterEncoding("UTF-8");
    ClientDAO client = new ClientDAO();
    ResourcesDAO srcDao = new ResourcesDAO();
    String acao = request.getParameter("acao");
    String idusr = request.getParameter("usr");

    try {
      DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
      LocalDateTime dataHoje = LocalDateTime.now();
      
      String nome = request.getParameter("nome_user");
      String snome = request.getParameter("sobrenome_user");
      String nkname = request.getParameter("nickname_user");
      String email = request.getParameter("email_user");
      String senha = request.getParameter("senha_user");
      senha = srcDao.createPassword(senha);
      String cpf = request.getParameter("cpf_user");
      String cidade = request.getParameter("cidade_user");
      String estado = request.getParameter("estado_user");

      UserClient usr_cliente = new UserClient();
      usr_cliente.setId(Long.parseLong(idusr));
      usr_cliente.setNome(nome);
      usr_cliente.setSobrenome(snome);
      usr_cliente.setNickname(nkname);
      usr_cliente.setEmail(email);
      usr_cliente.setSenha(senha);
      usr_cliente.setCpf(cpf);
      usr_cliente.setCidade(cidade);
      usr_cliente.setEstado(estado);
      usr_cliente.setUltimoAcesso(formato.format(dataHoje));

      // Verificar se os campos foram preenchidos corretamente.
      if ( 
        (nome == null || snome == null) ||
        (nkname == null || email == null) ||
        (senha == null || cpf == null) ||
        (nome.isEmpty() || snome.isEmpty()) ||
        (nkname.isEmpty() || email.isEmpty()) ||
        (senha.isEmpty() || cpf.isEmpty())
      ) {
        response.sendRedirect(request.getContextPath() + "/ClientEdit?naddclt=false");
      }
      
      if (acao.equals("atualizar")) {
        client.updateClient(usr_cliente);
        response.sendRedirect(request.getContextPath() + "/ClientEdit?usr=" + idusr);
      } else {
        response.sendRedirect(request.getContextPath() + "/Welcome");
      }

    } catch (IOException e) {
      System.out.println("Erro no servlet do cliente ao editar perfil: " + e.getMessage());
    } catch (NoSuchAlgorithmException ex) {
      Logger.getLogger(HomeClientEdit.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
