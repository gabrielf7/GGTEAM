<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Cadastrar | More Shop</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Optional JavaScript; choose one of the two! -->
    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js"></script>

    <!-- My Scritps Remote -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.4/Chart.min.js"></script>

    <!-- My Styles -->
    <style>
      main {
        max-width: 960px; height: 500px;
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
  <body style="background-color: #fff;color: #1D2731;" >
    <header>
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
          <a class="navbar-brand" href="#">More Shop</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" 
            data-bs-target="#navbarSupportedContent" 
            aria-controls="navbarSupportedContent" 
            aria-expanded="false" aria-label="Toggle navigation"
          >
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" 
                href="#">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Sobre</a>
              </li>
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" 
                  id="navbarDropdown" role="button" 
                  data-bs-toggle="dropdown" aria-expanded="false">
                  Serviços ADM
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a class="dropdown-item" href="#">Produto</a></li>
                  <li><a class="dropdown-item" href="#">Categoria</a></li>
                  <li><hr class="dropdown-divider"></li>
                  <li><a class="dropdown-item" href="#">Histórico</a></li>
                </ul>
              </li>
            </ul>
            <form class="d-flex">
              <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
              <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
          </div>
        </div>
      </nav>
    </header>
    <main class="container my_container_main mt-3">
      <div class="row">
        <div class="col-lg-5 col-sm-12">
          <button class="col-lg-12 col-sm-12 mt-5 p-lg-2 mt-3 btn btn-outline-danger" 
            type="button" data-bs-toggle="modal" data-bs-target="#modal_new_category">
            Adicionar Categoria
          </button>

          <button class="col-lg-12 col-sm-12 p-lg-2 mt-3 btn btn-outline-danger" 
            type="button" data-bs-toggle="modal" data-bs-target="#modal_new_product">
            Adicionar Produto
          </button>

        </div>

        <div class="col-lg-7">
          <img class="mt-5 col-sm-12" src="assets/landing.svg" alt="img background">

        </div>

      </div>

      <!-- Modal Nova Categoria -->
      <div class="modal fade" id="modal_new_category" tabindex="-1" 
        aria-labelledby="New Category" aria-hidden="true">
        <div class="modal-dialog modal-dm">
          <div class="modal-content">
            <div class="modal-header">
              <h5 class="modal-title">Nova Categoria</h5>
              <button type="button" class="close" data-bs-dismiss="modal" 
                aria-label="Close">
                <i class="far fa-times-circle text-white" 
                aria-hidden="true"></i>
              </button>
            </div>
            <div class="modal-body">
              <form action="new_category.php" method="POST">
                <div class="form-group">
                  <label>Nome</label>

                  <input class="form-control" type="text" name="name_category" 
                    placeholder="Digite o nome da categoria..." 
                    alt="Informe o nome da categoria" required 
                  />

                </div>

                <div class="form-group">
                  <label>Descrição</label>

                  <textarea class="form-control" type="textarea" 
                    name="description_category" 
                    placeholder="Digite algumas informaÃ§Ãµes..." 
                    alt="Informe algumas informaÃ§Ãµes sobre o produto" 
                    row="4" required></textarea>

                </div>

                <button type="submit" class="btn btn-my6-color">
                  Confirmar
                </button>

              </form>

            </div>
            <div class="modal-footer justify-content-center">
              <button type="button" 
                class="btn btn-my2-color border border-white" 
                data-bs-dismiss="modal">
                Fechar
              </button>

            </div>

          </div>

        </div>

      </div>

      <!-- Modal Cadastro de Produto -->
      <div class="modal fade" id="modal_new_product" tabindex="-1" 
        aria-labelledby="New Product" aria-hidden="true">
        <div class="modal-dialog modal-dialog-scrollable modal-lg">
          <div class="modal-content">
            <div class="modal-header">
              <h5 class="modal-title">Novo Produto</h5>
                <button type="button" class="close" 
                  data-bs-dismiss="modal" aria-label="Close">
                  <i class="far fa-times-circle text-white" 
                    aria-hidden="true"></i>
                </button>

              </div>
              <div class="modal-body">
                <form action="new_product.php" method="POST">
                  <div class="form-group">
                    <label>Nome do Produto</label>

                    <input class="form-control" type="text" 
                      name="name_product" placeholder="Digite o nome do produto..." 
                    alt="Informe o nome do produto" required>

                  </div>

                  <div class="form-group">
                    <label>Descrição</label>

                    <textarea class="form-control" type="textarea" 
                      name="description_product" 
                      placeholder="Digite algumas informaÃ§Ãµes..."
                    alt="Informe algumas informaÃ§Ãµes sobre o produto" 
                    row="4" required></textarea>

                  </div>

                  <div class="form-group">
                    <label>Categoria</label>

                    <select 
                      class="form-select"
                      type="text" 
                      name="category_product" 
                      aria-label="Digite o nome da categoria..."
                      alt="Informar o nome da categoria."
                      required
                    >
                      <option selected>Selecione a categoria</option>
                      <option value="1">Alimentos</option>
                      <option value="2">Roupas</option>
                      <option value="3">Acessorios</option>
                      <option value="3">Eletrônicos</option>
                    </select>

                  </div>

                  <div class="form-group">
                    <label>Valor</label>

                    <input class="form-control" type="float" 
                      name="value_product" 
                      placeholder="Digite o valor do produto..." 
                      alt="Informe o valor do produto" required>

                  </div>

                  <div class="form-group">
                    <label>Estoque</label>

                    <input class="form-control" type="number"
                      name="stock_product" min=1 
                      placeholder="Digite o nÃºmero no estoque..." 
                      alt="Informe o nÃºmero no estoque" required>

                  </div>

                  <button type="submit" class="mb-5 btn btn-my6-color">
                    Confirmar
                  </button>

                </form>

              </div>
              <div class="modal-footer justify-content-center">
                <button type="button" 
                  class="btn btn-my2-color border border-white" 
                  data-bs-dismiss="modal">Fechar</button>

              </div>

            </div>

          </div>

        </div>

      </div>

    </main>
    <footer class="text-muted text-center text-small">
      <p class="mb-1">&copy; 2021-2025 Good Game Team Inc.</p>
      <ul class="list-inline">
        <li class="list-inline-item"><a href="#">Privacy</a></li>
        <li class="list-inline-item"><a href="#">Terms</a></li>
        <li class="list-inline-item"><a href="#">Support</a></li>
      </ul>

    </footer>
    <!-- Scripts -->
    <script type="text/javascript" src="./js/exGrafico.js"></script>
  </body>
</html>
