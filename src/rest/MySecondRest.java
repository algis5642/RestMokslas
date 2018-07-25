package rest;

import rest.utils.DbUtils;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@Path("/student")
    public class MySecondRest {
    @GET
    @Path("/students")
    @Produces(MediaType.APPLICATION_JSON)

    public List<Students> GetStudents(){
        List<Students> students = new ArrayList<>();
        DbUtils dbUtils = new DbUtils();
        Connection connection = dbUtils.createConnection();
        if (connection != null) {


            Statement statement = null;
            try {
                statement = connection.createStatement();

                ResultSet resultSet = statement.executeQuery("SELECT * FROM Students");
                while (resultSet.next()){
                    students.add(new Students(resultSet.getInt("id"), resultSet.getString("Name"), resultSet.getString("Surname"),resultSet.getString("email"), resultSet.getString("phone")));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
        return students;
    }

    @GET
    @Path("/{id}/student")
    @Produces(MediaType.APPLICATION_JSON)
    public Students getStudent(@PathParam("id") int id){
        DbUtils dbUtils = new DbUtils();
        Connection connection = dbUtils.createConnection();
        Students students = new Students();

        if (connection != null){

            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from Students WHERE id="+id);
                resultSet.next();

                students = new Students(resultSet.getInt("id"), resultSet.getString("Name"), resultSet.getString("Surname"),resultSet.getString("email"), resultSet.getString("phone"));


            } catch (SQLException e) {
                e.printStackTrace();
            }


        }return students;
    }

}

