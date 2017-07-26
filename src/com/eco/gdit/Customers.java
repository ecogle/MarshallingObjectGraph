package com.eco.gdit;
import java.util.*;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Customers {
	
	@XmlElementWrapper
	@XmlElement(name="customers")
	private List<Customer> customers = new ArrayList<>();
	
	

	
}
