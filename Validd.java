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
      	         Process p = new Process();
         p.main(args);
		}
	  }
    	
		} //close verification for loop
	 
     } // close for loop
	 
    } // close try block
    
    catch (Exception e)
    {
	e.printStackTrace();
    }
    
  } //close main method

} //close class
