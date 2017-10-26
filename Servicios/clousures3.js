var uniqueInteger = ( function () { // Define and invoke
var counter = 0; // Private state of function below
return function () { return counter ++; };
}) () ;
console . log ( uniqueInteger () ) ; // print 0
console . log ( uniqueInteger () ) ; // print 1
console . log ( uniqueInteger () ) ; // print 2
