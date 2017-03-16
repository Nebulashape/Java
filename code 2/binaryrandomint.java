//binary ranodom Integer
// save file as randomIncreate.js
// to run type node radomincreate.js
var randomInteger = function(val) {
	var ival = Math.random()*256;
	//console.log(ival);
	ival = Math.floor(ival);
	return ival ;
 }
//maincd j
for (i = 0; i < 65536; i++){
	rInt= randomInteger();
	//console.log(rInt+",");
	process.stdout.write(rInt+",");
 }
//
//
