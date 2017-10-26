/* for (var i = 0; i < process.argv.length; i++) {

    console.log('Argumentos ' + i + ": " + process.argv[i]); 	
}
*/

if (process.argv.length < 3) {
  process.exit();
}

var cadena = process.argv[2];

console.log('Cadena de caracteres' + process.argv[2]);

function procesarCadena(valorCadena) {
   var _cadena = valorCadena
   return {
	  longitudCadena   : function() { return _cadena.length; },
	  cadenaEsNumero   : function() { return !isNaN(_cadena); },
	  cadenaMayuscula  : function() { return _cadena.toUpperCase() }
	  };

}

var cadena1 = procesarCadena(cadena);

console.log("Longitid de la cadena: " + cadena + " es:" + cadena1.longitudCadena());
