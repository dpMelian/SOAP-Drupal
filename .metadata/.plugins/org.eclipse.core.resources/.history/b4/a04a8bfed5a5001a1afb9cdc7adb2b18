
package com.daw;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "target_id",
    "target_type",
    "target_uuid",
    "url"
})
public class FieldAmbito {

    @JsonProperty("target_id")
    private Integer targetId;
    @JsonProperty("target_type")
    private String targetType;
    @JsonProperty("target_uuid")
    private String targetUuid;
    @JsonProperty("url")
    private String url;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FieldAmbito() {
    }

    /**
     * 
     * @param targetId
     * @param targetType
     * @param targetUuid
     * @param url
     */
    public FieldAmbito(Integer targetId, String targetType, String targetUuid, String url) {
        super();
        this.targetId = targetId;
        this.targetType = targetType;
        this.targetUuid = targetUuid;
        this.url = url;
    }

    @JsonProperty("target_id")
    public Integer getTargetId() {
        return targetId;
    }

    @JsonProperty("target_id")
    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    @JsonProperty("target_type")
    public String getTargetType() {
        return targetType;
    }

    @JsonProperty("target_type")
    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    @JsonProperty("target_uuid")
    public String getTargetUuid() {
        return targetUuid;
    }

    @JsonProperty("target_uuid")
    public void setTargetUuid(String targetUuid) {
        this.targetUuid = targetUuid;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

}
