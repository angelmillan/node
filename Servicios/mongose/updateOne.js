var User = require('./user.js').User;

User.findOneAndUpdate({firt_name : 'joaquín'},{firt_name : 'Joaquín'},
  function(err, user){
  if (err) err;
    console.log(user);

});
