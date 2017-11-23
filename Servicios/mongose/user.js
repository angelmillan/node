var mongoose = require ('mongoose');

var db = mongoose.connect('mongodb://localhost/ejercicio');


var Schema = mongoose.Schema ;

var  userSchema = new Schema({
    id          :Number,
    firt_name   :String,
    last_name   :String,
    email       :String

});

// pasamos el esquema a la coleccion
var User = mongoose.model('Users', userSchema);

// exportamos
module.exports.User = User;
module.exports.db   = db;
