package sax_parser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;



public class SAXParserXML {
	private static ArrayList<Cat> cats = new ArrayList<Cat>();

	public static void main(String[] args) {

		File file = new File("C:\\Eclipse_Workspace\\XML_and_XMLParsers\\src\\main\\java\\sax_parser\\file.xml");
		File fileResult = new File("C:\\Eclipse_Workspace\\XML_and_XMLParsers\\src\\main\\java\\sax_parser\\fileResult.xml");

		try {
			 SAXParserFactory factory = SAXParserFactory.newInstance();
		     SAXParser parser = factory.newSAXParser();
			SearchingXMLHandler handler = new SearchingXMLHandler();
			
			parser.parse(file, handler);
			
			XMLOutputFactory  output = XMLOutputFactory.newInstance();
			XMLStreamWriter writer = output.createXMLStreamWriter(new FileWriter(fileResult));
			
			 writer.writeStartDocument("1.1");
		     writer.writeStartElement("animal");
		     
		     for (Cat cat : cats) {
		    	 
		    	 writer.writeStartElement("cat");
		    	 
		    	 writer.writeStartElement("name");
		    	 writer.writeCharacters(cat.getName());
		    	 writer.writeEndElement();
		    	 
		    	 writer.writeStartElement("breed");
		    	 writer.writeCharacters(cat.getBreed());
		    	 writer.writeEndElement();
		    	 
		    	 writer.writeStartElement("weight");
		    	 writer.writeCharacters(Double.toString(cat.getWeight()));
		    	 writer.writeEndElement();
		    	 
		    	 writer.writeStartElement("age");
		    	 writer.writeCharacters(Integer.toString(cat.getAge()));
		    	 writer.writeEndElement();
		    	 
		    	 writer.writeEndElement();
				
				
			}
		     
		     writer.writeEndElement();
		     writer.writeEndDocument();
		     
		     writer.flush();
			

			

		} catch (ParserConfigurationException | SAXException | IOException | XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Cat cat : cats) {
			
			System.out.println(cat.toString());
			
		}

	}

	private static class SearchingXMLHandler extends DefaultHandler {

		private String lastElementName;
		private String name;
		private String breed;
		private String weight;
		private String age;

		SearchingXMLHandler() {
		}

		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes)
				throws SAXException {
			
			lastElementName = qName;

		}
		
		
		@Override
		public void characters(char[] ch, int start, int length) {
			
			 String information = new String(ch, start, length);
			 
			 information = information.replace("\n", "").trim();
			 
			 if (!information.isEmpty()) {
				 
	                if (lastElementName.equals("name")) {
	                    name = information;
	                }
	                if (lastElementName.equals("breed")) {
	                	breed = information;
	                }
	                if (lastElementName.equals("weight")) {
	                	weight = information;
	                }
	                if (lastElementName.equals("age")) {
	                	age = information;
	                }
	            }
			 
		 }
			 
			  @Override
		 public void endElement(String uri, String localName, String qName) 
				 throws SAXException{
				 
				 if((name != null && !name.isEmpty()) && (breed != null && !breed.isEmpty()) && (weight != null && !weight.isEmpty()) && (age != null && !age.isEmpty())) {
					 
					 cats.add(new Cat(name, breed,  Double.parseDouble(weight), Integer.parseInt(age)));
					 
					 name = null;
					 breed	= null;
					 weight = null;
					 age = null;
				 } 

		}

	}

}
