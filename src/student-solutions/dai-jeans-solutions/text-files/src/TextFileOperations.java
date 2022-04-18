import java.util.Map;
import java.util.Scanner;
import java.io.*;
import java.nio.file.*;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map.Entry;


public class TextFileOperations {

    public String filePath="D:\\Personal\\work\\School of IT\\Week 5\\Assignment 3\\FileReaderAndWriter\\files\\src\\Assignment3dai.txt";

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
        int count = 0;
        File file = new File(filePath);
        Scanner sc = new Scanner(filePath);

        while(sc.hasNextLine()) {
            sc.nextLine();
            count++;
        }
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
        int lineNumber = 2;
 
        try {
            FileReader file = new FileReader(filePath);
            BufferedReader buffer = new BufferedReader (file);
            String line = buffer.readLine();
            System.out.println(line);

         } catch (IOException e) {
            e.printStackTrace();
        }
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
        String fileName = filePath;
        try{ 
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
        
         out.write("In conclusion to the written statement above:\n");

         out.close();
        }
        catch (IOException e)
        {

        }

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
        File file = new File (filePath);
        Scanner scanner = new Scanner(file);
        int [] tall = new int [100];
        int i = 0;
        while(scanner.hasNextInt())
        {
             tall[i++] = scanner.nextInt();
        }

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
        try{String longestWord = "";
        String current;
        Scanner scan = new Scanner(new File(filePath));

        while (scan.hasNext()) 
        {
        current = scan.next();
        if (current.length() > longestWord.length()) 
        {
            longestWord = current;
        }
        
         System.out.println(longestWord);
        }
        }
        catch (FileNotFoundException e){}
        System.out.println();
        return longestWord;
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
        Map<String, Integer> words = new HashMap<String, Integer>();
        Scanner file = new Scanner (new File(filePath));

        while (file.hasNext())
        {
            String word2 = file.next();
            Integer count = words.get(word);
            if (count != null){
                count++;
            }
            else 
                count = 1;
                words.put(word,count);

            file.close();
          
        }


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
        String containsWord = null;
        Scanner scan = new Scanner(System.in);
        word = scan.nextLine();

        try {
            if(filePath==word)
                {
                return true;
                }
            else
                {
                return false;
                } 
            }
            catch (FileNotFoundException e) 
            {
                e.printStackTrace();
            }
        }
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
        String filePath2 = "D:\\Personal\\work\\School of IT\\Week 5\\Assignment 3\\FileReaderAndWriter\\files\\src\\Assignment3dai file 2.txt";
        File file = new File (filePath);
        File file2 = new File (filePath2);

        boolean compare1and2 = FilecontentEquals(file, file2);

    
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
        
        String filePath2 = "D:\\Personal\\work\\School of IT\\Week 5\\Assignment 3\\FileReaderAndWriter\\files\\src\\Assignment3dai file 2.txt";
        Scanner sc = new Scanner(System.in);
        System.out.print(filePath);
        String sfile = sc.next();
        System.out.print(filePath2);
        String dfile = sc.next();
        FileReader fin = new FileReader(sfile);
        FileWriter fout = new FileWriter(dfile, true);
        int c;

        while(( c = fin.read()) != -1)
        {
            fout.write(c);
        }
        System.out.println("Copy finish...");
        fin.close();
        fout.close();
    
    }

    
    
}
