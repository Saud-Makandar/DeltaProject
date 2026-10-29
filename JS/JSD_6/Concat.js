function concat(arr){
    let brr="";
    for(let i=0;i<arr.length;i++){
        brr+=arr[i];
    }
    return(brr);
}
let arr=["Saud " , "is ", "a ","good boy "];
console.log(concat(arr));