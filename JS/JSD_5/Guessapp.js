const max=prompt("Enter the max value uptill the number goes");
const num= Math.floor(Math.random()*max)+1;
let ip=prompt("Make a guess");
while(true){
    if(num==ip){
        console.log("U guessedit right ", "The number is ", num);
        break;
    }
    else if(num!=ip){
        if(num>ip){
            console.log("The actual number is Greater then the number u guessed");
        }
    else{
            console.log("The actual number is smaller then the number u guessed");
        }
    }
    ip=prompt("Make aanother guess");
    if(ip=="Quit"){
        console.log("Quiting .. .. .. ");
        break;
    }
}
