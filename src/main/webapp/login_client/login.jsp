<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="App Studant uma plataforma de form">
    <meta name="author" content="JoaoGabriel, GG TIME, and App Studant CEO">
    <title>Entrar | More Shop</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Optional JavaScript; choose one of the two! -->
    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js"></script>

    <!-- Custom styles for this template -->
    <link href="login.css" rel="stylesheet">
  </head>
  <body class="text-center">
    <main class="form-signin">

      <form id="formulario" method="POST" name="formulario"
        action="Login"
      >
        <h1 class="h3 mb-3 fw-normal">Por favor, faça login</h1>

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
        <a href="./cadastrar_login/cadastro.jsp">
          Está de fora? cadastra-se aqui...
        </a>
        <footer class="pt-5 text-muted text-center text-small">

          <p class="mb-1">&copy; 2021-2025 Good Game Team Inc.</p>
          <ul class="list-inline">
            <li class="list-inline-item"><a href="../home.jsp">Privacy</a></li>
            <li class="list-inline-item"><a href="#">Terms</a></li>
            <li class="list-inline-item"><a href="#">Support</a></li>
          </ul>

        </footer>
      </form>

    </main>
  </body>
</html>
