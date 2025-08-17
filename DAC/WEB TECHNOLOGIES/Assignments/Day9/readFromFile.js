// Read data from file(create a dummy file and write some data in it)
const fs = require("fs/promises");
async function readFromFile() {
   try{
        const data = await fs.readFile("table.txt",'utf8');
        console.log("Content of table are: ");
        console.log(data);
   }catch (err) {
        console.log("Error while reading from file:",err);
   }
}

readFromFile();