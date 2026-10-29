function Prod(a,b,c){
    return a*b*c;
}
console.log(Prod(5,5,5));
function fun(x,y){
    console.log(x-y);
}
fun(Prod(3,8,9),7);//Prod is a call back function for the fun function