import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;


@ApplicationPath("/rest")

public class RestConfig extends ResourceConfig {
    public RestConfig(){
        packages("rest");
    }

}
