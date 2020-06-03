
package com.daw;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "value",
    "format"
})
public class RevisionTimestamp {

    @JsonProperty("value")
    private String value;
    @JsonProperty("format")
    private String format;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RevisionTimestamp() {
    }

    /**
     * 
     * @param format
     * @param value
     */
    public RevisionTimestamp(String value, String format) {
        super();
        this.value = value;
        this.format = format;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

}
