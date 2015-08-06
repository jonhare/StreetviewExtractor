# StreetviewExtractor
Commandline tool to extract streetview images along a route between two locations


##Compiling
You need Apache Maven. From a terminal run `mvn package shade:shade` to build an executable jar.

##Usage
You will need a Google API key - get one here: https://console.developers.google.com
You'll need to enable the "Directions API" and "Street View Image API".

Run the program with `java -jar target/StreetviewExtractor-1.0-SNAPSHOT.jar`


		Usage: java -jar StreetviewExtractor.jar [options...]
		 --api-key (-a) VAL  : Google Maps API Key
		 --fpx N             : Number of images per X. If --time-recode is enabled X is
		                       seconds; otherwise it is metres.
		 --from VAL          : From coordinates formatted as lat,lng
		 --height (-h) N     : Image height.
		 --output (-o) VAL   : Output geojson file; the .json extension will be added
		                       if it's not present
		 --time-recode       : Recode the path based on the time of each segment; the
		                       images will be further apart when moving faster
		 --to VAL            : To coordinates formatted as lat,lng
		 --width (-w) N      : Image width.
		 --write-images (-i) : Output the images of the route.
		 --write-video (-v)  : Output a video of the route.

Example:
java -jar target/StreetviewExtractor-1.0-SNAPSHOT.jar --from 40.631538,-73.965327 --to 40.691099,-73.991785 -i -v -o test.json -a <your_api_key>


