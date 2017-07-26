package com.eco.gdit;

import java.util.List;


import javax.xml.bind.annotation.*;
import org.eclipse.persistence.oxm.annotations.*;

@SuppressWarnings("unused")

@XmlNamedObjectGraph(
	    name="contactInfo",
	    attributeNodes={
	        @XmlNamedAttributeNode("name"),
	        @XmlNamedAttributeNode(value="billingAddress", subgraph="location"),
	        @XmlNamedAttributeNode(value="phoneNumbers", subgraph="simple")
	    },
	    subgraphs={
	        @XmlNamedSubgraph(
	            name="location",
	            attributeNodes = { 
	                @XmlNamedAttributeNode("city"),
	                @XmlNamedAttributeNode("province")
	            }
	        )
	    }
	)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Customer {

	@XmlAttribute
    private int id;
 
    private String name;
 
    private Address billingAddress;
 
    private Address shippingAddress;
 
    @XmlElementWrapper
    @XmlElement(name="phoneNumber")
    private List<PhoneNumber> phoneNumbers;
}
