import java.io.*;

public class Process {
public static void main (String args[]) throws IOException 
{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	while(true)
	{
		System.out.println("Select the type of garbage that you would like to let us know about");
	System.out.println("Press 1 for GLASS");
	System.out.println("Press 2 for PLASTIC");
	System.out.println("Press 3 for METAL");
	System.out.println("Press 4 to exit");
	System.out.println("enter your choice");
	int choice = Integer.parseInt(reader.readLine());
	int points = 0;
	switch(choice)
	{
	case 1 :
		System.out.println("Which brand does your waste belong to?");
		System.out.println("Press 1 for PEPSI");
		System.out.println("Press 2 for COCA COLA");
		System.out.println("Press 3 for FANTA");
		System.out.println("Press 4 for SPRITE");
		System.out.println("Press 5 for LIMCA");
		System.out.println("Press 6 for any other brand that wasn't mentioned above.");
		int ch1 = Integer.parseInt(reader.readLine());
		switch(ch1)
		{
		case 1: System.out.println("Enter the quantity");
	          	int p1=15;
		        int p1quan = Integer.parseInt(reader.readLine());
		        points+=p1*p1quan;
		        break;
			
		case 2: System.out.println("Enter the quantity");
		        int p2=15;
                int p2quan = Integer.parseInt(reader.readLine());
                points+=p2*p2quan;
                break;
		case 3: System.out.println("Enter the quantity");
		        int p3=20;
		        int p3quan = Integer.parseInt(reader.readLine());
		        points+=p3*p3quan;
                break;
		case 4: System.out.println("Enter the quantity");
	           	int p4=15;
		        int p4quan = Integer.parseInt(reader.readLine());
		        points+=p4*p4quan;
                break;
		case 5: System.out.println("Enter the quantity");
		        int p5=20;
		        int p5quan = Integer.parseInt(reader.readLine());
		        points+=p5*p5quan;
                break;
		case 6: System.out.println("Enter the quantity");
		        int p6=18;
		        int p6quan = Integer.parseInt(reader.readLine());
		        points+=p6*p6quan;
                break;
		}
		break;
	case 2:
		System.out.println("Which brand does your waste belong to?");
		System.out.println("Press 1 for PEPSI");
		System.out.println("Press 2 for COCA COLA");
		System.out.println("Press 3 for FANTA");
		System.out.println("Press 4 for SPRITE");
		System.out.println("Press 5 for LIMCA");
		System.out.println("Press 6 for any other brand that wasn't mentioned above.");
		int ch2 = Integer.parseInt(reader.readLine());
		switch(ch2)
		{
		case 1: System.out.println("Enter the quantity");
		        int g1=25;
		        int g1quan = Integer.parseInt(reader.readLine());
		        points+=g1*g1quan;
		        break;
			
		case 2: System.out.println("Enter the quantity");
		        int g2=25;
		        int g2quan = Integer.parseInt(reader.readLine());
		        points+=g2*g2quan;
                break;
		case 3: System.out.println("Enter the quantity");
		        int g3=28;
	            int g3quan = Integer.parseInt(reader.readLine());
	            points+=g3*g3quan;
                break;
		case 4: System.out.println("Enter the quantity");
		        int g4=35;
                int g4quan = Integer.parseInt(reader.readLine());
                points+=g4*g4quan;
                break;
		case 5: System.out.println("Enter the quantity");
		        int g5=30;
                int g5quan = Integer.parseInt(reader.readLine());
                points+=g5*g5quan;
                break;
		case 6: System.out.println("Enter the quantity");
		        int g6=22;
		        int g6quan = Integer.parseInt(reader.readLine());
		        points+=g6*g6quan;
                break;
		}
		break;
	case 3:
		System.out.println("Which type of metal does your waste consist of?");
		System.out.println("Press 1 for Aluminium");
		System.out.println("Press 2 for Copper");
		System.out.println("Press 3 for Brass");
		System.out.println("Press 4 for Steel");
		System.out.println("Press 5 for Iron");
		System.out.println("Press 6 for any other metal that wasn't mentioned above.");
		int ch3 = Integer.parseInt(reader.readLine());
		switch(ch3)
		{
		case 1: System.out.println("Enter the quantity (in mg)");
		        int m1=35;
		        int m1quan = Integer.parseInt(reader.readLine());
		        points+=m1*m1quan;
		        break;
			
		case 2: System.out.println("Enter the quantity (in mg)");
                int m2=35;
                int m2quan = Integer.parseInt(reader.readLine());
                points+=m2*m2quan;
                break;
		case 3: System.out.println("Enter the quantity (in mg)");
                int m3=38;
                int m3quan = Integer.parseInt(reader.readLine());
                points+=m3*m3quan;
                break;
		case 4: System.out.println("Enter the quantity (in mg)");
                int m4=40;
                int m4quan = Integer.parseInt(reader.readLine());
                points+=m4*m4quan;
                break;
		case 5: System.out.println("Enter the quantity (in mg)");
                int m5=30;
                int m5quan = Integer.parseInt(reader.readLine());
                points+=m5*m5quan;
                break;
		case 6: System.out.println("Enter the quantity (in mg)");
                int m6=20;
                int m6quan = Integer.parseInt(reader.readLine());
                points+=m6*m6quan;
                break;
		}
		break;
	case 4: System.exit(0);
	        break;
	        
	}
		CouponCode cd=new CouponCode();
	int len=4;
	String st= cd.makeCode(len);
	
	System.out.println("You have received "+points+" points as a reward. Use the coupon code " +st+" to redeem your points! Congratulations!");
}
}
}
