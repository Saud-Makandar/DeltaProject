let arr=[1,6,3,8];
console.log(arr);
let brr=[];
for(const ele of arr){
    brr.push(ele*ele);
}
console.log("The brr array is "+brr);
function twice(x){
    return 2*x;
}
let crr=arr.map(twice);
console.log(crr);
let br=arr.map(function(ele){
    return ele*ele*ele;
})
console.log(br);
 