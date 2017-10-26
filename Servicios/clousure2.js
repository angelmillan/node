function contador() {
  var contador = 0;
  function incrementar(){
  return contador ++;
  };
return incrementar();
};

console.log('Contador: ' + contador());
console.log('Contador: ' + contador());
