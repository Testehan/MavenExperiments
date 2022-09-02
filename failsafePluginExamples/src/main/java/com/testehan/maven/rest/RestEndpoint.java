package com.testehan.maven.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class RestEndpoint {
    @GET
    public String hello() {
        return "Welcome to Dan's example!";
    }
}
