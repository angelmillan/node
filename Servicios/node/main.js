var estadistica = require('./estadistica');

var coleccion = [1,2,3,30,3,4,5,6];
var objeto = estadistica(coleccion);
console.log('Nº de elementos ' + objeto.numeroElementos());
console.log('Nº mas grande ' + objeto.numeroMasAlto());
