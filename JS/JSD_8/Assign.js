let arr=[1,2,3,4,5];
// let nums=(arr)=>{
//     return arr.reduce((sum,ele)=>{
//         return sum+ele**2;
//     })
// };
// console.log(nums);
let nums = arr.reduce((sum,ele)=>{
    return sum+ele**2;
});
console.log(nums);
let newarr=arr.map((ele)=>(ele+5));
let string=["Nemi","Saud","Sumit"];
let newString=string.map((ele)=>{
    return ele.toUpperCase();
});
function doubleAndReturnArgs(arr,...args){
    return args.map((ele)=>(ele*2));
} 