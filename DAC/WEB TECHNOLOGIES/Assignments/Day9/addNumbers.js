// 4.Write a code to read list of numbers from file and perform addition and write into another file
// (Create two file ,First file have comma seperated numbers )

const fs = require("fs/promises");
async function addNumbers() {
  const data = await fs.readFile('numbers.txt','utf8');
  const parts = data.split(",");
  let sum = 0;
  for(let i = 0; i < parts.length; i++){
    sum += Number(parts[i]);
    }

    await fs.writeFile('sumofNumber.txt',`Sum of Number is:  ${sum}`);

    console.log("Sum of numbers write into file...");
}

addNumbers();