document.getElementById("myform").addEventListener("submit",function(e){
    e.preventDefault();
    display();
});

document.getElementById("pizzaname").addEventListener("input",function(){
    console.log("Pizza Name: ",this.value);
});
 
var toppings = document.getElementsByName("topping");
for(var i = 0; i < toppings.length; i++){
    toppings[i].addEventListener("click",function(){
        console.log("Pizza Topping: ",this.value);
    });
}

document.getElementById("psauce").addEventListener("change",function(){
    console.log("Pizza Sauce: ",this.value);
});

var pextras = document.getElementsByName("extras");
for( var i = 0; i < pextras.length; i++){
    pextras[i].addEventListener("change",function(){
        console.log("Add Extras: ",this.value, this.checked);
    });
}

document.getElementById("instructions").addEventListener("input",function(){
    console.log("Suggestions: ", this.value);
});

function display(){
    var name = document.getElementById("pizzaname").value;
    var pizzatopping = document.getElementsByName("topping");
    var ptopping = "";
    for(var i = 0; i < pizzatopping.length; i++){
        if(pizzatopping[i].checked){
            ptopping = pizzatopping[i].value;
        }
    }

    var pizzasauce = document.getElementById("psauce").value;
    var extraadd = document.getElementsByName("extras");
    var pextra = [];
    for(var i = 0; i < extraadd.length; i++){
        if(extraadd[i].checked){
            pextra.push(extraadd[i].value);
        }
    }
    var suggest = document.getElementById("instructions").value;
    var htmlStr = `<tr>
                        <td>${name}</td>
                        <td>${ptopping}</td>
                        <td>${pizzasauce}</td>
                        <td>${pextra}</td>
                        <td>${suggest}</td>
                    </tr>`

    document.getElementById("printdata").innerHTML += htmlStr;
    console.log(htmlStr);
}