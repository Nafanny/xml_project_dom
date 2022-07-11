package ru.project.nafanny;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ru.project.nafanny.model.Company;
import ru.project.nafanny.model.Staff;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Company company = new Company();

        Document doc;
        try {
            doc = buildDocument();
        } catch (Exception e) {
            System.out.println("Open parsing error " + e.toString());
            return;
        }

        Node companyNode = doc.getFirstChild();
            System.out.println("First teg " + companyNode.getNodeName());

        Node staffNode = null;

        NodeList companyChilds = companyNode.getChildNodes();
        for (int i = 0; i < companyChilds.getLength(); i++) {
            if (companyChilds.item(i).getNodeType() != Node.ELEMENT_NODE){
                continue;
            }
            System.out.println("List teg " + companyChilds.item(i).getNodeName());
        }
    }
    private static Document buildDocument() throws Exception {
        File file = new File("test.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document doc = null;
        return doc = dbf.newDocumentBuilder().parse(file);
    }
}

