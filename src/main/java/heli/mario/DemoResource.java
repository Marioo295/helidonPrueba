package heli.mario;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("demo-config")
public class DemoResource {
    
    @GET
    public String getDemoInfo() {
        return "Información estática";
    }
}