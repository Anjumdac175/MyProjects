function display(){
    var name = document.getElementById("pizzaname").value;
    var pizzatopping = document.getElementsByName("topping");
    var ptoping;
    for(var i = 0; i < pizzatopping.length; i++){
        if(pizzatopping[i].checked){
            ptoping = pizzatopping[i].value;
            break;
        }
    }

    var pizzasauce = document.getElementById("psauce").value;
    var pextras = document.getElementsByName("extras");
    var extratoping = [];
    for( var i = 0; i < pextras.length; i++){
        if(pextras[i].checked){
            extratoping.push(pextras[i].value);
        }
    }
    var suggest = document.getElementById("instructions").value;

    var htmlStr = `<tr>
                        <td>${name}</td>
                        <td>${ptoping}</td>
                        <td>${pizzasauce}</td>
                        <td>${extratoping.join(" , ")}</td>
                        <td>${suggest}</td>
                    </tr>`

    document.getElementById("printdata").innerHTML += htmlStr;
    console.log(htmlStr);
}