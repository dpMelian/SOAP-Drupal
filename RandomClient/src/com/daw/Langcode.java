
package com.daw;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "value"
})
public class Langcode {

    @JsonProperty("value")
    private String value;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Langcode() {
    }

    /**
     * 
     * @param value
     */
    public Langcode(String value) {
        super();
        this.value = value;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

}
