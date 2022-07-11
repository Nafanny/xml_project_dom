package ru.project.nafanny;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ru.project.nafanny.model.Company;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        Company company = new Company();

        File file = new File("test.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document doc = null;
        try {
            doc = dbf.newDocumentBuilder().parse(file);
        } catch (Exception e) {
        System.out.println("Open parsing error " + e.toString());
        return;
        }

        Node companyNode = doc.getFirstChild();
//        System.out.println("DOM " + companyChild.getNodeName());

        NodeList companyChilds = companyNode.getChildNodes();
        for (int i = 0; i < companyChilds.getLength(); i++) {
            if (companyChilds.item(i).getNodeType() != Node.ELEMENT_NODE){
                continue;
            }
            System.out.println("AAA " + companyChilds.item(i).getNodeName());
        }

//        System.out.println(company.toString());
    }
}
