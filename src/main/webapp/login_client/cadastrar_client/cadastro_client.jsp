<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="JoaoGabriel">
    <title> Cadastar | More Shop </title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Optional JavaScript; choose one of the two! -->
    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js"></script>
    
    <!-- My Styles -->
    <link href="${pageContext.request.contextPath}/css/global.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/cadastro_client.css" rel="stylesheet">

  </head>
  <body class="container bg-light">
    <header>
      
      <nav class="navbar navbar-expand-lg text-white bg-primary">
        <div class="container-fluid nav-container-fluid">
          <div class="my-navbar-brand">
            <a class="navbar-brand" 
              href="${pageContext.request.contextPath}/"
            >
              <img class="logo" 
                src="${pageContext.request.contextPath}/assets/logo.png" 
                alt="Logo"
              />
            </a>
          </div>

          <button class="navbar-toggler" type="button" 
            data-bs-toggle="collapse" 
            data-bs-target="#navbarMain" 
            aria-controls="navbarMain" 
            aria-expanded="false" aria-label="Toggle navigation"
          >
            <span class="navbar-toggler-icon"></span>
          </button>

          <div class="collapse navbar-collapse mb-2" 
            id="navbarMain"
          >
            <ul class="navbar-nav me-auto">
              <li class="nav-item me-2">
                <a class="nav-link active" aria-current="page"
                  href="${pageContext.request.contextPath}/"
                >
                  Home
                </a>
              </li>
              <li class="nav-item me-2">
                <a class="nav-link" href="#">Sobre</a>
              </li>
              <li class="nav-item me-2">
                <a class="nav-link" href="#">Categoria</a>
              </li>
              <li class="nav-item me-2">
                <a class="nav-link" href="#">Produtos</a>
              </li>
              <li class="nav-item me-2">
                <a class="nav-link" href="#">Lojas</a>
              </li>
            </ul>
            <div class="d-flex">
              <form class="d-flex justify-content-evenly">
                <input class="form-control me-2" type="search" placeholder="Search" 
                  aria-label="Search" 
                />
                <button class="btn btn-success me-2 p-2" type="submit">Pesquisa</button>
              </form>
              
              <a class="ml-5" type="button" 
                href="${pageContext.request.contextPath}/Login"
              >
                <img
                  src="${pageContext.request.contextPath}/assets/conta-user.png" 
                  alt="User"
                  style="height: 32px; width: 32px;"
                />
              </a>
            </div>
          </div>
        </div>
      </nav>
                  
    </header>
    <main>

      <div class="row g-5">
        <div class="col-md-4 h-50 col-lg-4 d-flex center">
          <img src="${pageContext.request.contextPath}/assets/user-bag.png" />
        </div>
        <div class="col-md-8 col-lg-8">
          <a class="w-100 mt-4 btn btn-primary btn-lg" 
            href="${pageContext.request.contextPath}/Login"
          >
            Voltar para o login
          </a>
          <hr class="my-2">
          
          <p id="messageErroCadastro"></p>
           
          <h2 class="mb-2">Crie sua conta</h2>
          <form name="FormUsuario"
            action="${pageContext.request.contextPath}/Cliente" method="POST"
            class="needs-validation"
          >
            <div class="row">
              <div class="input-group">
                <span class="input-group-text">Nome completo</span>
                <input type="text" aria-label="Primeiro nome" class="form-control"
                  name="nome_user" placeholder="Primeiro nome"
                  required
                />
                <input type="text" aria-label="Sobrenome" class="form-control"
                  name="sobrenome_user" placeholder="Sobrenome"
                  required
                />
                <div class="invalid-feedback">
                  Por favor, informe o nome completo.
                </div>
              </div>

              <div class="col-12">
                <label for="nickname" class="form-label">Nickname</label>
                <div class="input-group has-validation">
                  <span class="input-group-text">@</span>
                  <input type="text" class="form-control" id="nickname" 
                    name="nickname_user" 
                    placeholder="Nome fictício para o usuário"
                    required
                  />
                  <div class="invalid-feedback">
                    Por favor, informe o nome fictício do usuário.
                  </div>
                </div>
              </div>

              <div class="col-12">
                <label for="email" class="form-label">Email</label>
                <input type="email" class="form-control" id="email" 
                  name="email_user" placeholder="nome@exemplo.com" 
                  required
                />
                <div class="invalid-feedback">
                  Por favor, informe um email válido.
                </div>
              </div>

              <div class="col-12">
                <label for="senha" class="form-label">Senha</label>
                <input type="password" class="form-control" id="senha" 
                  name="senha_user" placeholder="Sua senha"
                  required 
                />
                <div class="invalid-feedback">
                  Por favor, informe sua senha.
                </div>
              </div>
              
              <div class="col-12">
                <label for="cpf" class="form-label">CPF</label>
                <input type="text" class="form-control" id="cpf" 
                  name="cpf_user" placeholder="Seu cpf"
                  required 
                />
                <div class="invalid-feedback">
                  Por favor, informe seu cpf.
                </div>
              </div>

              <div class="col-12 pt-3 input-group">
                <span class="input-group-text">Localidade</span>
                <input type="text" aria-label="Cidade" class="form-control"
                  name="cidade_user" placeholder="Sua cidade" 
                  required
                />
                <input type="text" aria-label="Estado" class="form-control"
                  name="estado_user" placeholder="Seu estado"
                  required
                />
                <div class="invalid-feedback">
                  Por favor, informe a sua localidade(cidade e estado).
                </div>
              </div>
            </div>

            <hr class="my-4">
            <button class="w-100 p-2 btn btn-success btn-lg" 
              type="submit">Confirmar o cadastro
            </button>
          </form>
          <footer class="pt-5 text-muted text-center text-small">

            <p class="mb-1">&copy; 2021-2025 Good Game Team Inc.</p>
            <ul class="list-inline">
              <li class="list-inline-item"><a href="#">Privacy</a></li>
              <li class="list-inline-item"><a href="#">Terms</a></li>
              <li class="list-inline-item"><a href="#">Support</a></li>
            </ul>

          </footer>
        </div>
      </div>

    </main>
    <!-- My Script -->
    <script src="${pageContext.request.contextPath}/js/cadastro_client.js"></script>
  </body>
</html>
