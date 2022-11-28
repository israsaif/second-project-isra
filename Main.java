package Project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//import com.google.gson.Gson;


public class Main {
	
	public static void main(String[] args) throws Exception {
	boolean menue=true;
	Scanner sa=new Scanner(System.in);
	while(menue) {
		System.out.println("========================");
		System.out.println("1.read file");
		System.out.println("2.search file");
		System.out.println("3.create directory");
		System.out.println("========================");
		
		String bb = sa.next();
		int option = Integer.parseInt(bb);
		switch (option) {
	case 1:
		
	//static Scanner reader = new Scanner(System.in);
	
			//try {
				String fileName ="C:\\Users\\User006\\eclipse-workspace\\first\\JSONFilewriter.txt";
				File file = new File (fileName);
				FileReader fr = new FileReader(file);
				
				BufferedReader br=new BufferedReader(fr);
				String line;
				while ((line= br.readLine())!=null) {
					System.out.println(line);
			//System.out.println("JSON file created");
	             	
				}
	     break;
			
		
	case 2:
		   //Reading the word to be found from the user
	      Scanner sc1 = new Scanner(System.in);
	      System.out.println("Enter the word to be found");
	      String word = sc1.next();
	      boolean flag = false;
	      int count = 0;
	      System.out.println("Contents of the line");
	      //Reading the contents of the file
	      Scanner sc2 = new Scanner(new FileInputStream("C:\\Users\\User006\\eclipse-workspace\\Main.txt"));
	      while(sc2.hasNextLine()) {
	         String line1 = sc2.nextLine();
	         System.out.println(line1);
	         if(line1.indexOf(word)!=-1) {
	            flag = true;
	            count = count+1;
	         }
	      }
	      if(flag) {
	         System.out.println("File contains the specified word");
	         System.out.println("Number of occurrences is: "+count);
	      } else {
	         System.out.println("File does not contain the specified word");
	      
  
	break;
	      }
	
	
		}menue = false;
	
	  }
     }
	}
