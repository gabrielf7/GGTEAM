<%@include file="../minitemplates/abrir_page.jsp"%>
    <title> Editar Perfil | More Shop </title>

    <!-- My Styles -->
    <link href="${css}/global.css" rel="stylesheet">
    <link href="${css}/client.css" rel="stylesheet">
    
  <%@include file="../minitemplates/fechar_head.jsp"%>
  <!-- Abre Body -->
    <%@include file="../minitemplates/mostrar_header.jsp"%>
    
    <main>      
      <div class="container">
        <div class="row">
          <div class="col-3 mt-5 h-50 d-flex flex-column justify-content-center">
            <a type="button" href="${ctx}/ClientEdit?usr=${IdUser}" class="btn btn-outline-secondary">Editar perfil</a>
            <a type="button" href="${ctx}/MyShopping" class="btn btn-outline-secondary">Minhas Compras</a>
            <a type="button" href="${ctx}/MyShopping" class="btn btn-outline-secondary">Histórico</a>
            <a type="button" href="${ctx}/Logout" class="btn btn-outline-secondary">Sair</a>
          </div>
          <div class="col-9">
            <div class="mt-4 d-flex justify-content-between">
              <h3>Informações do(a) ${UserName}</h3>
              <a class="mb-3 pl-3 pr-3 btn btn-primary btn-lg" 
                href="${ctx}/ClientEdit?usr=${IdUser}&insertdbd=true"
              >
                Atualizar Perfil
              </a>
            </div>
            <form name="FormUsuario"
              action="${ctx}/ClientEdit?usr=${IdUser}&acao=atualizar" method="POST"
              class="needs-validation"
            >
              <div class="row">
                <div class="input-group">
                  <span class="input-group-text">Nome completo</span>
                  <input type="text" aria-label="Primeiro nome" class="form-control"
                    name="nome_user" placeholder="Primeiro nome"
                    value="${perfil.nome}"
                    required
                  />
                  <input type="text" aria-label="Sobrenome" class="form-control"
                    name="sobrenome_user" placeholder="Sobrenome"
                    value="${perfil.sobrenome}"
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
                      value="${perfil.nickname}"
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
                    value="${perfil.email}"
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
                    value="${perfil.senha}"
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
                    value="${perfil.cpf}"
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
                    value="${perfil.cidade}"
                  />
                  <input type="text" aria-label="Estado" class="form-control"
                    name="estado_user" placeholder="Seu estado"
                    value="${perfil.estado}"
                  />
                </div>
              </div>

              <hr class="my-4">
              <div id="buttonToEdit">
              </div>
              
            </form>
          </div>
        </div>
      </div>
    </main>
    
    <div class="pt-5 text-muted text-center text-small">
      <%@include file="../minitemplates/footer.jsp"%>
    </div>
    <!-- My Script -->
    <script src="${js}/client_edit.js"></script>
  <!-- Fecha Body -->
<%@include file="../minitemplates/fechar_page.jsp"%>