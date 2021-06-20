<%@include file="../../minitemplates/abrir_page.jsp"%>
    <title> Cadastrar | More Shop </title>

    <!-- My Styles -->
    <link href="${css}/global.css" rel="stylesheet">
    <link href="${css}/registered_client.css" rel="stylesheet">

  <%@include file="../../minitemplates/fechar_head.jsp"%>
  <!-- Abre Body -->
    <%@include file="../../minitemplates/mostrar_header.jsp"%>
    <main>
      <div class="container">
        <div class="row g-2">
          <div class="col-md-5 col-lg-5 h-50 d-flex justify-content-center">
            <img src="${assets}/user-bag.png" />
          </div>
          <div class="col-md-7 col-lg-7">
            
            <div class="mt-4 d-flex justify-content-between">
              <h2 class="mt-1 p-0">Crie sua conta</h2>
              <a class="mb-3 pl-3 pr-3 btn btn-primary btn-lg" 
                href="${ctx}/Registered"
              >
                Crie uma conta pessoal
              </a>
            </div>
              
            <hr class="my-2">

            <p id="messageErroCadastro"></p>
            
            <form name="FormUsuario"
              action="${ctx}/CLBRegistered" 
              method="POST"
              class="needs-validation"
            >
              <div class="row">
                <div class="input-group">
                  <span class="input-group-text">Nome completo</span>
                  <input type="text" aria-label="Primeiro nome" 
                    class="form-control"
                    name="nome_user" placeholder="Primeiro nome"
                    required
                  />
                  <input type="text" aria-label="Sobrenome" 
                    class="form-control"
                    name="sobrenome_user" placeholder="Sobrenome"
                    required
                  />
                  <div class="invalid-feedback">
                    Por favor, informe o nome completo.
                  </div>
                </div>

                <div class="col-12">
                  <label for="cnpj" class="form-label">CNPJ</label>
                  <input type="text" class="form-control" id="cnpj" 
                    name="cnpj_user" placeholder="Seu CNPJ"
                    required 
                  />
                  <div class="invalid-feedback">
                    Por favor, informe seu cnpj.
                  </div>
                </div>
                
                <div class="col-12">
                  <label for="razaoSocial" class="form-label">
                    Razão social
                  </label>
                  <input type="text" class="form-control" id="razaoSocial" 
                    name="razaosocial_user" placeholder="Sua razão social"
                    required 
                  />
                  <div class="invalid-feedback">
                    Por favor, informe seu razão social.
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
            <div class="pt-5 text-muted text-center text-small">
              <%@include file="../../minitemplates/footer.jsp"%>
            </div>
          </div>
        </div>
      </div>

    </main>
    <!-- My Script -->
    <script src="${js}/registered_collaborator.js"></script>
  <!-- Fecha Body -->
<%@include file="../../minitemplates/fechar_page.jsp"%>
