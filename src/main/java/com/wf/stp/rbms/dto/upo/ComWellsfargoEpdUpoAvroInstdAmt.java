package com.wf.stp.rbms.dto.upo;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "amt",
        "ccy"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroInstdAmt {

    @JsonProperty("amt")
    private Amt__1 amt;
    @JsonProperty("ccy")
    private Ccy ccy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("amt")
    public Amt__1 getAmt() {
        return amt;
    }

    @JsonProperty("amt")
    public void setAmt(Amt__1 amt) {
        this.amt = amt;
    }

    @JsonProperty("ccy")
    public Ccy getCcy() {
        return ccy;
    }

    @JsonProperty("ccy")
    public void setCcy(Ccy ccy) {
        this.ccy = ccy;
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
