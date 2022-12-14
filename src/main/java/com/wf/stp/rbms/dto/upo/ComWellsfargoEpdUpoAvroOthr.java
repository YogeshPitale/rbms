package com.wf.stp.rbms.dto.upo;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "schmeNm",
        "issr",
        "prxy"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroOthr {

    @JsonProperty("id")
    private Id__3 id;
    @JsonProperty("schmeNm")
    private Object schmeNm;
    @JsonProperty("issr")
    private Object issr;
    @JsonProperty("prxy")
    private Prxy prxy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Id__3 getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Id__3 id) {
        this.id = id;
    }

    @JsonProperty("schmeNm")
    public Object getSchmeNm() {
        return schmeNm;
    }

    @JsonProperty("schmeNm")
    public void setSchmeNm(Object schmeNm) {
        this.schmeNm = schmeNm;
    }

    @JsonProperty("issr")
    public Object getIssr() {
        return issr;
    }

    @JsonProperty("issr")
    public void setIssr(Object issr) {
        this.issr = issr;
    }

    @JsonProperty("prxy")
    public Prxy getPrxy() {
        return prxy;
    }

    @JsonProperty("prxy")
    public void setPrxy(Prxy prxy) {
        this.prxy = prxy;
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
