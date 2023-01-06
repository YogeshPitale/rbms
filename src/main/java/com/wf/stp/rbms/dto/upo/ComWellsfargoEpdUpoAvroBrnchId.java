package com.wf.stp.rbms.dto.upo;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "nm",
        "pstlAdr_1"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroBrnchId {

    @JsonProperty("id")
    private Object id;
    @JsonProperty("nm")
    private Object nm;
    @JsonProperty("pstlAdr_1")
    private Object pstlAdr1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Object id) {
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

    @JsonProperty("pstlAdr_1")
    public Object getPstlAdr1() {
        return pstlAdr1;
    }

    @JsonProperty("pstlAdr_1")
    public void setPstlAdr1(Object pstlAdr1) {
        this.pstlAdr1 = pstlAdr1;
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
