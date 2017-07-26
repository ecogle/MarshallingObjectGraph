package com.eco.gdit;

import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import org.eclipse.persistence.oxm.annotations.*;

@SuppressWarnings("unused")

@XmlNamedObjectGraph(
	    name="contact info",
	    attributeNodes={
	        @XmlNamedAttributeNode("name"),
	        @XmlNamedAttributeNode(value="shippingAddress", subgraph="location"),
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
@Entity
public class Customer {

	@XmlAttribute
	@Id
    private int id;
 
    private String name;
 
    @OneToOne(mappedBy="address")
    private Address billingAddress;
 
    @OneToOne(mappedBy="address")
    private Address shippingAddress;
 
    @XmlElementWrapper
    @XmlElement(name="phoneNumber")
    private List<PhoneNumber> phoneNumbers;
}
