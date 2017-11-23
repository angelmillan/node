var User = require('./user.js').User;
var db   = require('./user.js').db;



var newUser = User({

  id        : 1001,
  firt_name : 'joaquín',
  last_name : 'Reyes García',
  email     : 'joaquin.reyes@gmail.com'


});

newUser.save(function(err){
  if (err) throw (err);
    console.log('Usuario creado ' + newUser.id);
});
