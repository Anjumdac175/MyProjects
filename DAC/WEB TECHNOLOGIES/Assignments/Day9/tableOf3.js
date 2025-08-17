// 2.Write a code to write table of 3 to file
const fs = require("fs/promises");

async function tableOf3() {
    let result = '';
    for(let i =1; i <= 10; i++){
        result += `3 * ${i} = ${3 * i}\n`;
    }
    fs.writeFile("table.txt", result)
    .then( () => {
        console.log("Table of 3 is added into file..");
    })
    .catch((err) => {
        console.log("Error while writing into file",err);
    });  
}

tableOf3();