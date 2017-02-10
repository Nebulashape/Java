//binary search will run with node
//save files as binarysearch.js
//run by typing node binarysearch.js
var doSearch = function(array, targetValue) {
	var min = 0;
	var max = array.length -1;
	var guess;
	var i = 1;
	
	while(min <= max) { 
	guess = Math.floor((max + min)/2);//truncate decimal
	if (array[guess]===targetValue){
	console.log("Total guesses" + i);
		return guess;
		
		}
		else if (array[guess] < targetValue) {
			min =guess + 1;
			}
			else {
			max = guess - 1;
			}
			i++; // this is the same as i =i + 1;
			console.log("guess" + guess);
			}
			
			return-1;
			}
			// main (this is where functions get called)
			
			var values = [100,400,200,1000,4,2,3,4,1];
						values.sort(function(a, b){return a-b});

			//values.sort();

			var results = doSearch(primes, thePrime);
			console.log("Found prime " +thePrime+" at index " + results);
			console.log(values);
			console.log(values); 
			
	

