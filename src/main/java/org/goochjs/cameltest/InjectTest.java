package org.goochjs.cameltest;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.apache.camel.Exchange;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;

public class InjectTest {

	@POST @Path("/customers/{type}")
    public Response newCustomer(Customer customer, @PathParam("type") String type, @QueryParam("active") @DefaultValue("true") boolean active) {
		return null;
    }

	// TODO - does this take in the Exchange?
	// https://svn.apache.org/repos/asf/camel/trunk/components/camel-cxf/src/test/java/org/apache/camel/component/cxf/jaxrs/simplebinding/CxfRsConsumerSimpleBindingTest.java
	public void process(Exchange exchange) throws Exception {
        Customer c = exchange.getIn().getBody(Customer.class);
//        assertNotNull(c);
//        assertEquals(123, c.getId());
        System.out.println("A bit woo and a bit wahey " + c.getName());
    }
}
