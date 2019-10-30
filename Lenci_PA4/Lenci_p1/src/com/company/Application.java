package com.company;

import java.io.*;
import java.util.*;

class DuplicateRemover{

    public List<String> temps = new ArrayList<String>();
    public Set<String> uniqueWords;

    public void remove(String dataFile) throws FileNotFoundException {
        FileInputStream fileByteStream = new FileInputStream(dataFile);
        String token;
        Scanner inFS = new Scanner(fileByteStream);

        while (inFS.hasNext()) {
            token = inFS.next();
            temps.add(token);
        }
        inFS.close();

        uniqueWords = new HashSet<String>(temps);
    }

    public void write (String outputFile) throws FileNotFoundException {
        try{
            FileWriter outputWrite = new FileWriter(outputFile, false);
            outputWrite.write(String.valueOf(uniqueWords));
            outputWrite.close();
        }
        catch(IOException ioException){
            System.out.println("Error in write.");
            System.exit(0);
        }
    }

}

public class Application {
    public static void main(String[] args) {
	    DuplicateRemover remover = new DuplicateRemover();

	    try {
            remover.remove("problem1.txt");
        }
	    catch (FileNotFoundException ex){
	        System.out.println("File not found!");
            System.exit(0);
        }

	    try{
	        remover.write("unique_words.txt");
        }catch (FileNotFoundException ex){
            System.out.println("File not saved!");
            System.exit(0);
        }
    }
}
