package lesson_17;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
//Написать программу для парсинга xml документа. Необходимо распарсить xml документ и
//содержимое тегов line записать в другой документ. Название файла для записи должно
//состоять из значений тегов и имеет вид: <firstName>_<lastName>_<title>.txt
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        StringBuilder stringBuilder = new StringBuilder();

        Document document = builder.parse(new File("D:\\Java\\intelliJproject\\new\\src\\lesson_17\\file.xml"));

        NodeList nodeList = (document).getElementsByTagName("lines");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == 1) {
                Element element = (Element) node;
                NodeList lines = element.getElementsByTagName("line");
                for (int j = 0; j < lines.getLength(); j++) {
                    stringBuilder.append(lines.item(j).getTextContent());
                    stringBuilder.append("\n");
                }
            }
            System.out.println(stringBuilder);
        }
        String fileName = document.getElementsByTagName("firstName").item(0).getTextContent() +
                '_' +
                document.getElementsByTagName("lastName").item(0).getTextContent() +
                '_' +
                document.getElementsByTagName("title").item(0).getTextContent();
        System.out.println(fileName);
        try (FileWriter writer = new FileWriter("D:\\Java\\intelliJproject\\new\\src\\lesson_17\\" + fileName + ".txt", false)) {
            writer.write(String.valueOf(stringBuilder));
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

