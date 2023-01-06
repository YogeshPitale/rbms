package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "orgId",
        "prvtId"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroId {

    @JsonProperty("orgId")
    private OrgId orgId;
    @JsonProperty("prvtId")
    private Object prvtId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("orgId")
    public OrgId getOrgId() {
        return orgId;
    }

    @JsonProperty("orgId")
    public void setOrgId(OrgId orgId) {
        this.orgId = orgId;
    }

    @JsonProperty("prvtId")
    public Object getPrvtId() {
        return prvtId;
    }

    @JsonProperty("prvtId")
    public void setPrvtId(Object prvtId) {
        this.prvtId = prvtId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
