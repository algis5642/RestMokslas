package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/MyFirstRest")

public class MyFirstExample {

    @GET
    @Path("/sayHi")
    public String sayHi() {
        return "Labas";
    }

    @GET
    @Path("/hiNumber")
    public int myNumber() {
        return 10;
    }

    @GET
    @Path("/sayHi/{name}")
    public String sayHiToUser(@PathParam("name") String userName) {
        return "Labas " + userName;
    }

    @GET
    @Path("/getStudent")
    @Produces(MediaType.APPLICATION_JSON)
    public Students getStudent() {

Students st = new Students(10, "ALgirdas", "Skri", "ALgidi@fff.lf");
  return st;
    }
}





