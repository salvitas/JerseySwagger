package org.salvix.services;

import com.github.javafaker.Faker;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;
import org.apache.commons.io.IOUtils;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.salvix.models.Iban;
import org.salvix.models.User;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Path("/ibans")
@Api(value = "/ibans", description = "Operations about Ibans")
@Produces({ "application/json", "text/xml" })
public class IbanService {

    @GET
    @Path("/get")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @ApiOperation(value = "Find all Ibans", notes = "description of retrieving all ibans...", response = Iban.class)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 500, message = "Something wrong in Server"),
            @ApiResponse(code = 404, message = "Iban not found") })

    public List<Iban> getIbans(/*@HeaderParam("accept") String accept*/) {

        List<Iban> acc = null;

        ObjectMapper mapper = new ObjectMapper();

        try {
            // read from file, convert it to account class
            acc = mapper.readValue(IOUtils.toString(this.getClass().getResourceAsStream("/data/ibans.json")), new TypeReference<List<Iban>>() {
            });

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return acc;

    }
}
