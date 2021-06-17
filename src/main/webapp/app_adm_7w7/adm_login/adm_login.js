function getParameter(theParameter) {
  var params = window.location.search.substr(1).split('&');

  for (var i = 0; i < params.length; i++) {
    var p = params[i].split('=');
    if (p[0] === theParameter) {
      return decodeURIComponent(p[1]);
    }
  }
  return false;
}
let valorCLT = getParameter('adm');
if (valorCLT === "false") {
  let message = document.getElementById("messageErroLogin");
  message.setAttribute("class", "w-100 mt-1 btn btn-warning btn-lg");
  message.innerHTML = "Erro no login, usuário não encontrado";
}

