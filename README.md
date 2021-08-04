# The-Fundamentals-Of-Java
course from pirple.com

---
## Homework #1
You're about to do an assignment called "Hello World", which is traditionally  the first program any Engineer creates when they learn any new programming language. The purpose of the exercise to confirm that your Java environment is up and running properly, and that you're comfortable with your IDE.

1. Following the examples in the previous lectures, create a simple program that prints ("Hello World").
2. Compile and run your program to confirm it's working.

---
## Homework #2
What's your favorite song?

Think of all the attributes that you could use to describe that song. That is: all of it's details or "meta-data". These are attributes like "Artist", "Year Released", "Genre", "Duration", etc. Think of as many different characteristics as you can.

Create a new project and within your main file list all of the attributes of the song, one after another. Create a variable for each attribute, and give each variable a value. Here's an example:
```java
String genre = "Jazz";
```
Write each variable on its own line. Then, after you have listed the variables, print each one of them out. Think of as many characteristics of the song as you can. Try to use all of the data types you have learned so far.

### Extra Credit:
Add comments to the top of your code file giving the file a title, explaining what the file is and who created it.

---
## Homework #3
You're about to do an assignment called "Fizz Buzz", which is one of the classic programming challenges. It is a favorite for interviewers, and a shocking number of job-applicants can't get it right. But you won't be one of those people. Here are the rules for the assignment (as specified by Imran Gory):

Write a program that prints the numbers from 1 to 100.
But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz".

For numbers which are multiples of both three and five print "FizzBuzz".

### The one hint you'll likely need is: 
There is a Java operator called "remainder" but often referred to as "modulus" or "modulo". It is represented by the percentage sign (%) and it gives you the remainder left over after division. So for example:
```java
6 % 3 
```
Equals zero. Because after dividing 6 by 3, there is zero leftover. Whereas:
```java
6 % 4
```
Equals 2. Because after dividing 6 by 4, there are 2 left over from the six.

If that was confusing, don't worry. It will make more sense as you use it. The point is: the remainder operator is useful for finding out if X is a multiple of Y. If it is, then X % Y will yield zero. Knowing this should help you complete this assignment without any issue.

### Extra Credit:
Instead of only printing "fizz", "buzz", and "fizzbuzz", add a fourth print statement: "prime". You should print this whenever you encounter a number that is prime (divisible only by itself and one). As you implement this, don't worry about the efficiency of the algorithm you use to check for primes. It's okay for it to be slow.

---
## Homework #4
1. Return to your 2nd homework assignments, when you described your favorite song.
2. Refactor that code so all the variables are held as in a single data structure as keys and values.
3. Refactor your print statements so that you have a single loop that passes through each item in the data structure and prints out it's key and then it's value.

---
## Homework #5
Create 3 functions, according to the specifications below:
**Function 1:** "reverseString": Should accept a string, reverse it, and return the reversed version. For example: if it is passed ABC, it should return CBA.
**Function 2:** "isPalindrome": Should accept a string, and return True or False indicating whether or not that string is a palindrome. For example, if passed "ABC" it should return false. If passed "ABA" it should return true.
**Function 3:**  "randBetween": Should accept two integers: min and max. It should return a random number between those two integers (inclusive of them).

If there are parts of this assignment you're not sure how to do (such as calculate a random number), then now is a good time to get acquainted with the web-based resources available to you as a developer. Simply googling your question, such as "How to get a random number in Java", will likely yield a valuable resource (either a StackOverflow question, a Reddit Question, a Quora question, or a Medium blog post, or other). If googling doesn't work for you, you can always read the Java docs, or post your question in our student forum.

---
## Homework #6
1. Create a new class called "sphere".
2. Create a constructor for that class that allows you to set the radius of the sphere (in any arbitrary unit such as cm).
3. Create a method that allows you to retrieve the diameter of the sphere (which you should be able to calculate given that the radius has been set).
4. Create a method that allows you to retrieve the circumference of the sphere (which you should be able to calculate given that the radius has been set).
5. Create a method that allows you to retrieve the surface area of the sphere (which you should be able to calculate given that the radius has been set).
6. Create a method that allows you to retrieve the volume of the sphere (which you should be able to calculate given that the radius has been set).

---
## Homework #7
Create a class called "Vehicle" and add methods that allow you to set the "Make", "Model", "Year,", and "Weight".

The class should also contain a "NeedsMaintenance" boolean that defaults to False, and and "TripsSinceMaintenance" Integer that defaults to 0.

Next create a subclass that inherits the properties of Vehicle class. Call this new subclass "Cars".

The Cars class should contain a method called "Drive" that sets the state of a boolean isDriving to True.  It should have another method called "Stop" that sets the value of isDriving to false.

Switching isDriving from true to false should increment the "TripsSinceMaintenance" counter. And when TripsSinceMaintenance exceeds 100, then the NeedsMaintenance boolean should be set to true.

Add a "Repair" method to either class that resets the TripsSinceMaintenance to zero, and NeedsMaintenance to false.

Create 3 different cars, using your Cars class, and drive them all a different number of times. Then print out their values for Make, Model, Year, Weight, NeedsMaintenance, and TripsSinceMaintenance

### Extra Credit:
Create a Planes class that is also a subclass of Vehicle. Add methods to the Planes class for Flying and Landing (similar to Driving and Stopping), but different in one respect: Once the NeedsMaintenance boolean gets set to true, any attempt at flight should be rejected (return false), and an error message should be printed saying that the plane can't fly until it's repaired.

---
## Project #1
You've been hired by a construction firm to help build the "brain" for a set of elevators in a new building. Your task is to write the code that will control the elevators, and tell each elevator which floor to travel to next.

### Building Description
The building is 10 stories tall and the floors are numbered 0 - 10 inclusive. The lobby is floor 0, and the penthouse is floor 10. The building contains one basement (floor -1).

The building contains 2 elevators: A and B.

**Elevator A:** Goes to all floors except the penthouse (floor 10).

**Elevator B:** Goes all the way up (including 10) but does not go to the basement (-1).

### Calling the Elevators
The residents of the building can call the elevators by clicking the call buttons located next to the elevator shafts on their floor:

- **Floors 1 to 9** contain two buttons to call the elevators: An "up" button and a "down" button.

- **Floor 10** contains only a "down" button

- **Floor -1** contains only an "up" button.

### Riding In the Elevators
Once inside of the elevators, a passenger can click the number of the floor that they wish to travel to.

It takes each elevator 1 second to travel past each floor. For example: traveling from floor 0 to floor 4 would take 4 seconds.

There is an emergency button inside each elevator. When that is pushed, the elevators go to their nearest floor and open their doors. The doors remain open until a reset button is pushed inside of the elevator.

### Design Goals
The goal of your code is to design a system that will get passengers from their starting floor, to their destination floor as quickly as possible. The timer on each passenger starts the moment they request the elevator. There are an unknown number of passengers in the building, on unknown floors, and they will be requesting to go in random directions (up or down) to random floors, at random times.

You can design this system in any number of ways (a library, a class, a set of event handlers or standalone functions, whatever). It's up to you. Just make sure you document your code (either as comments or by including a Readme in your repository) so that the elevator engineers know how to plug your "brain" code into the elevator's control logic.

***Input***
You can expect that the other engineers are handling the user-interface part (the actual buttons). But when those buttons are clicked, they need to be able to call the methods that you define. So make sure your documentation explains what methods should be called when all the different buttons are pushed (and the syntax they should use to call those methods).

***Output***
If you think elevator A or B should take an action, you should print that action to the console. The actions available to you are:
1. Move to a different floor
2. Open doors
3. Close doors

So, for example: If you think elevator A should move to floor #5 and open it's doors you could log/print
> A: move to 5
>
> A: open doors

### Extra Credit:
Write a script that simulates 100 passengers requesting elevators at random times, from random floors, and then requesting to go to random floors once they're inside the elevators. This script should execute over the course of 180 seconds. While the script is running you should keep track of how long each passenger waits from the moment they request the elevator to the moment they get off at their destination. Use the Math.random() function to simulate the randomness.

---
## Homework #8
Create a function called "timeAdder" that can add two time values together. For example, it should be able to add 25 hours and 3 days together. 
The function should accept 4 parameters:
```java
value1, label1, value2, label2
```
- value1 and value2 should accept positive integers  
- label1 and label2 should accept any of the following strings: "seconds", "minutes", "hours", "days", "second", "minute", "hour", "day"
For example your function may be called in any of the following ways (this is pseudocode not Java):
```java
timeAdder(1,"minute",3,"minutes")

timeAdder(5,"days",25,"hours")

timeAdder(1,"minute",240,"seconds")
```

### Requirements:
1. Your function must accept any possible combination of inputs 
2. If the inputs are valid, it should return an array with 2 variables inside of it: value3, and  label3. For example:
```java
return [5,"minutes"]; 
```
The exact label you choose to return for label3 ("minutes" for example) is up to you.
3. If the inputs are invalid or impossible, it should return false. Here are examples of impossible and invalid inputs:
```java
timeAdder(5,"hour",5,"minutes") // This is impossible because "hour" is singular and 5 is plural

timeAdder(false,false,5,"minutes") // This is invalid because the first 2 arguments are not the correct types

timeAdder({},"days",5,"minutes") // This is invalid because the first argument is the wrong type
```

### Extra Credit:
Rather than returning an arbitrary label for label3, return the largest label that can be used with an integer value
For example if someone calls:
```java
timeAdder(20,"hours",4,"hours")
```
You could return: [1,"day"] rather than [24,"hours"]

But if they called
```java
timeAdder(20,"hours",5,"hours")
```
You would return [25,"hours"] because you could not use "days" with an integer value to represent 25 hours.

---
## Homework #9
1. Download the FIFA 2019 dataset from Kaggle: https://www.kaggle.com/karangadiya/fifa19

**Hint:** Look for the the grey download link next to the blue "New Notebook" button.

2. The file is currently csv (comma separated value) format. Write a program will copy the data from this file into a new file that is tsv (tab-separated) instead. Your program should take these steps:

    1. Read in the data from the dataset
    2. Convert all the commas to tabs
    3. Create a new file called fifa-tab.tsv
    4. Write the modified data to that new file.
