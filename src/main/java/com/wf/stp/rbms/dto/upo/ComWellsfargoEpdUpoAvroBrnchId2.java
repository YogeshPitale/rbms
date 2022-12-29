package com.wf.stp.rbms.dto.upo;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "nm",
        "pstlAdr_2"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroBrnchId2 {

    @JsonProperty("id")
    private Id__6 id;
    @JsonProperty("nm")
    private Object nm;
    @JsonProperty("pstlAdr_2")
    private Object pstlAdr2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Id__6 getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Id__6 id) {
        this.id = id;
    }

    @JsonProperty("nm")
    public Object getNm() {
        return nm;
    }

    @JsonProperty("nm")
    public void setNm(Object nm) {
        this.nm = nm;
    }

    @JsonProperty("pstlAdr_2")
    public Object getPstlAdr2() {
        return pstlAdr2;
    }

    @JsonProperty("pstlAdr_2")
    public void setPstlAdr2(Object pstlAdr2) {
        this.pstlAdr2 = pstlAdr2;
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
