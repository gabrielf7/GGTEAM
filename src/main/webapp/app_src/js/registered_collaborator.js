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
let message = document.getElementById("messageErroCadastro");
let valorCLB = getParameter('addclb');
let nvalorCLB = getParameter('naddclb');
if (valorCLB === "true") {
  message.setAttribute("class", "w-100 mt-1 btn btn-warning btn-lg");
  message.innerHTML = "Erro no cadastro, o Email, CNPJ ou Razão Social já se encontra cadastrado.";
} else if (nvalorCLB === "false" ) {
  message.setAttribute("class", "w-100 mt-1 btn btn-danger btn-lg");
  message.innerHTML = "Erro no cadastro, o campo importante do formulário está vazio.";
}

// Example starter JavaScript for disabling form submissions if there are invalid fields
(function () {
  'use strict';

  // Fetch all the forms we want to apply custom Bootstrap validation styles to
  var forms = document.querySelectorAll('.needs-validation');

  // Loop over them and prevent submission
  Array.prototype.slice.call(forms)
    .forEach(function (form) {
      form.addEventListener('submit', function (event) {
        if (!form.checkValidity()) {
          event.preventDefault();
          event.stopPropagation();
        }

        form.classList.add('was-validated');
      }, false);
    });
})();
