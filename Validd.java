import java.io.*;
import java.lang.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;


public class Validd {

  public static void main(String argv[])  throws IOException{
	  
	  BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Welcome back!");
		System.out.println("Could you enter your username?");
		String ename = reader.readLine();
		System.out.println("Could you enter your password?");
		String epass = reader.readLine();
    try 
    {
    	
	File fXmlFile = new File("D://hello.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);
	doc.getDocumentElement().normalize();
    // System.out.println("Root element :" + doc.getDocumentElement().getNodeName());		
	NodeList nList = doc.getElementsByTagName("Details");
	for (int temp = 0; temp < nList.getLength(); temp++) 
	 {

		Node nNode = nList.item(temp);
	  //System.out.println("\nCurrent Element :" + nNode.getNodeName());
	 if (nNode.getNodeType() == Node.ELEMENT_NODE)
		{
		 
		 System.out.println("ll");
			Element eElement = (Element) nNode;
           String name1=eElement.getElementsByTagName("username").item(0).getTextContent();
           String pass1=eElement.getElementsByTagName("password").item(0).getTextContent();	
           // System.out.println("ll");
          
      	if(ename.equals(name1))
    	{
       		//System.out.println("ll");
      		if(epass.equals(pass1))
    		{
    			// redirect the user to the next place
    			System.out.println("Welcome back "+ename+"!!");
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
    			        
    			} //outer switch
    			System.out.println("You have received "+points+" points as a reward. Congratulations!");
    		}
    	 } // close third for loop
    	
		} //close verification for loop
	 
     } // close for loop
	 
    } // close try block
    
    catch (Exception e)
    {
	e.printStackTrace();
    }
    
  } //close main method

} //close class