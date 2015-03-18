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
import org.salvix.models.Transaction;
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

@Path("/transactions")
@Api(value = "/transactions", description = "Operations about Transactions")
@Produces({ "application/json", "text/xml" })
public class TransactionService {

    @GET
    @Path("/get")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @ApiOperation(value = "Find all Transactions", notes = "description of retrieving all transactions...", response = Transaction.class)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 500, message = "Something wrong in Server"),
            @ApiResponse(code = 404, message = "Transaction not found") })

    public List<Transaction> getTransactions(/*@HeaderParam("accept") String accept*/) {

        List<Transaction> acc = null;

        ObjectMapper mapper = new ObjectMapper();

        try {
            // read from file, convert it to account class
            acc = mapper.readValue(IOUtils.toString(this.getClass().getResourceAsStream("/data/transactions.json")), new TypeReference<List<Transaction>>() {
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
