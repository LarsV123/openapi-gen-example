package org.example;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

@Schema(name = "publication")
public class Publication {
    @ArraySchema(schema = @Schema(
      oneOf = {
        UnconfirmedFunds.class,
        ConfirmedFunds.class
      }))
    public List<Funds> getFunds() {
        return null;
    }


    public Funds singleFund() {
        return null;
    }

    public String publicationField() {
        return null;
    }
}