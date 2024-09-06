package org.example;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import io.swagger.v3.core.converter.ModelConverters;
import io.swagger.v3.core.util.Yaml;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@OpenAPIDefinition(info = @Info(title = "Hello World API", version = "1.0"))
class Main {

    //    public static final String SCHEMA_YAML = "./schema.yaml";

    public static void main(String[] args) throws IOException {

        System.out.println("Hello, World!");
        //        ModelConverters.getInstance().addClassToSkip("Funds");
        //        var model = ModelConverters.getInstance().readAll(Publication.class);
        //        File file = new File(SCHEMA_YAML);
        //        Yaml.pretty().writeValue(file, model);
    }

    @GET
    @Path("/{message}")
    @Produces(MediaType.TEXT_PLAIN)
    @Operation(
            summary = "Get a publication",
            description = "Returns a publication with a list of Funds of possibly different types",
            responses = {
                @ApiResponse(
                        responseCode = "200",
                        description = "Successful operation",
                        content =
                                @Content(
                                        mediaType = "text/plain",
                                        schema = @Schema(implementation = Publication.class)))
            })
    public Publication getPublication(String message) {
        return new Publication();
    }
}
