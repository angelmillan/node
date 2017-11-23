var mongoose = require ('mongoose');

var db = mongoose.connect('mongodb://localhost/ejercicio');


var Schema = mongoose.Schema ;

var  humanoSchema = new Schema({
    id          :Number,
    sexo        :String,
    edad        :Number,
    fecha       :Date

});

// pasamos el esquema a la coleccion
var Humano = mongoose.model('Humanos', humanoSchema);

// exportamos
module.exports.Humano = Humano;
module.exports.db   = db;
