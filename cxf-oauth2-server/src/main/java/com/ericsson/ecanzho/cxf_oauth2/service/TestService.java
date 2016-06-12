package com.ericsson.ecanzho.cxf_oauth2.service;

import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by ecanzho on 6/12/2016.
 */
@Service
@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
public class TestService {

    @GET
    @Path("/ping")
    public String test() {
        return "pong!";
    }
}
