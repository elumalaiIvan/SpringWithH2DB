package com.Spring.ExternalService.Model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private String type;
    private Value value;

    public Quote() { }

    @JsonGetter("type1")
    public String getType() {
        return type;
    }

    public void setType(String type)  {
        if (type == "success") this.type = null;
         this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Quote(String type, Value value) {
        this.type = type;
        this.value = value;
    }
}
