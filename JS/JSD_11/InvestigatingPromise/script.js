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
savetoDB("ApnaCollege");