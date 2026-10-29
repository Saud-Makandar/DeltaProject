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
/*savetoDB("apna college").then(()=>{
        console.log("promise resolved");
        savetoDB("collegeWallah").then(()=>{
           console.log("promise 2 is resolved");
           savetoDB("physicwallah").then(()=>{
           console.log("promise 3 is resolved");
           });
        });
    })
    .catch(()=>{
        console.log("promise rejected");
    });*/
    //improved Promise chaining
savetoDB("apna college").then(()=>{
        console.log("promise resolved");
        return savetoDB("collegeWallah");}
    )//is ka ek alag se then fn bana sakte h
    .then(()=>{
        console.log("promise 2 resolved");
        return savetoDB("physicwallah");
    })
    .then(()=>{
        console.log("promise 3 resolved");
    })
    .catch(()=>{
        console.log("promise rejected");
    });
