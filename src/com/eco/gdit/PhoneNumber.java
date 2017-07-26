package com.eco.gdit;

import javax.xml.bind.annotation.*;
import org.eclipse.persistence.oxm.annotations.*;


@XmlNamedObjectGraph(
	    name="simple",
	    attributeNodes={
	        @XmlNamedAttributeNode("value"),
	    }
	)
	@XmlAccessorType(XmlAccessType.FIELD)
public class PhoneNumber {
	@XmlAttribute
    private String type;
     
    @XmlValue
    private String value;
}
