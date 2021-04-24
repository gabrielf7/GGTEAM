<%@include file="../minitemplates/abrir_page.jsp"%>
    <title> More Shop </title>

    <!-- My Styles -->
    <link href="${pageContext.request.contextPath}/app_src/css/global.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/app_src/css/welcome.css" rel="stylesheet">

  <%@include file="../minitemplates/fechar_head.jsp"%>
  <!-- Abre Body -->
    <%@include file="../minitemplates/mostrar_header.jsp"%>
    
    <main>

      <!-- Marketing messaging and featurettes -->
      <div class="container marketing">
        <!-- START THE FEATURETTES -->
        <div class="row featurette">
          <div class="col-md-7">
            <h2 class="featurette-heading">Procurando algo para comprar?
              <span class="text-muted"> Ache aqui.</span>
            </h2>
            <p class="lead">
              Na More Shop você encontra diversos produtos dos mais variados tipos.
              Encontre algo para comprar guiado pelas categorias logo abaixo.
            </p>
          </div>
          <div class="col-md-5">
            <img src="${pageContext.request.contextPath}/app_src/assets/landing.svg" 
              class="mt-5 col-sm-12" alt="img background"
            />
          </div>
        </div>

        <hr class="featurette-divider">
            
        <div class="container-fluid shadow-lg mb-5 bg-dark"> <!-- Tags do Scroll -->
          <div class="container">
            <div class="row">
              <div class="col-12 text-center">
                <nav id="navbarHorizontal" class="navbar navbar-light"> <!-- Posiï¿½ï¿½o das tags -->
                  <nav class="nav nav-pills">
                    <h5 class="text-center text-white">Veja mais:</h5>
                    <a class="nav-link active" href="#item1">#acessorios</a>
                    <a class="nav-link" href="#item2">#celulares</a>
                    <a class="nav-link" href="#item3">#fonedeouvido</a>
                    <a class="nav-link" href="#item4">#roupas</a>
                  </nav>
                </nav>
              </div>
            </div>
          </div>
        </div>
        <div class="container-fluid"><!-- Conteï¿½do do Scroll -->
          <div class="container">
            <div class="row">
              <div class="col-12">
                <div data-spy="scroll" data-target="#navbarHorizontal" 
                  id="navText" data-offset="0" 
                  class="scrollspySite border-left border-dark border-3 m p-3"
                >
                  <h4 id="item1 mb-3">Acessórios</h4>

                  <div class="card-group">
                    <div class="card my-card">
                      <img 
                        src="${pageContext.request.contextPath}/app_src/assets/fone-de-ouvido-bluetooth-preto.jpg" 
                        class="card-img-top" alt="Fone de ouvido bluetooth"
                      />
                      <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text">
                          Some quick example text to build on the card title 
                          and make up the bulk of the card's content.
                        </p>
                        <a href="#" class="btn btn-primary">Go somewhere</a>
                      </div>
                    </div>
                    <div class="card my-card">
                      <img 
                        src="${pageContext.request.contextPath}/app_src/assets/fone-de-ouvido-bluetooth-preto.jpg" 
                        class="card-img-top" alt="Fone de ouvido bluetooth"
                      />
                      <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text">
                          Some quick example text to build on the card title 
                          and make up the bulk of the card's content.
                        </p>
                        <a href="#" class="btn btn-primary">Go somewhere</a>
                      </div>
                    </div>
                    <div class="card my-card">
                      <img 
                        src="${pageContext.request.contextPath}/app_src/assets/fone-de-ouvido-bluetooth-preto.jpg" 
                        class="card-img-top" alt="Fone de ouvido bluetooth"
                      />
                      <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text">
                          Some quick example text to build on the card title 
                          and make up the bulk of the card's content.
                        </p>
                        <a href="#" class="btn btn-primary">Go somewhere</a>
                      </div>
                    </div>
                  </div>

                  <h5 id="item2">Celulares</h5>
                  <div class="card-group">
                    <div class="card my-card">
                      <img 
                        src="${pageContext.request.contextPath}/app_src/assets/fone-de-ouvido-bluetooth-preto.jpg" 
                        class="card-img-top" alt="Fone de ouvido bluetooth"
                      />
                      <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text">
                          Some quick example text to build on the card title 
                          and make up the bulk of the card's content.
                        </p>
                        <a href="#" class="btn btn-primary">Go somewhere</a>
                      </div>
                    </div>
                    <div class="card my-card">
                      <img 
                        src="${pageContext.request.contextPath}/app_src/assets/fone-de-ouvido-bluetooth-preto.jpg" 
                        class="card-img-top" alt="Fone de ouvido bluetooth"
                      />
                      <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text">
                          Some quick example text to build on the card title 
                          and make up the bulk of the card's content.
                        </p>
                        <a href="#" class="btn btn-primary">Go somewhere</a>
                      </div>
                    </div>
                    <div class="card my-card">
                      <img 
                        src="${pageContext.request.contextPath}/app_src/assets/fone-de-ouvido-bluetooth-preto.jpg" 
                        class="card-img-top" alt="Fone de ouvido bluetooth"
                      />
                      <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text">
                          Some quick example text to build on the card title 
                          and make up the bulk of the card's content.
                        </p>
                        <a href="#" class="btn btn-primary">Go somewhere</a>
                      </div>
                    </div>
                  </div>
                  
                  <h5 id="item3">Fone de Ouvido</h5>
                  <div class="card-group">
                    <div class="card my-card">
                      <img 
                        src="${pageContext.request.contextPath}/app_src/assets/fone-de-ouvido-bluetooth-preto.jpg" 
                        class="card-img-top" alt="Fone de ouvido bluetooth"
                      />
                      <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text">
                          Some quick example text to build on the card title 
                          and make up the bulk of the card's content.
                        </p>
                        <a href="#" class="btn btn-primary">Go somewhere</a>
                      </div>
                    </div>
                    <div class="card my-card">
                      <img 
                        src="${pageContext.request.contextPath}/app_src/assets/fone-de-ouvido-bluetooth-preto.jpg" 
                        class="card-img-top" alt="Fone de ouvido bluetooth"
                      />
                      <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text">
                          Some quick example text to build on the card title 
                          and make up the bulk of the card's content.
                        </p>
                        <a href="#" class="btn btn-primary">Go somewhere</a>
                      </div>
                    </div>
                    <div class="card my-card">
                      <img 
                        src="${pageContext.request.contextPath}/app_src/assets/fone-de-ouvido-bluetooth-preto.jpg" 
                        class="card-img-top" alt="Fone de ouvido bluetooth"
                      />
                      <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text">
                          Some quick example text to build on the card title 
                          and make up the bulk of the card's content.
                        </p>
                        <a href="#" class="btn btn-primary">Go somewhere</a>
                      </div>
                    </div>
                  </div>
                  
                  <h4 id="item4">Roupas</h4>
                  <div class="card-group">
                    <div class="card my-card">
                      <img 
                        src="${pageContext.request.contextPath}/app_src/assets/fone-de-ouvido-bluetooth-preto.jpg" 
                        class="card-img-top" alt="Fone de ouvido bluetooth"
                      />
                      <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text">
                          Some quick example text to build on the card title 
                          and make up the bulk of the card's content.
                        </p>
                        <a href="#" class="btn btn-primary">Go somewhere</a>
                      </div>
                    </div>
                    <div class="card my-card">
                      <img 
                        src="${pageContext.request.contextPath}/app_src/assets/fone-de-ouvido-bluetooth-preto.jpg" 
                        class="card-img-top" alt="Fone de ouvido bluetooth"
                      />
                      <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text">
                          Some quick example text to build on the card title 
                          and make up the bulk of the card's content.
                        </p>
                        <a href="#" class="btn btn-primary">Go somewhere</a>
                      </div>
                    </div>
                    <div class="card my-card">
                      <img 
                        src="${pageContext.request.contextPath}/app_src/assets/fone-de-ouvido-bluetooth-preto.jpg" 
                        class="card-img-top" alt="Fone de ouvido bluetooth"
                      />
                      <div class="card-body">
                        <h5 class="card-title">Card title</h5>
                        <p class="card-text">
                          Some quick example text to build on the card title 
                          and make up the bulk of the card's content.
                        </p>
                        <a href="#" class="btn btn-primary">Go somewhere</a>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <hr class="featurette-divider">

        <!-- Three columns of text below the carousel -->
        <div class="row">
          <h3 id="sobre" class="text-center mb-5">Sobre</h3>
          <div class="col-lg-4">
            IMAGE
            <h2>Autor 01</h2>
            <p>Some representative placeholder content for the three columns 
              of text below the carousel. This is the first column.</p>
            <p><a class="btn btn-secondary" href="#">View details</a></p>
          </div>
          <!-- /.col-lg-4 -->
          <div class="col-lg-4">
            IMAGE
            <h2>Autor 02</h2>
            <p>Another exciting bit of representative placeholder content. 
              This time, we've moved on to the second column.</p>
            <p><a class="btn btn-secondary" href="#">View details</a></p>
          </div>
          <!-- /.col-lg-4 -->
          <div class="col-lg-4">
            IMAGE
            <h2>Autor 03</h2>
            <p>And lastly this, the third column of representative placeholder content.</p>
            <p><a class="btn btn-secondary" href="#">View details</a></p>
          </div>
          <!-- /.col-lg-4 -->
        </div>
        <!-- /.row -->

      </div>
      <!-- /.container -->

      <div class="text-muted text-center text-small">
        <%@include file="/minitemplates/footer.jsp"%>
      </div>

    </main>
  <!-- Fecha Body -->
<%@include file="../minitemplates/fechar_page.jsp"%>
