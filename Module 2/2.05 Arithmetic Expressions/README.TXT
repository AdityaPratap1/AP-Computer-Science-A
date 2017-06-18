------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: MeasurementConverterV1
PURPOSE OF PROJECT: The purpose of the project is to able to derive formulae for different units of measure and be able to convert using JAVA.
VERSION or DATE: 10/29/2016
HOW TO START THIS PROJECT:
AUTHORS: Pratap, Ady
PMR: In this project, I created two different classes, one for declaring variables and one for doing the operations.
     The two classes are MeasurementConverterV1 and declaredVariables. I did this so that the code is organized and easy understand since it is not congested. Instead of writing the code for the operations in the main method, 
     I created a converter() method where I did all the operations and work and finally called the converter method 
     In the main method. I did run over some errors like "non-static variables cannot be referenced from a static context."
     I fixed this be removing the static keyword from the converter method: "public static void converter()" changed to
     "public void converter()."
