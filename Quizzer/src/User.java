
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class User {
	
	String Username;
	int Password;
	enum Role{Teacher,Student};
	int Score;
	
	
	
public boolean Login(String Name,int Pass) throws FileNotFoundException
{
	boolean value=false;
	File file= new File("login.txt");
	
	Scanner data= new Scanner(file);
	
	while(data.hasNextLine())
	{
		if(data.next().equalsIgnoreCase(Name) && data.nextInt()==Pass)
		{
			value=true;
		}
	}
	
	data.close();
	return value;
	
}
	

	public static void main(String[] args) throws FileNotFoundException 
	{
		// TODO Auto-generated method stub
		User Zain=new User();
		
		try {
			System.out.println("Enter User name");
			Scanner data= new Scanner(System.in);
			String name=data.nextLine();
			System.out.println("Enter Password");
			int pass=data.nextInt();
					
			boolean value=Zain.Login(name, pass);
			if(value==true)
			{
				System.out.println("Login Succesful");
			}
			else
				System.out.println("Login not Possible! Enter correct values");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CreateQuiz Quiz=new CreateQuiz();
		Quiz.C_quiz();
		View view=new View();
		view.View_Q();
	}

}
