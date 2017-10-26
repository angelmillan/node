var name = " manuel " ; // A global variable
function clousure () {
var name = " pepe " ; // A local variable
function f () { return name ; }; // Return the value in scope here
return f  ;
};

console.log('Valor de name: ' + name);
console.log('Valor de name: ' + clousure()());


