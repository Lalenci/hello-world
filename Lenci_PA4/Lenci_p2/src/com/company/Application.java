package com.company;

import java.io.*;
import java.util.*;

class DuplicateCounter{

    public List<String> temps = new ArrayList<String>();
    public Map<String, Integer> wordCounter;

    public void count(String dataFile) throws FileNotFoundException {
        FileInputStream fileByteStream = new FileInputStream(dataFile);
        String token;
        Scanner inFS = new Scanner(fileByteStream);

        while (inFS.hasNext()) {
            token = inFS.next();
            temps.add(token);
        }
        inFS.close();

        wordCounter = new HashMap<String, Integer>();

        for (String i : temps) {
            Integer j = wordCounter.get(i);
            wordCounter.put(i, (j == null) ? 1 : j + 1);
        }
        
    }

    public void write (String outputFile) throws FileNotFoundException {
        try{
            FileWriter outputWrite = new FileWriter(outputFile, false);
            outputWrite.write(String.valueOf(wordCounter));
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
        DuplicateCounter counter = new DuplicateCounter();

        try {
            counter.count("problem1.txt");
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found!");
            System.exit(0);
        }

        try{
            counter.write("unique_words.txt");
        }catch (FileNotFoundException ex){
            System.out.println("File not saved!");
            System.exit(0);
        }
    }
}
