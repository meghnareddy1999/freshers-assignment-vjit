import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main (String args[]) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Hello there!");
		System.out.println("Press 1 if you're a new user.");
		System.out.println("Press 2 if you'd like to log in.");
		System.out.println("enter your choice");
		int choice = Integer.parseInt(reader.readLine());
        switch(choice)
        {
        case 1:
        	MyFirst mf= new MyFirst();
        	mf.main(args);
        case 2:
        	Validd vd= new Validd();
        	vd.main(args);
        }
		
	}

}
