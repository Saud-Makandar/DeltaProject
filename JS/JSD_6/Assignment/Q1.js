let arr=[5,10,15,20,25,30];
function greater(arr,num) {
    let arr=[];
    for(let i=0;i<arr.length;i++)
        {
            arr[i]=(Math.floor(Math.random()*10+num+1));
        }
    return arr;
}console