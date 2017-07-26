package com.eco.gdit;



import java.io.File;
import javax.xml.bind.*;
import javax.xml.bind.JAXBContext;

import org.eclipse.persistence.jaxb.*;

 
public class Demo {
 
    public static void main(String[] args) throws Exception {
        JAXBContext jc = JAXBContext.newInstance(Customer.class);
         
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        File xml = new File("src/blog/objectgraphs/metadata/input.xml");
        Customer customer = (Customer) unmarshaller.unmarshal(xml);
        File xmlOut = new File("src/blog/objectgraphs/metadata/output.xml");
         
        // Output XML
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(customer, System.out);
         
        // Output XML - Based on Object Graph
        marshaller.setProperty(MarshallerProperties.OBJECT_GRAPH, "contactInfo");
        
        marshaller.marshal(customer, System.out);
 
        // Output JSON - Based on Object Graph
//        marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
//        marshaller.setProperty(MarshallerProperties.JSON_INCLUDE_ROOT, false);
//        marshaller.setProperty(MarshallerProperties.JSON_WRAPPER_AS_ARRAY_NAME, true);
//        marshaller.marshal(customer, System.out);
        marshaller.marshal(customer, xmlOut);
    }
 
}
