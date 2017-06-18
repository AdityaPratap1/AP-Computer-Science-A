------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: 3.09 Challenge Program
PURPOSE OF PROJECT: The purpose of the program is to calculate a fine on an overdue book and convert information into a readable paragraph

VERSION or DATE: 11/26/2016
HOW TO START THIS PROJECT:
AUTHORS:
PMR: 

In this project, the objective was to calculate the fine for an overdue book. Insted of pre defining the details of the issuer and the details of the book, I allowed user input for the issuer to enter his/her information and the book's information. I also allowed the user to enter the date issued, the date the book the was due, and the current date to calculate the the days overdue or the days remaining to book due date. In order to solve this particular problem, I set the dates to variables and subtracted them but before that, i parsed them to a format(MM/dd/yyyy) and got the time in milliseconds since January 1, 1970 and converted them into days. There was a runtime exception becuase the parse method throws an exception. This problem was solved by using try and catch.
