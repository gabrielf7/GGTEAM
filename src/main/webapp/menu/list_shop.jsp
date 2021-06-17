<%@include file="../minitemplates/abrir_page.jsp"%>
    <title> Lojas | More Shop </title>

    <!-- My Styles -->
    <link href="${css}/global.css" rel="stylesheet">
    
  <%@include file="../minitemplates/fechar_head.jsp"%>
  <!-- Abre Body -->
    <%@include file="../minitemplates/mostrar_header.jsp"%>
    
    <main>
            <%
        String carrinho_fone = (String) session.getAttribute("carrinho_fone");
        out.print(carrinho_fone);
        if(carrinho_fone != null){
    %>
<div class="container-fluid"><!-- Conteï¿½do do Scroll -->
    <div class="container">
        <h2>CARRINHO</h2>
        
        <div class="row">
            <div class="col-12">
                <div class="card-group" style="width: 250px;">
                    <div class="card">
                        <div class="d-flex justify-content-center">
                          <img 
                            width="224px" height="224px"
                            src="${assets}/fone-de-ouvido-bluetooth-preto.jpg" 
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
                        <a href="${ctx}/Shop?remove_fone=carrinho_fone"#" class="btn btn-danger">remover do carrinho</a>
                    </div>
                    </div
                
                
            </div>
        </div>
    </div>
</div>
</div>
<br>
<br>
<br>
<%}%>

    <%
        String carrinho_celular = (String) session.getAttribute("carrinho_celular");
        out.print(carrinho_celular);
        if(carrinho_celular != null){
    %>
<div class="container-fluid"><!-- Conteï¿½do do Scroll -->
    <div class="container">
        
        <div class="row">
            <div class="col-12">
                <div class="card-group" style="width: 250px;">
                    <div class="card">
                        <div class="d-flex justify-content-center">
                          <img 
                            width="224px" height="224px"
                            src="${assets}/smartphone-xiaomi.png" 
                            class="card-img-top" alt="Redmi note 9"
                          />
                        </div>
                            
                        <input hidden type="text" name="carrinho_fone" value="Redmi Note 9" >

                        <div class="card-body">
                            <h1 class="card-title pricing-card-title">
                              R$ 1650<small class="text-muted fw-light">,90</small>
                            </h1>
                            <p>6x 25 sem juros</p>
                            
                        </div>
                        <a href="${ctx}/Shop?remove_celular=carrinho_celular"#" class="btn btn-danger">remover do carrinho</a>
                    </div>
                    </div
                
                
            </div>
        </div>
    </div>
</div>
</div>      
<%}%>

<%
    if(carrinho_fone == null && carrinho_celular == null){
        
        out.print("Não existe nada no carrinho :(");
    }
%>
    </main>
    





    <div class="pt-5 text-muted text-center text-small">
      <%@include file="../minitemplates/footer.jsp"%>
    </div>
  <!-- Fecha Body -->
<%@include file="../minitemplates/fechar_page.jsp"%>