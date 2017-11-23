var Humano = require('./humanos.js').Humano;

Humano.find({},function(err, users){
  if (err) err;
    console.log(users);
});
