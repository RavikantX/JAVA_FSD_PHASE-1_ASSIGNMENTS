package FinalProjectPhase1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileHandlingMethods {
 
	//Method for Printing the Welcome Screen
	public static void WelcomeScreen() {
		
		System.out.println("***********************************************************");
		System.out.println(" Welcome to LockedMe.com");
		System.out.println("    ");
		System.out.println("This application is developed by Ravikant ");
		System.out.println("************************************************************");
		System.out.println("    ");
		System.out.println("    ");
		System.out.println("You can use this application to:-");
		System.out.println("Retrieve, Search, Add, and Delete files in files folder");
		System.out.println("      ");
		System.out.println("      ");
		System.out.println("Select any option from below and press Enter");
		System.out.println("      ");
		
		
	}
	
	//Method for displaying the folderpath
	public static List<String> ToDisplayFile(String folderpath) {
		File directorypath=new File(folderpath);
		File filesList[]=directorypath.listFiles();
		List<String> filenames=new ArrayList<String>();
		
		Collections.sort(filenames);
		for(File file:filesList) {
			filenames.add(file.getName());
		}
		
		
		return filenames;
		
	}
	
	//Method for creating the file
    public static void filecreate(String filename) {
		
	    try {
	    	File myObj=new File(filename);
	    	if (myObj.createNewFile()) {
	    		System.out.println("FileCreated");
	    		FileWriter myWriter=new FileWriter(filename);
	    		@SuppressWarnings("resource")
	    		
	    		//For asking whether you want to enter some content in file created
				Scanner input1=new Scanner(System.in);
	    		System.out.println("Do you want to enter content for file (y/n)?");
	    		char operator=input1.next().charAt(0);
	    		switch(operator) {
	    		
	    		//Case for Entering the content you want to add
	    		case 'y':
	    			Scanner input=new Scanner(System.in);
	    			System.out.println("Enter content to your file");
		    		String sc=input.nextLine();
		    		myWriter.write(sc);
		    		myWriter.close();
		    	    System.out.println("Successfully written to file");
		    		System.out.println("*******************************");
		    		break;
		    		
		    		//Case for if you don't want to write anything
	    		case 'n':
	    			System.out.println("Nothing written to file");
	    			break;
	    		                  }
	    		
	    	}
	    	else {
	    		System.out.println("File already exists");
	    		System.out.println("**********************");
	    	}  		
	    }
	    catch(IOException e) {
	    	System.out.println("error occured.");
	    	e.printStackTrace();
	    }
	}
    
     //Method for searching the filename
    public static void searchfile(String filename) {
	
	File directory=new File("C:\\\\Users\\\\ravikant\\\\Desktop");
	 
	String flist[]=directory.list();
	
	int flag=0;
	
	if(flist==null) {
		System.out.println("Empty directory");
	}
	else {
		
		for (int i=0;i<flist.length;i++) {
			String files=flist[i];
			if(files.equalsIgnoreCase(filename)) {
				System.out.println(files +" :found");
				System.out.println("******************");
			    flag=1;
			}
		}	
		
	}
	//For file not found case
	if (flag==0) {
		System.out.println("File not found");
		System.out.println("******************");
	}	
	
}

    //Method for deleting the file
     public static void deletefile(String filename1) {
		File myObj=new File(filename1);
		
		if(myObj.delete()) {
			System.out.println("File deleted successfully");
			System.out.println("*****************************");
		}
		else {
			System.out.println("File doesn't exist");
			System.out.println("******************************");
}
}
}