package global.citytech.rest;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author rajudhital on 5/1/19
 * @project quarkus
 */
@Path("ping")
public class PingResource {

    @GET
    public Response doPing(){
        JsonObject jsonObject = Json.createObjectBuilder()
                .add("code",0)
                .add("message","SUCCESS")
                .build();
        return Response.ok(jsonObject).build();
    }
}
