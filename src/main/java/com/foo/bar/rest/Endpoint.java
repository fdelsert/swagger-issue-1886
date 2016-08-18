package com.foo.bar.rest;

import java.math.BigDecimal;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Stateless
@Path("/foo/")
@Api(tags = { "foo", "bar" })
public class Endpoint {

	@GET
	@Path("/bar/")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Foo", notes = "Bar")
	public BigDecimal getQuestionMoyenneScore() {
		return BigDecimal.ZERO;
	}
}
