
document.getElementById("login-button").addEventListener("click", signin);

function signin() {
    var server = "http://localhost:8080";

    var mail = document.getElementById("inputEmail");
    var pass = document.getElementById("inputPassword");
    console.log(mail.value);

    var login_data = {
        "email": mail.value,
        "password": pass.value
    };


    function sendLoginData(string) {
        var xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function() {
           if (xhttp.readyState == 4 && xhttp.status == 200) {
              var elem = document.createElement("div");
              elem.id = "req";
              document.body.appendChild(elem);
              elem.innerHTML = xhttp.responseText;
            }
        };
        xhttp.open("POST",server, true);
        xhttp.send(string);
    }

    sendLoginData(JSON.stringify(login_data));

}