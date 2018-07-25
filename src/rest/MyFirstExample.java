package rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;


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

    @GET
    @Path("/getStudents")
    public List<Students> getStudents() {
        List<Students> students = new ArrayList<>();
        students.add(new Students(12, "Andrius", "Balt", "rrrr"));
        students.add(new Students(12, "Andrius", "Balt", "rrrr"));
        return students;
    }

    @POST
    @Path("/saveStudent")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Students save(Students students) {
        students.setId(11);
        students.setName(students.getName() + "!!!!");
        students.setSurname(students.getSurname() + "!!!!");
        students.setEmail(students.getEmail() + "!!!");
        return students;
    }


}





