
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;




public class View {

	int Score;
	String Data;
	public void View_Q() throws FileNotFoundException
	{
	   File file=new File("Quiz.txt");
	   Scanner Scan=new Scanner(file);
	   
	   while(Scan.hasNextLine())
	   {
		   Data=Scan.nextLine();
		   System.out.printf("%s",Data);
		   System.out.println("\n");
	   }
	}
	
}


//boolean append = true;
//pw = new PrintWriter(new FileWriter(new File("filepath.txt"), append));boolean append = true;
//pw = new PrintWriter(new FileWriter(new File("filepath.txt"), append));