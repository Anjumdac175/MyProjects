//Filter
var marks = [85, 45, 95, 62, 87, 90];
var maxMarks = marks.filter((val) => {
    return val > 85;
});

console.log(maxMarks);

// for

var num = prompt("Enter a Number:");
var arr = [];
for(var i = 1; i <= num; i++){
    arr[i-1] = i;
}
console.log(arr);

// Reduce method
var sum = arr.reduce((res,val) => {
    return res + val;
});

console.log(`Sum of all numbers in Array is:${sum}`)

var fact = arr.reduce((res,val) => {
    return res * val;
});

console.log(`Factorial of all numbers in Array is:${fact}`)