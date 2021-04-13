<%@include file="../minitemplates/abrir_page.jsp"%>
    <title> More Shop </title>

    <!-- My Styles -->
    <link href="${pageContext.request.contextPath}/css/global.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/welcome.css" rel="stylesheet">

  <%@include file="../minitemplates/fechar_head.jsp"%>
  <!-- Abre Body -->
    <%@include file="../minitemplates/mostrar_header.jsp"%>
    
    <main>

      <!-- Marketing messaging and featurettes -->
      <div class="container marketing">
        <!-- START THE FEATURETTES -->
        <div class="row featurette">
          <div class="col-md-7">
            <h2 class="featurette-heading">Está procurando uma loja?
              <span class="text-muted"> Ache ela aqui.</span>
            </h2>
            <p class="lead">
              Na More Shop você encontra diversas lojas parceiras dos mais variados tipos.
              Visite as lojas clicando nos cards logo abaixo. Seja parceiro comercial se cadastrando 
              <a type="button" 
                href="${pageContext.request.contextPath}/Login"
              >
                nesse link.
              </a>
            </p>
          </div>
          <div class="col-md-5">
            <img class="mt-5 col-sm-12" src="${pageContext.request.contextPath}/assets/landing.svg" alt="img background">
          </div>
        </div>

        <hr class="featurette-divider">
        <!-- /END THE FEATURETTES -->
        <!-- Three columns of text below the carousel -->
        <div class="row">
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
