data sets:

§ http://www.kaggle.com
§ http://www.data.gov
§ https://toolbox.google.com/datasetsearch


To make a JAR available to runtime environment (JRE)...

```
$ javac -classpath .:sinbad.jar -d . Driver.java
$ java -classpath.:sinbad.jar Driver
```

411 on sinbad 
https://berry-cs.github.io/sinbad/install-java


Answers: 

Team Killer Klowns: Jason Zhou, Ariel Fuchs, Neil Lin
APCS pd 7
Time Spent: 2 hrs
L08: America's Next Top Data Scientist



Activity 1:

Q1: Google, youtube, facebook

Q2: Device settings, IP address, mobile network information, ie telephone number

Q3: Data seperated by a single character, its important because most will come as CSVs

Q4: You can look at the title of column and see if it is quantitative or qualitative

Q5: games, f1

Q6: What is the least popular played game, What is the average rubber left on the track after each grand prix

Q7: we used kaggle and searched up f1

Q8: 73 records, larger data sets with more records means you can analyze more or see trends

Q9: You can acccess data and see what things need improvement in society

Q10: It was probably collected by people recording match data to improve performance during matches

Q11: I don't think so??

Activity 2:

Q1: Cereal

Q2: N/A no question given

Q3: public class Cereal

Q4: 15, one for each cereal attribute

Q5: String, doubles, names will be the ones given ie(calories, protein)

Q8: It can get individual values or set certain values.

Q9: Is the cereal healthy?

Q10: Create a hashmap with ratings for certain cereals that denote whether or not it is healthy

Activity 3: 

Q1: Atlanta Hartsfield, Jackson Atlanta, International Airport, GA: 55 degrees F

Q2: KALB, The temperature at Albany Internation Airport, NY is 55.0 F

Q4: 48 stations

Q5: latitude or longitude

Q6: Live Oak County Airport

Q7: Which ones are located in the coldest or hottest regions

Q8: one or two methods and thats it

Activity 4:

Q1: What are all the tracks ever used in f1 and their stats

Q2: The data set has tracks along with their specifications, we found this using kaggle 

Q3: we created a class for each datum and then created a driver class to process the data

Q4: The specific instance vas were chosen to represent attributes of that certain track

Q5: circuits.add(new Circuits(things[0], things[1], things[2], things[3], things[4], Double.parseDouble(things[5]), Double.parseDouble(things[6]), o, things[8]));