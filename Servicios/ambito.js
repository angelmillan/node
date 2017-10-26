var a = 1;
console.log('ejecutando funcio IEFE');

(function foo() {
  var a = 2;
  console.log(a);
})();

console.log( 'llamando a la funcion');
foo();
console.log('llamando a la global');
console.log(a);
