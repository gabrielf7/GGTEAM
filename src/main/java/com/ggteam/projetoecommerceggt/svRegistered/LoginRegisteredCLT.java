package com.ggteam.projetoecommerceggt.svRegistered;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

// Model
import com.ggteam.projetoecommerceggt.models.UserClient;

// DAO 
import com.ggteam.projetoecommerceggt.dao.ClientDAO;
import com.ggteam.projetoecommerceggt.dao.ResourcesDAO;

/**
 *
 * @author on github *
 * -> @gabrielf7 (JoaoGabriel)
 * -> @jvpererinha (JoaoVictorD.)
 * -> @gustavo3g (GustavoBarros)
 * -> @ (TallysSilva)
 */
@WebServlet(name = "Registered", urlPatterns = {"/Registered"})
public class LoginRegisteredCLT extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html; charset=UTF-8");
    
    ResourcesDAO srcDao = new ResourcesDAO();
    srcDao.getIdentifySessionLogin(
      "IdUser",
      "/Welcome",
      request, response
    );
    
    if ("Collaborator".equals(request.getParameter("add"))) {
      srcDao.getIncludeURL(
        "/login/register_collaborator/registered_collaborator.jsp", 
        request, response
      );
    } else {
      srcDao.getIncludeURL(
        "/login/register_client/registered_client.jsp", 
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
      usr_cliente.setNome(nome);
      usr_cliente.setSobrenome(snome);
      usr_cliente.setNickname(nkname);
      usr_cliente.setEmail(email);
      usr_cliente.setSenha(senha);
      usr_cliente.setCpf(cpf);
      if (cidade.isEmpty() && estado.isEmpty()){
        usr_cliente.setLocalidade("vazio");
      } else {
        usr_cliente.setLocalidade(cidade + ", " + estado);
      }
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
        response.sendRedirect(request.getContextPath() + "/Registered?naddclt=false");
      }
      // Verificar se o cliente ja existe no DB.
      if ( client.getIdentifyClient(email, cpf, nkname) == null ) {
        // Inicia uma transação com o banco de dados, para add novo cliente.
        client.addClient(usr_cliente);

        response.sendRedirect(request.getContextPath() + "/Login");
      } else {
        response.sendRedirect(request.getContextPath() + "/Registered?addclt=true");
      }

    } catch (IOException e) {
      System.out.println("Erro no servlet do cadastrado de cliente: " + e.getMessage());
    } catch (NoSuchAlgorithmException ex) {
      Logger.getLogger(LoginRegisteredCLT.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>
}
