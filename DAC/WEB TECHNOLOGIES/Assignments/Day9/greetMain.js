
const { greeting } = require("./greetings");
async function main() {
    const message = await greeting();
    console.log(message);
}
main();