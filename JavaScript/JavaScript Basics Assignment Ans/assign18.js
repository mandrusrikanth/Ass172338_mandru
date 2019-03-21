

/*var sliceItAndCombineIt=function(myString, a,b,c,d){
    return myString.substring(a,b)+myString.substring(c,d);
  }
  document.write(sliceItAndCombineIt("This is a Test", 0, 4, 5, 7) );*/
  
  /*var findFirstMatch =function(myString,str){
    return myString.indexOf(str);
  }
  document.write(findFirstMatch("Roses are red", "re"));*/

  /*var findFirstMatch =function(myString,str){
    return myString.lastIndexOf(str);
  }
  document.write(findFirstMatch("Rosesre a r", "re"));
*/
var substringBetweenMatches =function(myString,str){
    var strlength=str.length;
    var firstsub=myString.indexOf(str)+strlength;
    var lastsub=myString.lastIndexOf(str);
    return myString.substring(firstsub,lastsub);
  }
  document.write(substringBetweenMatches("Roses are red, apples are really red.", "red") );  
  
  

  