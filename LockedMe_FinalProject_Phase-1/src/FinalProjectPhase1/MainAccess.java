package FinalProjectPhase1;

import java.util.List;
import java.util.Scanner;

public class MainAccess {
	 
	//Main Access method for Accessing the given path
	static final String folderpath="C:\\Users\\ravikant\\Desktop";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Method for Welcome Screen
		@SuppressWarnings("unused")
		FileHandlingMethods obj=new FileHandlingMethods();
		FileHandlingMethods.WelcomeScreen();
		
		Scanner input=new Scanner(System.in);
		String newline=System.lineSeparator();
		 {
			 while(true) {
		System.out.println("Press 1. To display all files"+newline+"Press 2.To do add file"+newline+"Press 3.To search file"+newline+"Press 4.To delete file"+newline+"Press 5.To exit file");
		System.out.println("******************************************************************************************************************");
		char ch=input.next().charAt(0);
		
		switch(ch) {
		
		//Case for displaying files
		case '1':
		List<String> filenames=FileHandlingMethods.ToDisplayFile(folderpath);
		for(String file:filenames)
			System.out.println(file);
		System.out.println(" ");
		break;
		
		//Case for writing filename for newly created file
		case '2':
		System.out.println("Enter filename for your new file");
		String text=input.next();
	    FileHandlingMethods.filecreate(folderpath+text);
		break;
		
		//Case for Entering the file name which you want to search
		case '3':
		System.out.println("Enter file to search");
		String text1=input.next();
	    FileHandlingMethods.searchfile(text1);
		break;
			
		//Case for entering filename which we want to delete
		case '4':
		System.out.println("Enter filename to delete");
		String text3=input.next();
		FileHandlingMethods.deletefile(folderpath+text3);
		break;
		
		case '5':
			System.exit(0);
			

}
			 }
		 }
	}
}
