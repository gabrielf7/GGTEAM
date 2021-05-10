function carregar(User, Profile) {
  if (User !== "") {
    document.getElementById("AreaUser01").innerHTML = `
      <p>Bem vindo, ${User}</p>
    `;
    console.log(Profile);
    if (Profile === "Client") {
      document.getElementById("AreaUser02").href = `${Profile}`;
    } else if (Profile === "Collaborator") {
      document.getElementById("AreaUser02").href = `${Profile}`;
    }
    document.getElementById("AreaUser02").innerHTML = "Seu Perfil";

    document.getElementById("AreaUser03").href = "Logout";
    document.getElementById("AreaUser03").innerHTML = "Sair";
  } else {
    return null;
  }
}