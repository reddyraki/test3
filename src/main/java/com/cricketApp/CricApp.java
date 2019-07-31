package com.cricketApp;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.models.Team;

@Path("/ipl")
public class CricApp {
	
	@Path("/wc")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	public Response worldcup( Team team){
		
		team.setName("ind");
		team.setWin(500);
		team.setLost(10);
		team.setRank(1);
	
				return Response.status(200).entity(team).build();
		
	}

}
