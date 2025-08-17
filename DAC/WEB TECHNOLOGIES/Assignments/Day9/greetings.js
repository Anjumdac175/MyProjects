// 5.Create a user defined local module greeting.js containing a function greet() that greets user based on time
// of the day. If its morning, greet user as "Good morning", if its afternoon, greet user as "Good
// Afternoon" else as "Good Evening"
// Create a main module that will bring in the greeting.js module and invoke the greet function (Try creating async function and await it)

const { resolve } = require("path");

function greeting() {
    return new Promise((resolve) => {
        const hour = new Date().getHours();
        let greet;

        if(hour < 12){
            greet = "Good Morning";
        }else if(hour < 18){
            greet = "Good Afternoon";
        }else{
            greet = "Good Evening";
        }

        setTimeout(() => resolve(greet),500);
    });
    
}

module.exports = {greeting};