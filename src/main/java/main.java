import java.io.*;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class main {
    public static void main(String[] args) throws IOException, JAXBException {
        File file = new File("items.xml");

        JAXBContext context = JAXBContext.newInstance(items.class);
        Unmarshaller un = context.createUnmarshaller();
        items itemData = (items) un.unmarshal(file);

        List items = itemData.getitem();

        for(item e: items){
            System.out.println("DataType : "+e.getDataType());
            System.out.println("Name : "+e.getName());
            System.out.println("Data : "+e.getData());
            System.out.println("Group : "+e.getGroup());
            System.out.println("--------------------------");
        }
    }
}