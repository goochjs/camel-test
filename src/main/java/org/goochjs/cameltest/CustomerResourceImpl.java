/*
 * Copyright (C) 2013 Jeremy Gooch <http://www.linkedin.com/in/jeremygooch/>
 *
 * The licence covering the contents of this file is described in the file LICENCE.txt,
 * which should have been included as part of the distribution containing this file.
 */
package org.goochjs.cameltest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@Path("/customers")
public class CustomerResourceImpl {

	@POST
	@Path("/{type}")
	public Response newCustomer(Customer customer, @PathParam("type") String type, @QueryParam("active") @DefaultValue("true") boolean active) {
		return Response.ok(type).build();
    }

	@GET
	@Path("/{type}")
    public Response getCustomer(@PathParam("type") String type) {
		Customer output = new Customer();
		output.setId(987654);
		output.setName("Willy Wonka");
		
		return Response.ok(output).build();
    }
}
