
package com.daw;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "value"
})
public class Vid {

    @JsonProperty("value")
    private Integer value;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Vid() {
    }

    /**
     * 
     * @param value
     */
    public Vid(Integer value) {
        super();
        this.value = value;
    }

    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

}
