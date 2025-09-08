[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=20374740)
Write a program that converts a temperature from Celsius to Fahrenheit. It should (1) prompt the user for input, (2) read a double value from the keyboard, (3) calculate the result, and (4) format the output to one decimal place. When it’s finished, it should work like this:

Enter a temperature in Celsius: 24

24.0 C = 75.2 F

Class ConvertTemp

This class should have two double data members - cTemp (the c=Celcius temperature) and fTemp (the Farenheit temperature).

This class should have the following methods: 

1 constructor that takes as input the temp in Celcius as type double. Do the conversion in the constructor, and store the value in fTemp.

2 getter methods for fTemp and cTemp

A method called updateTemps(double cTemp) that updates both cTemp and fTemp of the object.

Class Main

Create a Scanner object to read input

Prompt the user for input

Create any necessary variables you will need to store the input

Create a ConvertTemp object

Use System.out.printf to print the string as stated above.

