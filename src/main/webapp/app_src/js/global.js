function carregar(User, Profile, MyUrl, MyUrlName) {
  if (User !== "") {
    document.getElementById("AreaUser01").innerHTML = `
      <p>Bem vindo, ${User}</p>
    `;
    
    if ((MyUrl === "MyShopping") || (MyUrl === "MyProducts")) {
      document.getElementById("AreaUser00").href = `${MyUrl}`;
      document.getElementById("AreaUser00").innerHTML = `${MyUrlName}`;
      document.getElementById("AreaUser00").setAttribute("class", "nav-link");
    }

    if (Profile === "Client") {
      document.getElementById("AreaUser02").href = `${Profile}`;
    } else if (Profile === "Collaborator") {
      document.getElementById("AreaUser02").href = `${Profile}`;
    } else if (Profile === "Administrador") {
      document.getElementById("AreaUser02").href = `${Profile}`;
    }
    document.getElementById("AreaUser02").innerHTML = "Seu Perfil";

    document.getElementById("AreaUser03").href = "Logout";
    document.getElementById("AreaUser03").innerHTML = "Sair";
  } else {
    return null;
  }
}