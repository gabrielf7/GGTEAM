<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% //<jsp:useBean id="dao" class=""/> %>

<%@include file="../minitemplates/abrir_page.jsp"%>
    <title> Produtos | More Shop</title>

    <!-- My Scritps Remote -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.4/Chart.min.js"></script>

    <!-- My Styles -->
    <link href="${pageContext.request.contextPath}/app_src/css/global.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/app_src/css/list_product.css" rel="stylesheet">
    
  <%@include file="../minitemplates/fechar_head.jsp"%>
  <!-- Abre Body -->
    <%@include file="../minitemplates/mostrar_header.jsp"%>
    <main class="container my_container_main mt-3">

      <div class="row">

        <table class="table table-striped">
          <thead>
            <tr>
              <th scope="col">#</th>
              <th scope="col">Nome</th>
              <th scope="col">Descricao</th>
              <th scope="col">Categoria</th>
              <th scope="col">Valor</th>
              <th scope="col">Estoque</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>${produto.id}</td>
              <td>${produto.nome}</td>
              <td>${produto.descricao}</td>
              <td>${produto.categoria}</td>
              <td>${produto.valor}</td>
              <td>${produto.estoque}</td>
            </tr>
            <% //<c:forEach var="produto" items="${dao.produtos}"></c:forEach> %>
          </tbody>
        </table>

      </div>

      <!-- Modal Cadastro de Produto -->
      <div class="modal fade" id="modal_new_product" tabindex="-1" 
           aria-labelledby="New Product" aria-hidden="true">
        <div class="modal-dialog modal-dialog-scrollable modal-lg">
          <div class="modal-content">
            <div class="modal-header">
              <h5 class="modal-title">Novo Produto</h5>
              <button type="button" class="close" 
                data-bs-dismiss="modal" aria-label="Close"
              >
                <i class="far fa-times-circle text-white" aria-hidden="true">  
                </i>
              </button>

            </div>
            <div class="modal-body">
              <form action="${pageContext.request.contextPath}/Home" method="POST">
                <div class="form-group">
                  <label>Nome do Produto</label>

                  <input class="form-control" type="text" 
                    name="name_product" 
                    placeholder="Digite o nome do produto..." 
                    alt="Informe o nome do produto" required
                  />
                </div>

                <div class="form-group">
                  <label>Descrição</label>

                  <textarea class="form-control" type="textarea" 
                    name="description_product" 
                    placeholder="Digite algumas informações..."
                    alt="Informe algumas informações sobre o produto" 
                    row="4" required>
                  </textarea>

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
      <%@include file="../minitemplates/footer.jsp"%>
    </div>
  <!-- Fecha Body --> 
<%@include file="../minitemplates/fechar_page.jsp"%>
