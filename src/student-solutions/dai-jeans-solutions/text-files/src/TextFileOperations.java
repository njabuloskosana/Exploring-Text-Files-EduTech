import java.util.Scanner;
import java.io.*;
import java.nio.file.*;;
public class TextFileOperations {

    private String filePath="D:\\Personal\\work\\School of IT\\Week 5\\Assignment 3\\FileReaderAndWriter\\files\\src\\Assignment3dai.txt";

    /**
     * This method reads in a text file with the file name
     * then prints out the whole text file line by line 
     * to the terminal
     * @param filename
     */
    public void readEntireFile(String filename)
    {
        File file = new File(filePath);
    //use scanner
     Scanner sc = new Scanner(filePath);

     while (sc.hasNextLine())
     {
         System.out.println(sc.nextLine());
     }
       
    }

    /**
     * This method reads in a text file with the file name
     * then returns the number of lines within the text file
     * @param filename
     * @return
     */
    public int numberOfLines(String filename)
    {
        File file = new File(filePath);
        return 0;
    }

    /**
     * This method reads in a text file with the file name
     * and only prints out the first n number of lines
     * eg. if n=3 print out the first 3 lines in the text
     * file.
     * @param filename
     * @param n
     */
    public void readFirstNLines(String filename,int n)
    {
        
    }

    /**
     * This method reads in a text file with the file name
     * and only prints out the last n number of lines
     * eg. if n=3 print out the last 3 lines in the text
     * file.
     * @param filename
     * @param n
     */
    public void readLastNLines(String filename,int n)
    {
        
    }

    
    /**
     * This method will add the text into the last
     * line of the textfile with filename. The method
     * will append the text into the textfile
     * @param filename
     * @param text
     */
    public void appendText(String filename,String text)
    {
        
    }

    
    /**
     * This method will read in a text file with filename
     * that has a single integer value in each line
     * the method should return an array populated with all 
     * integer values present in the text file 
     * @param filename
     * @return
     */
    public int[] generateArray(String filename)
    {
        return null;
    }

    
    /**
     * This method reads in a textfile that has a single word
     * in each line and returns the longest word 
     * present in the textfile
     * @param filename
     * @return
     */
    public String longestWord(String filename)
    {
        return null;
    }

     /**
     * This method reads in a textfile that has a single word
     * in each line and returns the frequency of the word 
     * present in the textfile, this means it will return
     * the number of times the word is repeated in the text file
     * @param filename
     * @param word
     * @return
     */
    public int FrequencyOfWord(String filename,String word)
    {
        return 0;
    }

    /**
     * This method reads in a textfile that has a single word
     * in each line and returns true if the word is
     * present in the textfile, and false if the word is not
     * present
     * @param filename
     * @param word
     * @return
     */
    public boolean ContainsWord(String filename,String word)
    {
        return false;
    }

    
    /**
     * This method reads in two textfiles and if 
     * both textfiles have the same information,
     * thus meaning each line is identical then the
     * method returns true, if a line is not the same 
     * then the method returns false
     * @param filename1
     * @param filename2
     * @return
     */
    public boolean isEqual(String filename1,String filename2)
    {
        return false;
    }

    /**
     * This method copies over the contents of filename1
     * into the text file with filename2
     * @param filename1
     * @param filename2
     */
    public void performCopy(String filename1,String filename2)
    {
        
    }

    
    
}
