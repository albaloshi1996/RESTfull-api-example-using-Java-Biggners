package de.dks.ws;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;
import javax.ws.rs.*;


	
	@Path("/MyService")
	@ApplicationPath("/resources")

	public class Service extends Application {

	    // http://localhost:8181/Jax-RS/resources/MyService/sayHello

	@GET
	@Path("/sayHello")

	public String getHelloMsg() {
		
	return "hello";
	
	}

	}

