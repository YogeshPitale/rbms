package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "finInstnId_2",
        "brnchId"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroCdtrAgt {

    @JsonProperty("finInstnId_2")
    private FinInstnId2__1 finInstnId2;
    @JsonProperty("brnchId")
    private BrnchId__1 brnchId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("finInstnId_2")
    public FinInstnId2__1 getFinInstnId2() {
        return finInstnId2;
    }

    @JsonProperty("finInstnId_2")
    public void setFinInstnId2(FinInstnId2__1 finInstnId2) {
        this.finInstnId2 = finInstnId2;
    }

    @JsonProperty("brnchId")
    public BrnchId__1 getBrnchId() {
        return brnchId;
    }

    @JsonProperty("brnchId")
    public void setBrnchId(BrnchId__1 brnchId) {
        this.brnchId = brnchId;
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
