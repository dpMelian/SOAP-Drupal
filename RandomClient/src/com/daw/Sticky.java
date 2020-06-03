
package com.daw;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "value"
})
public class Sticky {

    @JsonProperty("value")
    private Boolean value;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sticky() {
    }

    /**
     * 
     * @param value
     */
    public Sticky(Boolean value) {
        super();
        this.value = value;
    }

    @JsonProperty("value")
    public Boolean getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Boolean value) {
        this.value = value;
    }

}
