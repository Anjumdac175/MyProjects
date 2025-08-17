// var marks = [45,78,68,54,29];
// var sum = 0;
// for(var val of marks){
//     console.log(val);
//     sum = sum + val;
// }

// var avg = sum/marks.length;
// console.log(avg);

var prices = [250,645,300,900,50];
var i = 0;
for(var val of prices){
   var discountAmount = val - val * 0.1;
    prices[i] = discountAmount;
    i++;
}
for(var final of prices){
    console.log(final);
}