package xml_parser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class AnimalParser {

	public static void main(String[] args) {

		File file = new File("C:\\Eclipse_Workspace\\XML_and_XMLParsers\\src\\xml_parser\\file.xml");
		
		

		DocumentBuilder db;
		Document doc;
		Element root;

		try {

			db = DocumentBuilderFactory.newInstance().newDocumentBuilder(); 
			doc = db.parse(file);
			root = doc.getDocumentElement();

			System.out.println(root.getNodeName());
			
			NodeList nodeList = root.getChildNodes();
			
			for (int i = 0; i < nodeList.getLength(); i++) {
				
				Node node = nodeList.item(i);
				
				if(node.getNodeType() == Node.ELEMENT_NODE) {
					
					Element element = (Element) node;
					
					System.out.println(element.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue());
					System.out.println(element.getElementsByTagName("breed").item(0).getChildNodes().item(0).getNodeValue());
				}
				
				
			}
			
			

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
