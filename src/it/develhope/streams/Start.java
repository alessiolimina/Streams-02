package it.develhope.streams;

/**
 * This is a Tester class
 * @author alessiolimina
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Start {
    public static void main(String[] args) throws IOException {

        /**
        * * Creating a new File, specifying the pathname;
        * if the file already exists, the program will inform the user about overwrite it;
        * Creating a new FileWriter
        */

        File file = new File("D:\\Documenti Alessio\\Develhope\\Corso Java\\GIT\\Streams 02\\src\\file.txt");
        if (file.exists()) {System.out.println("Alert: the file already exists, I'll overwrite it");
        } else {System.out.println("Roger! New file created!");}
        FileWriter fileWriter = new FileWriter(file,false);

        /**
         * Creating the current date/time with seconds
         * creating a new DateTimeFormatter
         * Formatting the current date/time in a more readable pattern using dateTimeFormatter.ofPattern
         */

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");

        /**
         * Create a String time that contains the formatted date/time
         * write the String time in the new .txt file
         */

        String time = localDateTime.format(dateTimeFormatter);
        fileWriter.write("The current date/time is " + time);
        fileWriter.close();

        }
    }


