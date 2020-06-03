
package com.daw;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "alias",
    "pid",
    "langcode"
})
public class Path {

    @JsonProperty("alias")
    private String alias;
    @JsonProperty("pid")
    private Integer pid;
    @JsonProperty("langcode")
    private String langcode;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Path() {
    }

    /**
     * 
     * @param langcode
     * @param alias
     * @param pid
     */
    public Path(String alias, Integer pid, String langcode) {
        super();
        this.alias = alias;
        this.pid = pid;
        this.langcode = langcode;
    }

    @JsonProperty("alias")
    public String getAlias() {
        return alias;
    }

    @JsonProperty("alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    @JsonProperty("pid")
    public Integer getPid() {
        return pid;
    }

    @JsonProperty("pid")
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @JsonProperty("langcode")
    public String getLangcode() {
        return langcode;
    }

    @JsonProperty("langcode")
    public void setLangcode(String langcode) {
        this.langcode = langcode;
    }

}
