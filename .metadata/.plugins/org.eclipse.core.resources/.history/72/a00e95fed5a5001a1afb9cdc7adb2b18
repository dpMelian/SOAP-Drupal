
package com.daw;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "target_id",
    "target_type",
    "target_uuid"
})
public class Type {

    @JsonProperty("target_id")
    private String targetId;
    @JsonProperty("target_type")
    private String targetType;
    @JsonProperty("target_uuid")
    private String targetUuid;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Type() {
    }

    /**
     * 
     * @param targetId
     * @param targetType
     * @param targetUuid
     */
    public Type(String targetId, String targetType, String targetUuid) {
        super();
        this.targetId = targetId;
        this.targetType = targetType;
        this.targetUuid = targetUuid;
    }

    @JsonProperty("target_id")
    public String getTargetId() {
        return targetId;
    }

    @JsonProperty("target_id")
    public void setTargetId(String targetId) {
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

}
