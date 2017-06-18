------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:Gradebook
PURPOSE OF PROJECT: A program that calculates final grade every time a new grade is entered by averaging it.
VERSION or DATE:10/31/2016
HOW TO START THIS PROJECT:
AUTHORS: Pratap, Ady
PMR:
     I solved the problem by making a program that allpows user input by importing the .Scanner class. This program 
     works by taking the user input adding it to the final grade and dividing it by 2 and not by the number of assignments
     assigned. The reason why the program divides the final grade by 2 is because there are only two grades being added; the 
     grade the user inputs and the final grade. The final grade is the latest garde in the class. I ran into some problems 
     regarding counter. Initially counter++ was inside the loop and everything worked fine except everytime the user inputs 
     a high grade, the grade keeps dropping. I fixed this problem by decclaring counter++ outside the loop but still the grade was
     different than the grade if done on a claculator. The only way to fix the problem was to delete counter++ and make counter = 2;