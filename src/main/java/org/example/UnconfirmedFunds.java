package org.example;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
public class UnconfirmedFunds implements Funds {
    @Override
    public String getSharedField() {
        return null;
    }

    public String getUnconfirmedField() {
        return null;
    }
}
