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
import com.ggteam.projetoecommerceggt.models.UserCollaborator;

// DAO 
import com.ggteam.projetoecommerceggt.dao.CollaboratorDAO;
import com.ggteam.projetoecommerceggt.dao.ResourcesDAO;

/**
 *
 * @author on github *
 * -> @gabrielf7 (JoaoGabriel)
 * -> @jvpererinha (JoaoVictorD.)
 * -> @gustavo3g (GustavoBarros)
 * -> @ (TallysSilva)
 */
@WebServlet(name = "CLBRegistered", urlPatterns = {"/CLBRegistered"})
public class LoginRegisteredCLB extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    
    ResourcesDAO srcDao = new ResourcesDAO();
    srcDao.getIdentifySessionLogin(
      "IdUser",
      "/Welcome",
      request, response
    );
    srcDao.getIncludeURL(
      "/login/register_collaborator/registered_collaborator.jsp", 
      request, response
    );
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, UnsupportedEncodingException {
    request.setCharacterEncoding("UTF-8");
    CollaboratorDAO collaborator = new CollaboratorDAO();
    ResourcesDAO srcDao = new ResourcesDAO();

    try {
      DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
      LocalDateTime dataHoje = LocalDateTime.now();
      
      String nome = request.getParameter("nome_user");
      String snome = request.getParameter("sobrenome_user");
      String cnpj = request.getParameter("cnpj_user");
      String rzsocial = request.getParameter("razaosocial_user");
      String email = request.getParameter("email_user");
      String senha = request.getParameter("senha_user");
      senha = srcDao.createPassword(senha);
      String cidade = request.getParameter("cidade_user");
      String estado = request.getParameter("estado_user");
      
      UserCollaborator usr_collaborator = new UserCollaborator();
      usr_collaborator.setNome(nome);
      usr_collaborator.setSobrenome(snome);
      usr_collaborator.setCnpj(cnpj);
      usr_collaborator.setRazaosocial(rzsocial);
      usr_collaborator.setEmail(email);
      usr_collaborator.setSenha(senha);
      usr_collaborator.setLocalidade(cidade + ", " + estado);
      usr_collaborator.setUltimoAcesso(formato.format(dataHoje));

      // Verificar se os campos foram preenchidos corretamente.
      if ( 
        (nome == null || snome == null) ||
        (email == null || senha == null) ||
        (cnpj == null) ||
        (cidade == null || estado == null) ||
        (nome.isEmpty() || snome.isEmpty()) ||
        (email.isEmpty() || senha.isEmpty()) ||
        (cnpj.isEmpty()) ||
        (cidade.isEmpty() || estado.isEmpty())
      ) {
        response.sendRedirect(request.getContextPath() + "/CLBRegistered?naddclb=false");
      }
      // Verificar se o cliente ja existe no DB.
      if ( collaborator.getIdentifyCollaborator(email, cnpj, rzsocial) == null ) {
        // Inicia uma transação com o banco de dados, para add novo cliente.
        collaborator.addCollaborator(usr_collaborator);

        response.sendRedirect(request.getContextPath() + "/Login");
      } else {
        response.sendRedirect(request.getContextPath() + "/CLBRegistered?addclb=true");
      }

    } catch (IOException e) {
      System.out.println("Erro no servlet cadastrado de colaborador: " + e.getMessage());
    } catch (NoSuchAlgorithmException ex) {
      Logger.getLogger(LoginRegisteredCLB.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>
}
