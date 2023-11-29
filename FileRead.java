
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;
import java.util.ArrayList;

public class FileRead {
  public static void main(String[] args) {
    
    
    String name = "test.txt";
    ArrayList<Integer> output = new ArrayList<Integer>();

    try {
      File myObj = new File(name);
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    try {
      File myObj = new File(name);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        //line by line, pushes data from txt file to arraylist
        String data = myReader.nextLine();
        output.add(Integer.parseInt(data));
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    System.out.println(output);

  }
}