## Directions

Create a program called Main.

1. Read four integers (w,x,y,z)
2. Create two point objects at position (w,x) and position (y,z) in the coordinate space.
3. Translate the first point by (5,7)
4. Print the translated point.
5. Set the location of the second point to (50, 50)
6. Print the new location of the second point.
7. Calculate the distance between point one and point two.  HINTS: This is the formula: <img src="http://www.sciweavers.org/tex2img.php?eq=%20%5Csqrt%7B%28%28x_%7B2%7D%29%5E2%20-%20%28x_%7B1%7D%29%5E2%29%20%2B%20%28y_%7B2%7D%29%5E2%20-%20%28y_%7B1%7D%29%5E2%7D%7D%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img]" alt="√((x_2-x_1)²+(y_2-y_1)²)" width="200"/>
8. Remember that you will have to use the methods to get the x and y points because you changed them after you read the four integers.
9. Print the distance.

Example Input 1:

	5
	20
	1
	1
Example Output 1:

	java.awt.Point[x=10,y=27]
	java.awt.Point[x=50,y=50]
	46.14108798023731