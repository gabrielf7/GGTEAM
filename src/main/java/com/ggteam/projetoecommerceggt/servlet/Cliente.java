package com.ggteam.projetoecommerceggt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Model
import com.ggteam.projetoecommerceggt.model.UsuarioCliente;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author JoaoGabriel
 */
@WebServlet(name = "Cliente", urlPatterns = {"/Cliente"})
public class Cliente extends HttpServlet {
  private EntityManager getEntityManager() {
      //Obtém o factory a partir da unidade de persistência.
      EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjetoEcommerceGGT");
      //Cria um entity manager.
      EntityManager entityManager = factory.createEntityManager();

      return entityManager;
    }
  

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html");

    EntityManager entityManager = getEntityManager();

    try {
      DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
      LocalDateTime dataHoje = LocalDateTime.now();
      
      String nome = request.getParameter("nome_user");
      String snome = request.getParameter("sobrenome_user");
      String nkname = request.getParameter("nickname_user");
      String email = request.getParameter("email_user");
      String senha = request.getParameter("senha_user");
      String cpf = request.getParameter("cpf_user");
      String cidade = request.getParameter("cidade_user");
      String estado = request.getParameter("estado_user");

      UsuarioCliente usr_cliente = new UsuarioCliente();
      usr_cliente.setNome(nome);
      usr_cliente.setSobrenome(snome);
      usr_cliente.setNickname(nkname);
      usr_cliente.setEmail(email);
      usr_cliente.setSenha(senha);
      usr_cliente.setCpf(cpf);
      // usr_cliente.setCpf(Integer.parseInt(cpf));
      usr_cliente.setLocalidade(cidade + ", " + estado);
      usr_cliente.setUltimoAcesso(formato.format(dataHoje));
      
      // Inicia uma transação com o banco de dados.
      entityManager.getTransaction().begin();
      // Verifica se usuario tem o nome salvo no banco de dados.
      if ( (email != null) && (cpf != null) ) {
        entityManager.persist(usr_cliente);
        entityManager.getTransaction().commit();
        
        try (PrintWriter out = response.getWriter()) {
          out.println("<!DOCTYPE html>");
          out.println("<html>");
          out.println("<head>");
          out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
          out.println("<meta http-equiv=\"Refresh\" content=\"0;URL=login/login.jsp\">");
          out.println("</head>");
          out.println("<body>");
          out.println("</body>");
          out.println("</html>");
          out.close();
        }
      } else {
        try (PrintWriter out = response.getWriter()) {
          out.println("<!DOCTYPE html>");
          out.println("<html>");
          out.println("<head>");
          out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
          out.println("<meta http-equiv=\"Refresh\" content=\"0;URL=login/cadastrar_login/cadastro.jsp\">");
          out.println("</head>");
          out.println("<body>");
          out.println("</body>");
          out.println("</html>");
          out.close();
        }
      }
    } finally {
      // Fecha conexão
      if (entityManager.getTransaction().isActive()) {
        entityManager.getTransaction().rollback();
      }
      entityManager.close();
    }
  }
  
  @Override
  protected void doPut(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

  }

  @Override
  protected void doDelete(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>
}
