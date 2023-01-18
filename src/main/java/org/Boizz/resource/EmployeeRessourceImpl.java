package org.Boizz.resource;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.model.Ablesung;

@Path("employees")
public class EmployeeRessourceImpl {

	@GET
	@Path("combiZaeh")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Response getEmployeeAllemps() {
		return null;
	}

	@GET
	@Path("xmlZaeh")
	@Produces(MediaType.APPLICATION_XML)
	public Response getEmployeeXML() {
		return null;
	}

	@GET
	@Path("jsonZaeh")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeJSON() {
		return null;
	}

	@GET
	@Path("empbyid/{userID}")
	@Produces(MediaType.APPLICATION_XML)
	public Response getEmpById(@PathParam("userID") int id) {
		return null;
	}

	@PUT
	@Path("addzaeh")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addZaehler(Ablesung zaehler) {

		return null;
	}

	@PUT
	@Path("update")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateZaehler(Ablesung zaehler) {
		return null;
	}

	@PUT
	@Path("delete")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteZaehler(Ablesung zaehler) {
		return null;
	}

}
