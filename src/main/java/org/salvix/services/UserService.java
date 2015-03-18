package org.salvix.services;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;
import org.apache.commons.io.IOUtils;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.salvix.models.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

@Path("/users")
@Api(value = "/users", description = "Operations about Users")
@Produces({"application/json", "text/xml"})
public class UserService {

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @ApiOperation(value = "Find all Users", notes = "More notes about this method", response = User.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 500, message = "Something wrong in Server"),
            @ApiResponse(code = 404, message = "User not found")
    })
    public List<User> getUsers() {
        List<User> users = null;

        ObjectMapper mapper = new ObjectMapper();

        try {
            // read from file, convert it to user class
            users = mapper.readValue(IOUtils.toString(this.getClass().getResourceAsStream("/data/users.json")), new TypeReference<List<User>>() {
            });

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return users;
    }



    @GET
    @Path("/{username}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @ApiOperation(value = "Find a given user", notes = "More notes about this method", response = User.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 500, message = "Something wrong in Server"),
            @ApiResponse(code = 404, message = "User not found")
    })
    public Response getUserFromUserName(@PathParam("username") String username) {
        User user = null;
        Response response = null;

        ObjectMapper mapper = new ObjectMapper();

        try {

            JsonNode actualObj = mapper.readTree(IOUtils.toString(this.getClass().getResourceAsStream("/data/users.json")));

            Iterator<JsonNode> elements = actualObj.iterator();
            while(elements.hasNext()){
                JsonNode el = elements.next();
                JsonNode usernameNode = el.path("username");
                if(usernameNode.getTextValue().equalsIgnoreCase(username)) {
                    user = mapper.readValue(el, User.class);
                    response = Response.ok().entity(user).build();
                }
            }

            if(user == null) {
                response = Response.status(204).build();
            }

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;
    }
}