let arr=[5,10,15,20,25,3];
let ans=arr.every((ele)=>{
    return ele%10==0;
});
console.log(ans);
let min=arr.reduce((min,ele)=>{
    if(min>ele){
        return ele;
    }
    else return min;
});
console.log(min);