<%@include file="../minitemplates/abrir_page.jsp"%>
    <title> More Shop </title>

    <!-- My Styles -->
    <link href="${pageContext.request.contextPath}/app_src/css/global.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/app_adm_7w7/adm_7w7.css" rel="stylesheet">
    
  <%@include file="../minitemplates/fechar_head.jsp"%>
  <!-- Abre Body -->
    <%@include file="../minitemplates/mostrar_header.jsp"%>
    
    <h1 class="mb-5 mt-5 text-center">Administrador</h1>
    
    <main class="container">
      
      <div class="row">
        <div class="col-lg-6 col-sm-12">
          <button class="col-lg-4 col-sm-12 btn btn-outline-danger" 
            type="button" data-bs-toggle="modal" 
            data-bs-target="#modal_new_categoria"
          >
            Adicionar Categoria
          </button>

        </div>

      </div>
      
      <!-- Modal Cadastro de Categoria -->
      <div class="modal fade" id="modal_new_categoria" tabindex="-1" 
        aria-labelledby="New Categoria" aria-hidden="true"
      >
        <div class="modal-dialog modal-dialog-scrollable modal-lg">
          <div class="modal-content">
            <div class="modal-header">
              <h5 class="modal-title">Nova Categoria</h5>
              <button type="button" class="close" 
                data-bs-dismiss="modal" aria-label="Close"
              >
                <i class="far fa-times-circle text-white" aria-hidden="true"></i>
              </button>

            </div>
            <div class="modal-body">
              <form action="${pageContext.request.contextPath}/CadCategoria" method="POST">
                <div class="form-group">
                  <label>Nome da Categoria</label>

                  <input class="form-control" type="text" 
                    name="name_categoria" placeholder="Digite o nome da categoria" 
                    alt="Informe o nome da categoria" required 
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
    
    <div class="pt-5 text-muted text-center text-small">
      <%@include file="../minitemplates/footer.jsp"%>
    </div>
  <!-- Fecha Body -->
<%@include file="../minitemplates/fechar_page.jsp"%>