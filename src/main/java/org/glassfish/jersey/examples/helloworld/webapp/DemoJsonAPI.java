package org.glassfish.jersey.examples.helloworld.webapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("testJSON")
public class DemoJsonAPI {
    
	@GET
    @Produces("MediaType.TEXT_JSON")
    public String getJSON() {
        return "{\"DBHopperURL\":\"jdbc:teradata://hopper.vip.ebay.com/TD2\",\"DBHopperUser\":\"mayangupta\"}";
    }
}
