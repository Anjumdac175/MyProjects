// 4.Create register page(Name,date of birth,phone,email,gender,language(checkbox),State(dropdown))
    //  and recieve data on server and repond "Got data"

    $("#myform").on("submit", function (e) {
        e.preventDefault();    

    let name = $("#sname").val();
    if(name.length < 5){
        alert("name should contain atleast 5 characters");
        return;
    }
    
    let contact = $("#phone").val();
    if(!/^[7-9]\d{9}$/.test(contact)){
        alert("Phone number should be 10 digits and start with 7/8/9");
        return;
    }

    let email = $("#mail").val();
    if(!/^\S+@\S+\.\S+$/.test(email)){
        alert("Invalid email it should be ex:abc@example.com");
        return;
    }

    const formData = {
        name : name,
        birth : $("#dob").val(),
        phone : contact,
        email : email,
        gender : $("input[name='gender']:checked").val(),
        language: $("input[name='lang']:checked").map(function () {
            return this.value;
        }).get(),        
        state : $("#state").val(),
    };

    $.ajax({
        url : "http://localhost:3000/register",
        type : 'POST',
        contentType : 'application/json', 
        data : JSON.stringify(formData),
        success: function(res){
           window.location.href = `details?id=${res.id}`;
        },
        error : function () {
            alert("Error while registering student");
        }
    });
});