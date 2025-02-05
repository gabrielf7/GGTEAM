<%@include file="/minitemplates/abrir_page.jsp"%>
    <title> Colaborador | MoreShop </title>

    <!-- My Styles -->
    <link href="${css}/global.css" rel="stylesheet">
    <link href="${css}/collaborator.css" rel="stylesheet">

  <%@include file="/minitemplates/fechar_head.jsp"%>
  <!-- Abre Body -->
    <%@include file="/minitemplates/mostrar_header.jsp"%>
    <main class="container my_container_main mt-3">
      <h1 class="text-center">Ol� ${UserName}, seja bem vindo.</h1>
      <div class="row">
        <div class="col-lg-5 col-sm-12">

          <button class="col-lg-12 col-sm-12 p-lg-2 mt-3 btn btn-outline-danger" 
            type="button" data-bs-toggle="modal" 
            data-bs-target="#modal_new_product"
          >
            Adicionar Produto
          </button>

        </div>

        <div class="col-lg-7">
          <img class="mt-5 col-sm-12" 
            src="${assets}/landing.svg" 
            alt="img background" 
          />
        </div>

      </div>


      <!-- Modal Cadastro de Produto -->
      <div class="modal fade" id="modal_new_product" tabindex="-1" 
           aria-labelledby="New Product" aria-hidden="true">
        <div class="modal-dialog modal-dialog-scrollable modal-lg">
          <div class="modal-content">
            <div class="modal-header">
              <h5 class="modal-title">Novo Produto</h5>
              <button type="button" class="btn-close" 
                data-bs-dismiss="modal" aria-label="Close">
              </button>

            </div>
            <div class="modal-body">
              <form action="${ctx}/CadProduto" 
                method="POST"
              >
                <div class="form-group">
                  <label>Nome do Produto</label>

                  <input class="form-control" type="text" 
                    name="name_product" placeholder="Digite o nome do produto..." 
                    alt="Informe o nome do produto" required 
                  />

                </div>

                <div class="form-group">
                  <label>Descri��o</label>

                  <textarea class="form-control" type="textarea" 
                    name="description_product" 
                    placeholder="Digite algumas informa��es..."
                    alt="Informe algumas informa��es sobre o produto" 
                    row="4" required
                  ></textarea>

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
                    <option value="3">Eletr�nicos</option>
                  </select>

                </div>

                <div class="form-group">
                  <label>Valor</label>

                  <input class="form-control" type="text" 
                    name="value_product" 
                    placeholder="Digite o valor do produto..." 
                    alt="Informe o valor do produto" required
                  />

                </div>

                <div class="form-group">
                  <label>Estoque</label>

                  <input class="form-control" type="text"
                    name="stock_product" min=1 
                    placeholder="Digite o numero no estoque..." 
                    alt="Informe o quantos tem no estoque" required
                  />

                </div>

                <button type="submit" class="mt-4 btn btn-success">
                  Confirmar
                </button>

              </form>

            </div>
            <div class="modal-footer justify-content-center">
              <button type="button" 
                class="btn btn-my2-color border border-white" 
                data-bs-dismiss="modal"
              >
                Fechar
              </button>

            </div>

          </div>

        </div>

      </div>

    </main>
    <div class="text-muted text-center text-small">
      <%@include file="/minitemplates/footer.jsp"%>
    </div>
  <!-- Fecha Body --> 
<%@include file="/minitemplates/fechar_page.jsp"%>
