
package com.daw;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "value",
    "format",
    "processed",
    "summary"
})
public class Body {

    @JsonProperty("value")
    private String value;
    @JsonProperty("format")
    private String format;
    @JsonProperty("processed")
    private String processed;
    @JsonProperty("summary")
    private String summary;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Body() {
    }

    /**
     * 
     * @param summary
     * @param processed
     * @param format
     * @param value
     */
    public Body(String value, String format, String processed, String summary) {
        super();
        this.value = value;
        this.format = format;
        this.processed = processed;
        this.summary = summary;
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

    @JsonProperty("processed")
    public String getProcessed() {
        return processed;
    }

    @JsonProperty("processed")
    public void setProcessed(String processed) {
        this.processed = processed;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

}
