package com.cricketApp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/ipl")
public class CrickInfo {
	
@Path("/testCon")
@GET
	public Response TestConnection(){
	
	String Output="hiiii";
		
		return  Response.status(200).entity(Output).build();
	}

@Path("/testCon1")
@GET
public Response TestConnection2(@QueryParam("name") String userName){
	String Output= "the given value is "+ userName;
	
	System.out.println("the given value is " + userName);
	return Response.status(200).entity(Output).build();
	
}
	
	@Path("/greetUser/{userName}/{age}/{industry}")
	
	@GET
	public  Response greetUser(@PathParam ("userName") String name , @PathParam("age") String age,@PathParam("industry") String indus   ){
		String Output= "the given value is "+ name + "  "+ age+ " " + indus;
		
		System.out.println("the entered values are "+ name + "  "+ age+ " " + indus);
		return Response.status(200).entity(Output).build();
	
	
	
	
	
	
}

}
