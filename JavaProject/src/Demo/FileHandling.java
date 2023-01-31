package Demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException  {

        File myFile = new File("TestFile.txt");
        //Default directory - Project src folder
        //File myFile = new File("C:\\Automation\\OneDrive - EY\\Desktop\\Training\\TestFile.txt");
        //directory specified in above line
        if (myFile.createNewFile())
        {
            System.out.println("File created "+myFile.getName());
        }
        else
        {
            System.out.println("File already exists");
        }

         //Write to a file
        FileWriter fWrite = new FileWriter("TestFile.txt");
        fWrite.write("Writing in the file-First line");
        fWrite.close();

        /*
       FileWriter fWrite1 = new FileWriter("TestFile.txt");
        //fWrite1.write("Rewriting in the file");
        fWrite1.append("Appending in the file");
        fWrite1.close(); */
        //BufferedWriter for append
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("TestFile.txt",true));
        buffWrite.write("\n Second line appended?");
        buffWrite.close();

        //Read a file
        Scanner scanner = new Scanner(myFile);
        while(scanner.hasNextLine())
        {
            String str = scanner.nextLine();
            System.out.println("File content *****" + str);
            //Each line in the text file will be printed based on 'while' condition
        }
        scanner.close();
        
        //Delete File
        myFile.delete();
        System.out.println("File Deleted");
            }
// Print Exception Message
		catch (IOException e)
	{
		e.printStackTrace();
	}
}
