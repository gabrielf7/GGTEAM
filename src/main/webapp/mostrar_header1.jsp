<header>

  <nav class="navbar navbar-expand-lg text-success my-bg"> <!-- bg-primary -->
    <div class="container-fluid nav-container-fluid">
      <div class="my-navbar-brand">
        <a class="navbar-brand" 
          href="${pageContext.request.contextPath}/"
        >
          <img class="logoSvg"
            src="${pageContext.request.contextPath}/assets/logoIcon01.svg" 
            alt="logo"
          />
          <img class="logo" 
            src="${pageContext.request.contextPath}/assets/logo.png" 
            alt="Logo"
          />
        </a>
      </div>

      <button class="navbar-toggler bg-my6-color btn btn-success text-white" 
        type="button" 
        data-bs-toggle="collapse" 
        data-bs-target="#navbarMain" 
        aria-controls="navbarMain" 
        aria-expanded="false" aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse mb-2" 
        id="navbarMain"
      >
        <ul class="navbar-nav me-auto">
          <li class="nav-item me-2">
            <a class="nav-link active" aria-current="page"
              href="${pageContext.request.contextPath}/"
            >
              Home
            </a>
          </li>
          <li class="nav-item me-2">
            <a class="nav-link" href="#">Sobre</a>
          </li>
          <li class="nav-item me-2">
            <a class="nav-link" 
              href="${pageContext.request.contextPath}/ListaCategoria"
            >
              Categoria
            </a>
          </li>
          <li class="nav-item me-2">
            <a class="nav-link" 
              href="${pageContext.request.contextPath}/ListaProduto"
            >
              Produtos
            </a>
          </li>
          <li class="nav-item me-5">
            <a class="nav-link" 
              href="${pageContext.request.contextPath}/Lojas"
            >
              Lojas
            </a>
          </li>
        </ul>
        <div class="d-flex">
          <form class="d-flex justify-content-evenly">
            <input class="form-control me-2" type="search" placeholder="Search" 
              aria-label="Search" 
            />
            <button class="btn btn-primary me-2 p-2" type="submit">Pesquisa</button>
          </form>

          <a class="ml-5" type="button" 
            href="${pageContext.request.contextPath}/Login"
          >
            <img
              src="${pageContext.request.contextPath}/assets/conta-user.png" 
              alt="User"
              style="height: 32px; width: 32px;"
            />
          </a>
        </div>
      </div>
    </div>
  </nav>

</header>