var User = require('./user.js').User;

User.find({},function(err, users){
  if.(err) err;
    console.log(users);
});
