function validateName(){
    var name = document.getElementById("pizzaname");
    var name_error = document.getElementById("nameError");
    if(name.value.length < 5){
        name_error.textContent = "Name must be atleast 5 characters.";
        name.style.borderColor = "red";
        return false;
    }
    name_error.textContent = "";
    name.style.borderColor = "green";
    return true;
}

function validateInstructions(){
    var suggest = document.getElementById("instructions");
    var suggest_error = document.getElementById("suggestError");
    var wordCount = suggest.value.trim().split(/\s+/).length;
    if(wordCount < 5){
        suggest_error.textContent = "Instructions must be more than 5 words..";
        suggest.style.borderColor = "red";
        return false;
    }
    suggest_error.textContent = "";
    suggest.style.borderColor = "green";
    return true;
}

function validateToppingSauceConflict(){
    var toppings = document.getElementsByName("topping");
    var ptopping = "";
    for(var top of toppings){
        if(top.checked){
            ptopping = top.value;
        }
    }

    var sauce = document.getElementById("psauce").value;

    if(sauce === "Tomato Sauce" && ptopping === "Supreme"){
        alert("Tomato Sauce cant be selected with Supreme Topping.");
        return false;
    }
    return true;
}


function display(){
    var name = document.getElementById("pizzaname").value;
    var toppings = "";
    document.getElementsByName("topping").forEach(t => {
        if(t.checked) toppings = t.value;
    });
    var sauce = document.getElementById("psauce").value;

    var extraadd = [];
    document.getElementsByName("extras").forEach( e => {
        if(e.checked) extraadd.push(e.value);
    });

    var suggest = document.getElementById("instructions").value;

    var htmlStr = `<tr>
                        <td>${name}</td>
                        <td>${toppings}</td>
                        <td>${sauce}</td>
                        <td>${extraadd}</td>
                        <td>${suggest}</td>
                    </tr>`

    document.getElementById("printdata").innerHTML += htmlStr;
}

document.getElementById("myform").addEventListener("submit", function(e){
    e.preventDefault();
    var isNameValid = validateName();
    var isInstructionValid = validateInstructions();
    var isComboValid = validateToppingSauceConflict();

    if(isNameValid && isInstructionValid && isComboValid){
        display();
        this.reset();
        document.getElementById("pizzaname").style.borderColor = "";
        document.getElementById("instructions").style.borderColor = "";
    }
});

document.getElementById("pizzaname").addEventListener("input",validateName);
document.getElementById("instructions").addEventListener("input",validateInstructions);
document.getElementById("psauce").addEventListener("change",validateToppingSauceConflict)
document.querySelectorAll("input[name = 'topping']").forEach( t => t.addEventListener("change",validateToppingSauceConflict));