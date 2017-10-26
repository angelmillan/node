module.exports = function estadistica (coleccion) {
  var _coleccion = coleccion;
  return {
    numeroElementos : function () {return _coleccion.lenght;},
    numeroMasAlto   : function () {
      var numeroAlto = _coleccion[0];
      if (_coleccion.lenght > 1) {
        for (var i = 0; i < _coleccion.lenght; i++) {
            if (_coleccion[i] > numeroAlto){
              numeroAlto = _coleccion[i];
            }
        }
      }
      return numeroAlto;
    }

  }
}

//var coleccion = [1,2,3,3,3,4,5,6];
//var objeto = estadistica(coleccion);
//console.log('Nº de elementos ' + objeto.numeroElementos);
//console.log('Nº mas grande ' + objeto.numeroMasAlto);
