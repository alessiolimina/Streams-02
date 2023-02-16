package it.develhope.streams;

/**
 * This is a Tester class
 * @author alessiolimina
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Start {
    public static void main(String[] args) throws IOException {

        /**
         * Creating a new File, specifying the pathname;
         * if the file already exists, the program will inform the user about overwrite it;
         */

        try { File file = new File("D:\\Documenti Alessio\\Develhope\\Corso Java\\GIT\\Streams 02\\src\\file.txt");
            if (file.exists()) {System.out.println("Alert: the file already exists, I'll overwrite it");
            } else {System.out.println("Roger! New file created!");
            }

            /**
             * Creating a new FileWriter with, as parameters, the file to write and the boolean append
             * Creating a new BufferedWriter, to use in combination with FileWriter (as his parameter)
             */

            FileWriter fileWriter = new FileWriter(file,false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

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
             * finally, insert all the code in a try/catch statement
             */

            String time = localDateTime.format(dateTimeFormatter);
            bufferedWriter.write("The current date/time is " + time);
            bufferedWriter.close();

            } catch (Exception e) {e.printStackTrace();
        }
    }
}


