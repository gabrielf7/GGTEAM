<%@include file="../minitemplates/abrir_page.jsp"%>
    <title> Entrar | More Shop </title>
    
    <!-- My Styles -->
    <link href="${pageContext.request.contextPath}/css/global.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet">

  <%@include file="../minitemplates/fechar_head.jsp"%>
  <!-- Abre Body -->
    <%@include file="../minitemplates/mostrar_header.jsp"%>
    <main class="text-center">

      <div class="form-signin">
        <form id="formulario" method="POST" name="formulario"
          action="${pageContext.request.contextPath}/Login"
        >
          <h1 class="h3 mb-3 fw-normal">Por favor, faça login</h1>

          <p id="messageErroLogin"></p>

          <div class="form-floating">
            <input type="email" class="form-control" id="floatingInput" 
              name="email_login" placeholder="nome@exemplo.com"
              alt="Informar o email do estudante"
              required
            />
            <label for="floatingInput">Email</label>
          </div>
          <div class="form-floating">
            <input type="password" class="form-control" id="floatingPassword" 
              name="senha_login" placeholder="Recomendamos senha grande"
              alt="Informar a senha do estudante"
              required
            />
            <label for="floatingPassword">Senha</label>
          </div>

          <button class="w-100 btn btn-lg btn-primary" type="submit">
            Fazer Logon
          </button>
          <a href="${pageContext.request.contextPath}/Cliente">
            Está de fora? cadastra-se aqui...
          </a>
          <div class="pt-5 text-muted text-center text-small">
            <%@include file="../minitemplates/footer.jsp"%>
          </div>
        </form>
      </div>

    </main>
    <!-- My Script -->
    <script src="${pageContext.request.contextPath}/js/login.js"></script>
  <!-- Fecha Body -->
<%@include file="../minitemplates/fechar_page.jsp"%>
