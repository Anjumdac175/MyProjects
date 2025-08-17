// 1.Write a code to print fibonacci number till 100 

async function Fibnocci() {

    let num1 = 0, num2 = 1;
    console.log("Fibonacci Series until 100");
    while(num1 <= 100){
        console.log(num1);
        let temp = num1 + num2;
        num1 = num2;
        num2 = temp;
    }
    
}

await Fibnocci();