<%@include file="../../minitemplates/abrir_page.jsp"%>
    <title> Cadastar | More Shop </title>

    <!-- My Styles -->
    <link href="${pageContext.request.contextPath}/app_src/css/global.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/app_src/css/registered_client.css" rel="stylesheet">

  <%@include file="../../minitemplates/fechar_head.jsp"%>
  <!-- Abre Body -->
    <%@include file="../../minitemplates/mostrar_header.jsp"%>
    <main>
      <div class="container">
        <div class="row g-2">
          <div class="col-md-5 col-lg-5 h-50 d-flex justify-content-center">
            <img src="${pageContext.request.contextPath}/app_src/assets/user-bag.png" />
          </div>
          <div class="col-md-7 col-lg-7">
            
            <div class="mt-4 d-flex justify-content-between">
              <h2 class="mt-1 p-0">Crie sua conta</h2>
              <a class="mb-3 pl-3 pr-3 btn btn-primary btn-lg" 
                href="${pageContext.request.contextPath}/Registered?add=Collaborator"
              >
                Criar uma conta de empresa
              </a>
            </div>
              
            <hr class="my-2">

            <p id="messageErroCadastro"></p>
            
            <form name="FormUsuario"
              action="${pageContext.request.contextPath}/Registered" method="POST"
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
                         />
                  <input type="text" aria-label="Estado" class="form-control"
                         name="estado_user" placeholder="Seu estado"
                         />
                </div>
              </div>

              <hr class="my-4">
              <button class="w-100 p-2 btn btn-success btn-lg" 
                      type="submit">Confirmar o cadastro
              </button>
            </form>
            <div class="pt-5 text-muted text-center text-small">
              <%@include file="../../minitemplates/footer.jsp"%>
            </div>
          </div>
        </div>
      </div>

    </main>
    <!-- My Script -->
    <script src="${pageContext.request.contextPath}/app_src/js/registered_client.js"></script>
  <!-- Fecha Body -->
<%@include file="../../minitemplates/fechar_page.jsp"%>
