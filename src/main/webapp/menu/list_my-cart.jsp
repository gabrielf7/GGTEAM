<%-- 
    Document   : list_my-cart
    Created on : 21/06/2021, 12:53:15
    Author     : Guuhb
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@include file="../minitemplates/abrir_page.jsp"%>
    <title> Carrinho|</title>

    <!-- My Styles -->
    <link href="${css}/global.css" rel="stylesheet">
    
  <%@include file="../minitemplates/fechar_head.jsp"%>
  <!-- Abre Body -->
    <%@include file="../minitemplates/mostrar_header.jsp"%>
    
    <main>
        <div class="container-fluid">
            <div class="container">
                <a href="${ctx}/Cart?remove_car=all" type="button" class="btn btn-danger">Limpar Carrinho</a> <br>
        <%
//            out.print(session.getAttribute("carrinho"));
            if(session.getAttribute("carrinho") != null){
            List <String> carrinho = (List<String>) session.getAttribute("carrinho");
            int contador = 0;

            for(String car : carrinho){
        %>
        <!-- Conte�do do Scroll -->
        
            <h2><% out.print(car);%></h2>
        
            <div class="row">
                <div class="col-12">
                    <div class="card-group" style="width: 250px;">
                        <div class="card">
                            <div class="d-flex justify-content-center">
                                <% car.replaceAll("\\s+",""); %>
                              <img 
                                width="224px" height="224px"
                                src="${assets}/<%out.print(car);%>.jpg" 
                                class="card-img-top" alt="Fone de ouvido bluetooth"
                              />
                            </div>

                            <input hidden type="text" name="carrinho_fone" value="fone de ouvido" >

                            <div class="card-body">
                                <h1 class="card-title pricing-card-title">
                                  R$ 150<small class="text-muted fw-light">,90</small>
                                </h1>
                                <p>6x 25 sem juros</p>

                            </div>
                            <a href="${ctx}/Cart?finalizar_car=<% out.print(contador); %>"#" class="btn btn-primary">Finalizar compra</a>
                        </div>
                    </div>
                </div>
            </div>
       

        <% contador += 1; }} else { out.print("Carrinho vazio :("); }%>
         </div>
 </div>
    </main>
    
    <div class="text-muted text-center text-small">
      <%@include file="../minitemplates/footer.jsp"%>
    </div>
  <!-- Fecha Body --> 
<%@include file="../minitemplates/fechar_page.jsp"%>

