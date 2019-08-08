import java.io.File;
import java.io.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;


public class MyFirst{ 

    public static void main(String[] args) throws IOException 
    {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    // ask for the users name
    System.out.println("Enter your name!");	
    String name1 = reader.readLine(); 
    // ask for users password (not in asterisk notation : work on that later)
    System.out.println("Please enter your password.");
    String pass1 = reader.readLine();
    
    
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            //add elements to Document
            Element rootElement =
                doc.createElementNS("https://www.rubicon.com/edeets", "Data");
            //append root element to document
            doc.appendChild(rootElement);

            //append first child element to root element
            rootElement.appendChild(getDetails(doc,name1,pass1));

        

            //for output to file, console
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            //for pretty print
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);

            //write to console or file
            StreamResult console = new StreamResult(System.out);
            StreamResult file = new StreamResult(new File("D://hello.xml"));

            //write data
            transformer.transform(source, console);
            transformer.transform(source, file);
            System.out.println("DONE");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static Node getDetails(Document doc, String username, String password) {
        Element appo = doc.createElement("Details");

       
        //create name element
        appo.appendChild(getElements(doc, appo, "username", username));

        //create age element
        appo.appendChild(getElements(doc, appo, "password", password));

        

        return appo;
    }


    //utility method to create text node
    private static Node getElements(Document doc, Element element, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }

}


