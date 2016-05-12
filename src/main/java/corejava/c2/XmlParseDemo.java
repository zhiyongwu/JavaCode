package corejava.c2;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by wuzhiyong on 2016/5/12
 */
public class XmlParseDemo {
    public void parse() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            File f = new File("C:/Users/Admin/Desktop/demo.xml");
            Document doc = builder.parse(f);
            Element root = doc.getDocumentElement();
            NodeList nodes = root.getChildNodes();
            for (int i = 0; i < nodes.getLength(); i++) {
                Node child = nodes.item(i);
                if (child instanceof Element){
                    Element childElement = (Element) child;
                    Text textNode = (Text) childElement.getFirstChild();
                    String text = textNode.getData().trim();
                    System.out.println(text);
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new XmlParseDemo().parse();
    }
}
