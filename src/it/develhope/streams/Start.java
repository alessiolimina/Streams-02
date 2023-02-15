package it.develhope.streams;

/**
 * This is a Tester class
 * @author alessiolimina
 */

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Start {
    public static void main(String[] args) throws IOException {

        /**
         * Creating a new FileWriter
         * Specify the folder and the new file name
         * Creating the current date/time with seconds
         * creating a new DateTimeFormatter
         * Formatting the current date/time in a more readable pattern using dateTimeFormatter.ofPattern
         * Create a String time that contains the formatted date/time
         * write the String time in the new .txt file
         * //TODO alerting the user if the file already exists
         */

        FileWriter fileWriter = new FileWriter("D:\\Documenti Alessio\\Develhope\\Corso Java\\GIT\\Streams 02\\src\\file.txt",false);
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");
        String time = localDateTime.format(dateTimeFormatter);
        fileWriter.write("The current date/time is " + time);
        fileWriter.close();

    }
}

//TODO complete this task: if the file already exists, alert the user about overwriting it
//TODO generate Javadoc
//TODO writing and formatting the Javadoc in a more likeable way

/*
Exercise: Streams 2
Write a program that:

write using FileWriter the current date/time with seconds inside a file in src called file.txt
if the file already exists, alert the user about overwriting it
if not, alert the user of the new file creation
 */