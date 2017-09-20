
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;




public class CreateQuiz {
	enum Q_type{mc,tf,num};
	String Title;
	String Description;
	String Answer;
	int Choice;
	String Question;
	String a;
	String b;
	String c;
	String d;
	String max_score;
	int index;
	
	
	public void C_quiz() throws FileNotFoundException  //function to create Quiz
	{

		File file = new File("Quiz.txt");
		PrintWriter output= new PrintWriter(file);
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter title Of the Quiz");
		Title=scanner.nextLine();
		output.println(Title);
		System.out.println("Enter Description Of the Quiz");
		Description=scanner.nextLine();
		output.println(Description);
		System.out.println("Enter Nmuber of Questions you want to add.");
		Choice=scanner.nextInt();
		int i=0;
		while (i<Choice)
		{
			
				
				System.out.printf("Enter Question %d",i+1);
				scanner.nextLine();
				Question=scanner.nextLine();
				output.println(Question);
				System.out.println("\nEnter Answers as a,b,c,d :");
				a=scanner.nextLine();
				output.println(a);
				b=scanner.nextLine();
				output.println(b);
				c=scanner.nextLine();
				output.println(c);
				d=scanner.nextLine();
				output.println(d);
				i++;
	    }

		
		System.out.println("Quiz file Created.");
		scanner.close();
		output.close();
    }
}
