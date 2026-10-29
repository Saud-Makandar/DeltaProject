let query = "INSERT INTO user (id, username, email, password) VALUES (?, ?, ?, ?)";//chaaron values ko alag se pass kar sakte h

// // let user=["96","196_newuser","abcdf@gmail","abdfdc"];

// try{
//     connection.query(query,user,(err,res)=>{
//     if(err)throw err;
//     console.log(res);
// });
// }catch(error){ 
//     console.log(error);
// }
// connection.end();