const form = document.getElementById("myform");
const res = document.getElementById("result");

form.addEventListener('submit', async (event) =>{
    event.preventDefault();

    const formData = new FormData(form);
    const data = {
        num1 : formData.get('num1'),
        num2 : formData.get('num2'),
        operation : formData.get('operation')
    };

    const response = await fetch('/calculate',{
        method : 'POST',
        headers : {'content-type':'application/json'},
        body : JSON.stringify(data) 

    });

    const result = await response.json();
    if(response.ok){
        res.textContent = `Result : ${result.result}`;
    }else{
        res.textContent = `Error : ${result.error}`;
    }
});