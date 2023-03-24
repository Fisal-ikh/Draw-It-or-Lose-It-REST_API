/*
 * Author Fisal Ikhmayes
 * Source code from: Southern New Hampshire University
 * class: CS 230
 * date: 03/24/23
 * 
 */

package com.gamingroom.gameauth.healthcheck;

import java.util.Map.Entry;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.health.HealthCheck.Result;
import com.codahale.metrics.health.HealthCheckRegistry;

@Produces(MediaType.APPLICATION_JSON)
@Path("/status")
public class HealthCheckController 
{
	private HealthCheckRegistry registry;

	public HealthCheckController(HealthCheckRegistry registry) {
		this.registry = registry;
	}
	
	@GET
	public Set<Entry<String, Result>> getStatus(){
		return registry.runHealthChecks().entrySet();
	}
}