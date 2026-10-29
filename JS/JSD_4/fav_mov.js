let fav_mov="Dil Toh Pagal Hai";
while(1){
    let guess=prompt("Enter Your movie choice");
    if(guess==fav_mov){
        console.log("Oye jit gaye oye !");
        break;
    }
    else if(guess==-1){
        console.log("User exit .. .. ");
        break;
    }
}