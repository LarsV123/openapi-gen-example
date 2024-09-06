package org.example;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "UnconfirmedFunds", value = UnconfirmedFunds.class),
    @JsonSubTypes.Type(name = "ConfirmedFunds", value = ConfirmedFunds.class)
})
public interface Funds {
    String getSharedField();
}
