function savetoDB(data){// it is just returning a promise 
     return new Promise((success,failure)=>{
        let internetspeed=Math.floor(Math.random()*10)+1;
        if(internetspeed>4){
            success("Data was saved");
        }
        else{
            failure("Failure : weak connection ");
        }
     });
}
savetoDB("apna college").then((result)=>{
        console.log("promise resolved");
        console.log(result);
        return savetoDB("collegeWallah");}
    )//is ka ek alag se then fn bana sakte h
    .then((result)=>{
        console.log("promise 2 resolved");
        console.log(result);
        return savetoDB("physicwallah");
    })
    .then((result)=>{
        console.log("promise 3 resolved");
        console.log(result);
    })
    .catch((error)=>{
        console.log("promise rejected");
        console.log(error);
    });
