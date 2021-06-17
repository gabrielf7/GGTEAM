<%@include file="../../minitemplates/abrir_page.jsp"%>
    <title> More Shop </title>

    <!-- My Styles -->
    <link href="${css}/global.css" rel="stylesheet">
    
  <%@include file="../../minitemplates/fechar_head.jsp"%>
  <!-- Abre Body -->
    <%@include file="../../minitemplates/mostrar_header.jsp"%>
    
    <main class="d-flex flex-wrap justify-content-center" style="margin: 100px 100px">
      <section>
        <h2>Error de status ${statusCode},</h2>
      </section>
      <section>
        <p>Motivo: ${messageError}</p>
      </section>
    </main>
    
    <div class="pt-5 text-muted text-center text-small">
      <%@include file="../../minitemplates/footer.jsp"%>
    </div>
  <!-- Fecha Body -->
<%@include file="../../minitemplates/fechar_page.jsp"%>