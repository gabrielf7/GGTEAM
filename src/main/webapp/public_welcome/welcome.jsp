<%@include file="../minitemplates/abrir_page.jsp"%>
    <title> More Shop </title>

    <!-- My Styles -->
    <link href="${css}/global.css" rel="stylesheet">
    <link href="${css}/welcome.css" rel="stylesheet">

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
            <img src="${assets}/landing.svg" 
              class="mt-5 col-sm-12" alt="img background"
            />
          </div>
        </div>

        <hr class="featurette-divider">
          
        <div class="container">
          <div class="row">
            <div class="col-6 text-center">
              <form class="d-flex align-items-center">
                <input type="search" class="form-control" placeholder="Search...">
                <button class="my-button-search p-2" type="submit">Pesquisa</button>
              </form>
            </div>
            <div class="col-6 text-center d-flex flex-row-reverse bd-highlight">
              <nav id="navbarHorizontal" class="navbar navbar-light"> <!-- Posição das tags -->
                <nav class="nav nav-pills">
                  <a class="nav-link active" href="#item1">#acessorios</a>
                  <a class="nav-link" href="#item2">#celulares</a>
                  <a class="nav-link" href="#item3">#fonedeouvido</a>
                  <a class="nav-link" href="#item4">#roupas</a>
                </nav>
              </nav>
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
                  <section class="mb-2">
                    <h4 id="item1 mb-3">Acessórios</h4>

                    <div class="card-group" style="width: 250px;">
                      <div class="card"> 
                        <div class="d-flex justify-content-center">
                          <img 
                            width="224px" height="224px"
                            src="${assets}/fone-de-ouvido-bluetooth-preto.jpg" 
                            class="card-img-top" alt="Fone de ouvido bluetooth"
                          />
                        </div>
                            <form action="${ctx}/Shop" method="POST">
                                <input hidden type="text" name="carrinho_fone" value="fone de ouvido" >

                            
                                <div class="card-body">
                                    <h1 class="card-title pricing-card-title">
                                      R$ 150<small class="text-muted fw-light">,90</small>
                                    </h1>
                                    <p>6x 25 sem juros</p>

                                    <div class="d-flex justify-content-between">
                                      <a href="#" type="button" class="btn btn-primary mr-2">Comprar</a>
                                      <button class="btn btn-primary ml-4" type="submit">Adicionar ao carrinho </button>
                                  
                                      
                                    
                                    </div>
                                    <hr />
                                    <p class="card-text">
                                      Fone de Ouvido com bloqueador de som externo.
                                    </p>
                                </div>
                            </form>
                            
                        
                      </div>
                                
                                
                    </div>
                  </section>
                                <br><br><br>
                  <section>
                    <h5 id="item2">Celulares</h5>
                    <div class="card-group" style="width: 250px;">
                        
                        <div class="card"> 
                        <div class="d-flex justify-content-center">
                          <img 
                            width="224px" height="224px"
                            src="${assets}/smartphone-xiaomi.png" 
                            class="card-img-top" alt="Fone de ouvido bluetooth"
                          />
                        </div>
                            <form action="${ctx}/Shop" method="POST">
                                <input hidden type="text" name="carrinho_celular" value="Xiaomi Redmi note 9" >

                            
                                <div class="card-body">
                                    <h1 class="card-title pricing-card-title">
                                      R$ 150<small class="text-muted fw-light">,90</small>
                                    </h1>
                                    <p>6x 25 sem juros</p>

                                    <div class="d-flex justify-content-between">
                                      <a href="#" type="button" class="btn btn-primary mr-2">Comprar</a>
                                      <button class="btn btn-primary ml-4" type="submit">Adicionar ao carrinho </button>
                                  
                                      
                                    
                                    </div>
                                    <hr />
                                    <p class="card-text">
                                      Fone de Ouvido com bloqueador de som externo.
                                    </p>
                                </div>
                            </form>
                            
                        
                      </div>
                        
                    </div>
                  </section>
                  
                  <section>
                    <h5 id="item3">Fone de Ouvido</h5>
                    <div class="card-group">

                    </div>
                  </section>
                  
                  <section>
                    <h5 id="item4">Roupas</h5>
                    <div class="card-group">

                    </div>
                  </section>
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
