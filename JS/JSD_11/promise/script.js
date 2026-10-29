function savetoDB(data,success,failure){
    let internetspeed=Math.floor(Math.random()*10)+1;
    if(internetspeed>4) success();
    else failure();
}
savetoDB("apnaCollege",()=>{
    console.log("success: your data was saved");
    savetoDB("CollegeWallah",()=>{
    console.log("success2: your data2 was saved");},
    ()=>{
    console.log("Inner Failure : Poor network fial to save data 2");})
    },()=>{
    console.log("External Failure : Poor network fial to save data");
    });
    //This is what we call callback hell 