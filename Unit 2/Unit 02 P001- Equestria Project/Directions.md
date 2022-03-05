## Chapter 2 Programming Project
### PERFORMANCE GRADE

Complete this programming project using your notes, the text book, and any online or in-class sources you like.  Your work must be your own; you may ask a friend to look over your work, or discuss a problem with you, but you must write all code on your own.  

**Introduction:** Equestria is a make-believe land from the show “Llttle Pony” (no Mrs. Hasseld did not make up this assignment for her granddaughters!).  The land of Equestria (see map in assignment schedule) is a grid that is 25 tiles tall by 37 tiles wide. In the Java coordinate system, the point (0,0) is in the upper left corner.

**OPENING DIRECTIONS:**

1. Create the program in coding rooms using the assignment template.
2. Your program must take in user input.
3. You will ask the user to enter NINE integer values.  These values will represent four distinct points in the land of Equestria, and the ninth value will be used to calculate the circumfrence.  You may assume that only valid x and y values will be represented. The order the values will be entered is as follows: Point 1 X value, Point 1 Y value, Point 2 X value, Point 2 Y value, etc. The last integer entered will be the diameter of a possible road trip.
4. Create a variable for each value. Make sure you name each appropriately.
Create four Point objects using the input. Name each appropriately.
5. Print out each Point object. Then, comment out the print statements but leave them in the program. (Remember, code a little, check.  Code a little, check.)

### Exercise 1
Princess Luna and Celestia are going on a tour of the kingdom to greet the other citizens of Equestria.  Their tour takes them on a circular path.  Write a method called roadTrip that (1) accepts as a parameter the diameter of the circular path, and (2) returns the length of the trip.  Hint: Your main method should call the roadTrip method with a parameter.

The equation for circumference is: *C = dπ*

Java has a math constant called `Math.PI`

***After you create this method, test it by printing the circumference from the main method.  After testing, comment out that print statement BUT LEAVE IT IN YOUR PROGRAM.  NOTE: It’s true that you don’t use this calculation in the subsequent exercises, but it’s great practice.***

### Exercise 2
Write a method called distance that 

1. Accepts two points as parameters 
2. computes the distance between points (x1, y1) and (x2, y2) on the map, and (3) returns that distance. 

You must use the Point method that enables you to get the value of of x and the point method that enables you to get the value of y.

The equation for the distance is:  <img src="http://www.sciweavers.org/tex2img.php?eq=%20%5Csqrt%7B%28%28x_%7B2%7D%29%5E2%20-%20%28x_%7B1%7D%29%5E2%29%20%2B%20%28y_%7B2%7D%29%5E2%20-%20%28y_%7B1%7D%29%5E2%7D%7D%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img]" alt="√((x_2-x_1)²+(y_2-y_1)²)" width="200"/>


Test out your program by writing a main method that calls the distance method for each of the following points in Equestria.  

Your main method should output the value returned by the distance method in sentences that read:

	Distance from first point to second point = [distance]
	
	Distance from from the second point to the third point = [distance]	
	
	Distance from the third point to the fourth point = [distance]



### Exercise 3
Write a method called `totalTrip` that accepts parameters for 4 points and returns *_the total distance traveled by visiting all 4 locations and returning to the first location_*. You must use the distance method you wrote in Exercise 2 and the points you created.

Your program should output the total trip in sentences that read: 

	Dear Princess Luna, here are the details for the total distance of your 4-stop tour of Equestria. The total distance traveled once you return to your stop one is [distance].
