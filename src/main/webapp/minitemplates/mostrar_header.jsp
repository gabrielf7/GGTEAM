<header>

  <nav class="py-2 my-bg border-bottom">

    <div class="container d-flex flex-wrap">
      <ul class="nav my-nav me-auto">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page"
            href="${pageContext.request.contextPath}/"
          >
            Home
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="${pageContext.request.contextPath}/#sobre">Sobre</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" 
            href="${pageContext.request.contextPath}/Category"
          >
            Categoria
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" 
            href="${pageContext.request.contextPath}/Product"
          >
            Produtos
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" 
            href="${pageContext.request.contextPath}/Shop"
          >
            Lojas
          </a>
        </li>
      </ul>
      <div>
        <ul class="nav my-nav">
          <li class="nav-link mr-2" id="AreaUser01"></li>
          <li class="nav-item">
            <a href="${pageContext.request.contextPath}/Registered"
              class="nav-link btn btn-primary text-white pl-2 pr-2" 
              type="button" id="AreaUser02"
            >
              Cadastra-se
            </a>
          </li>
          <li class="nav-item">
            <a href="${pageContext.request.contextPath}/Login"
              class="nav-link pl-2 pr-2" 
              type="button" id="AreaUser03"
            >
              Faça Login
            </a>
          </li>
        </ul>
      </div>
    </div>

  </nav>
  <nav class="py-3 mb-1">

    <div class="container d-flex flex-wrap justify-content-center">
      <a href="${pageContext.request.contextPath}/" 
        class="d-flex align-items-center mb-md-0 me-md-auto"
      >
        <img class="logoSvg"
          src="${pageContext.request.contextPath}/app_src/assets/logoIcon01.svg" 
          alt="logo"
        />
        <img class="logo" 
          src="${pageContext.request.contextPath}/app_src/assets/logo.png" 
          alt="Logo"
        />
      </a>
      <form class="d-flex align-items-center col-12 col-lg-3 mb-lg-0">
        <input type="search" class="form-control me-2" placeholder="Search...">
        <button class="btn btn-primary my-button-search text-white p-2" type="submit">Pesquisa</button>
      </form>

    </div>

  </nav>

</header>