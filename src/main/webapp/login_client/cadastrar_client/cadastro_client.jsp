<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="JoaoGabriel">
    <title>Cadastar | More Shop</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Optional JavaScript; choose one of the two! -->
    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js"></script>
    
    <!-- Custom styles for this template -->
    <link href="form-validation.css" rel="stylesheet">
    <style>
      body {
        max-width: 960px;
      }
      .needs-validation a {
        text-decoration: none;
      }
      input[type=number]::-webkit-inner-spin-button { 
        -webkit-appearance: none;
      }
      input[type=number] { 
        -moz-appearance: textfield;
        appearance: textfield;
      }
    </style>
  </head>
  <body class="container bg-light">
    <main>

      <div class="row g-5">
        <div class="col-md-4 h-50 col-lg-4 d-flex center">
          <img src="../../assets/user-bag.png" />
        </div>
        <div class="col-md-8 col-lg-8">
          <a class="w-100 mt-4 btn btn-primary btn-lg" href="../login.jsp">
            Voltar para o login
          </a>
          <hr class="my-2">
          <h2 class="mb-2">Crie sua conta</h2>
          <form name="FormUsuario"
            action="Cliente" method="POST"
            class="needs-validation"
          >
            <div class="row">
              <div class="input-group">
                <span class="input-group-text">Nome completo</span>
                <input type="text" aria-label="Primeiro nome" class="form-control"
                  name="nome_user" placeholder="Primeiro nome" required
                />
                <input type="text" aria-label="Sobrenome" class="form-control"
                  name="sobrenome_user" placeholder="Sobrenome" required
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
                    placeholder="Nome fictício para o usuário" required
                  />
                  <div class="invalid-feedback">
                    Por favor, informe o nome fictício do usuário.
                  </div>
                </div>
              </div>

              <div class="col-12">
                <label for="email" class="form-label">Email</label>
                <input type="email" class="form-control" id="email" 
                  name="email_user" placeholder="nome@exemplo.com" required
                />
                <div class="invalid-feedback">
                  Por favor, informe um email válido.
                </div>
              </div>

              <div class="col-12">
                <label for="senha" class="form-label">Senha</label>
                <input type="password" class="form-control" id="senha" 
                  name="senha_user" placeholder="Sua senha" required 
                />
                <div class="invalid-feedback">
                  Por favor, informe sua senha.
                </div>
              </div>
              
              <div class="col-12">
                <label for="cpf" class="form-label">CPF</label>
                <input type="number" class="form-control" id="cpf" 
                  name="cpf_user" placeholder="Seu cpf" required 
                />
                <div class="invalid-feedback">
                  Por favor, informe seu cpf.
                </div>
              </div>

              <div class="col-12 pt-3 input-group">
                <span class="input-group-text">Localidade</span>
                <input type="text" aria-label="Cidade" class="form-control"
                  name="cidade_user" placeholder="Sua cidade" required
                />
                <input type="text" aria-label="Estado" class="form-control"
                  name="estado_user" placeholder="Seu estado" required
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
    
    <script src="form-validation.js"></script>
  </body>
</html>
