package newpcg.files;

import com.thoughtworks.xstream.XStream;
import newpcg.files.json.SimpleObject;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlParserEx {

    String xmlPath = "src\\main\\resources\\log4j2.xml";

    public void parseXml() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = f.newDocumentBuilder();
        Document doc = builder.parse(new File(xmlPath));
        NodeList list = doc.getChildNodes();
        Node node = list.item(0);
        NamedNodeMap map = node.getAttributes();
        System.out.println(map.getNamedItem("status"));
    }

    public void toXml() {
        SimpleObject object = new SimpleObject();
        object.setAge(15);
        object.setCity("Rome");
        object.setCountry("Italy");
        object.setName("Mario");

        XStream xStream = new XStream();
        xStream.processAnnotations(SimpleObject.class);
        String xml = xStream.toXML(object);
        System.out.println(xml);
        System.out.println(xStream.fromXML(xml));
    }

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        XmlParserEx parser = new XmlParserEx();
        parser.parseXml();
        parser.toXml();
    }
}
