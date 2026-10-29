const mongoose = require("mongoose");
const Chat = require("./models/chat");
main().then(()=>{
    console.log("connection successful ");
})
.catch(err => console.log(err));

async function main() {
  await mongoose.connect('mongodb://127.0.0.1:27017/Whatsapp');
}
// let chat1=new Chat({
//     from:'Saud',
//     to:'Nemi',
//     msg:'Bro i had learned so much from u that i cant express in words',
//     date:new Date()
// });
Chat.insertMany([
  {
    from: 'Saud',
    to: 'Sarah',
    msg: 'You have taught me so much that I cannot express it in words.',
    date: new Date()
  },
  {
    from: 'Saud',
    to: 'Nemi',
    msg: 'Bro, I have learned so much from you that I cannot express it in words.',
    date: new Date()
  },
  {
    from: 'Saud',
    to: 'Sumit',
    msg: 'You have always been someone I could learn so much from.',
    date: new Date()
  },
  {
    from: 'Saud',
    to: 'Vedashre',
    msg: 'I have learned so many things from you, and I will always be grateful for it.',
    date: new Date()
  },
  {
    from: 'Saud',
    to: 'Crisha',
    msg: 'Thank you for all the things I have learned from you along the way.',
    date: new Date()
  },
  {
    from: 'Saud',
    to: 'Bidisha',
    msg: 'You have taught me things that I will always remember and appreciate.',
    date: new Date()
  },
  {
    from: 'Saud',
    to: 'Sarah',
    msg: 'I genuinely appreciate everything I have learned from you.',
    date: new Date()
  },
  {
    from: 'Saud',
    to: 'Nemi',
    msg: 'The things you taught me will always stay with me, bro.',
    date: new Date()
  },
  {
    from: 'Saud',
    to: 'Sumit',
    msg: 'I am really grateful for everything you have taught me.',
    date: new Date()
  },
  {
    from: 'Saud',
    to: 'Vedashre',
    msg: 'Some lessons stay with you forever, and I have learned many from you.',
    date: new Date()
  }
]);