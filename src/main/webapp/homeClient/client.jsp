<%@include file="../minitemplates/abrir_page.jsp"%>
    <title> Cliente | More Shop </title>

    <!-- My Styles -->
    <link href="${css}/global.css" rel="stylesheet">
    <link href="${css}/client.css" rel="stylesheet">
    
  <%@include file="../minitemplates/fechar_head.jsp"%>
  <!-- Abre Body -->
    <%@include file="../minitemplates/mostrar_header.jsp"%>
    
    <main>      
      <div class="container">
        <div class="row">
          <div class="col-3 h-50 d-flex flex-column justify-content-center">
            <a type="button" href="${ctx}/ClientEdit" class="btn btn-outline-secondary">Editar perfil</a>
            <a type="button" class="btn btn-outline-secondary">Histórico</a>
            <a type="button" href="${ctx}/Logout" class="btn btn-outline-secondary">Sair</a>
          </div>
          <div class="col-9">
            <h3 class="text-center mt-5">Olá ${UserName}, seja bem vindo.</h3>
          </div>
        </div>
      </div>
    </main>
    
    <div class="pt-5 text-muted text-center text-small">
      <%@include file="../minitemplates/footer.jsp"%>
    </div>
  <!-- Fecha Body -->
<%@include file="../minitemplates/fechar_page.jsp"%>