------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Currency Converter
PURPOSE OF PROJECT: To have a program that converts currency from USD to various diifernt currencies to make calculation easier
VERSION or DATE:11/6/2016
HOW TO START THIS PROJECT:
AUTHORS:Pratap, Ady
PMR: In this project, i used two different classes to start with. The first class is initializeVariables to initialize all the 
     variables and also to seperate the declaration and initialization from executing and print statements. This avoids
     confusion and mess. I encoutered problems while casting  numberOfItems2 when to integer like like indentifier expected  
     but later fixed it by moving the (int) to the original spot. 
     
     Initially it looked like - "double numberOfItems2 =  (itemTwoBudget/ itemTwoCost);
                                numberOfItems2 = (int) numberOfItems2; "
                                
     Changed to - "int numberOfItems = (int) (itemTwoBudget/ itemTwoCost);"                     
