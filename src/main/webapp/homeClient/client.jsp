<%@include file="../minitemplates/abrir_page.jsp"%>
    <title> More Shop </title>

    <!-- My Styles -->
    <link href="${pageContext.request.contextPath}/app_src/css/global.css" rel="stylesheet">
    
  <%@include file="../minitemplates/fechar_head.jsp"%>
  <!-- Abre Body -->
    <%@include file="../minitemplates/mostrar_header.jsp"%>
    
    <main>
      <h1 class="text-center">Ol�, ${UserName}. Seja bem vindo</h1>
    </main>
    
    <div class="pt-5 text-muted text-center text-small">
      <%@include file="../minitemplates/footer.jsp"%>
    </div>
  <!-- Fecha Body -->
<%@include file="../minitemplates/fechar_page.jsp"%>