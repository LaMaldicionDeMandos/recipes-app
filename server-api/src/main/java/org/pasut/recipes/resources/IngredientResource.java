package org.pasut.recipes.resources;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Singleton;

@Singleton
@Path("ingredient")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class IngredientResource {
	private static Logger log = LoggerFactory.getLogger(IngredientResource.class);
	
	@GET
	@Path("test")
	public List<String> getTest() {
		log.info("call test resource");
		return Arrays.asList("test1", "test2", "test3");
	}
}
