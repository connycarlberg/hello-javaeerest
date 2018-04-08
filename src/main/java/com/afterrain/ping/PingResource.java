/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afterrain.ping;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author conny
 */
@Path("pings")
public class PingResource {

    @GET
    @Produces({"application/json"})
    public JsonArray pings() {
        System.out.println("into pings");
        JsonArrayBuilder jsonArrayBuilder = Json.createArrayBuilder();

        jsonArrayBuilder.add(
                Json.createObjectBuilder()
                .add("id", 1)
                .add("from", "hello-javaeerest")
                .add("title", "ping number 1")
        );

        jsonArrayBuilder.add(
                Json.createObjectBuilder()
                .add("id", 2)
                .add("from", "hello-javaeerest")
                .add("title", "ping number two")
        );
        
        return jsonArrayBuilder.build();
    }

    @GET
    @Path("first")
    @Produces({"application/json"})
    public Ping ping() {
        System.out.println("into first");
        return new Ping(1, "hello-javaeerest", "first ping");
    }

}
