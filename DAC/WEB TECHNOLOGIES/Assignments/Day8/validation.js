
        function validateName() {
            var name = document.getElementById("mname").value;
            document.getElementById("name_error").innerHTML = "";
            if (name.length < 5) {
                document.getElementById("name_error").innerHTML = "Name should be at least 5 characters"
                return;
            }
            else {
                return name;
            }
        }
        function validateActor() {
            var actor = document.getElementById("mactor").value;
            document.getElementById("actor_error").innerHTML = "";
            if (actor.length < 3) {
                document.getElementById("actor_error").innerHTML = "Name should be at least 5 characters"
                return;
            }
            else {
                return actor;
            }
        }

        function display() {


            var release = document.getElementById("release").value;
            var mtype = document.getElementsByName("mtype");
            console.log(mtype);
            var type = [];
            for (i = 0; i < mtype.length; i++) {
                if (mtype[i].checked) {
                    type.push(mtype[i].value);
                }
            }

            var language = document.getElementsByName("lang");
            var mlang;
            if (language[0].checked) {
                mlang = language[0].value;
            }
            else if (language[1].checked) {
                mlang = language[1].value;
            }
            else if (language[2].checked) {
                mlang = language[2].value;
            }
            console.log(language);
            var show = document.getElementById("show").value;

            var validName = validateName();
            var validActor = validateActor();
            if (validName && validActor) {
                var htmlstr = `<tr>
                                <td>${validName}</td>
                                <td>${validActor}</td>
                                <td>${release}</td>
                                <td>${type}</td>
                                 <td>${mlang}</td>
                                <td>${show}</td>
                        </tr>`
                document.getElementById("tabledata").innerHTML += htmlstr;

                document.getElementById("myform").reset();
                document.getElementById("name_error").innerText = "";
                document.getElementById("actor_error").innerText = "";
            }
        }