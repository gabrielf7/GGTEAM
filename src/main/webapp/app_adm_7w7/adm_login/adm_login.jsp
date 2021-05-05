<%@include file="../../minitemplates/abrir_page.jsp"%>
    <title> _Entrar_ </title>
    
    <!-- My Styles -->
    <link href="${pageContext.request.contextPath}/app_src/css/global.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/app_adm_7w7/adm_login/adm_login.css" rel="stylesheet">

  <%@include file="../../minitemplates/fechar_head.jsp"%>
  <!-- Abre Body -->
    <main class="text-center">

      <div class="form-signin">
        <form id="formulario" method="POST" name="formulario"
          action="${pageContext.request.contextPath}/dono"
        >
          <h1 class="h3 mb-3 fw-normal">Por favor, faça login</h1>

          <p id="messageErroLogin"></p>

          <div class="form-floating">
            <input type="email" class="form-control" id="floatingInput" 
              name="email_login" placeholder="nome@exemplo.com"
              alt="Informar o email do usuario"
              required
            />
            <label for="floatingInput">Email</label>
          </div>
          <div class="form-floating">
            <input type="password" class="form-control" id="floatingPassword" 
              name="senha_login" placeholder="Recomendamos senha grande"
              alt="Informar a senha do usuario"
              required
            />
            <label for="floatingPassword">Senha</label>
          </div>

          <button class="w-100 btn btn-lg btn-primary" type="submit">
            Fazer Logon
          </button>

          <div class="pt-5 text-muted text-center text-small">
            <%@include file="../../minitemplates/footer.jsp"%>
          </div>
        </form>
      </div>

    </main>
    <!-- My Script -->
    <script src="${pageContext.request.contextPath}/app_adm_7w7/adm_login/adm_login.js"></script>
  <!-- Fecha Body -->
<%@include file="../../minitemplates/fechar_page.jsp"%>
