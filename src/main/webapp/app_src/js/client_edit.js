/* global bool */

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
var cont = 0;
let input = document.getElementsByTagName('input');
let insertD = getParameter('insertdbd');
if (insertD === 'true') {
  let buttonToEdit = document.getElementById('buttonToEdit');
  buttonToEdit.innerHTML = `
    <button class="w-100 p-2 btn btn-success btn-lg"
      type="submit">Confirmar o cadastro
    </button>
  `;
} else {
  for(cont; cont <= (input.length - 1); cont++) {
    input[0].disabled = false;
    input[cont].disabled = true;
  }
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
