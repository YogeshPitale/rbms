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
public class ComWellsfargoEpdUpoAvroCdtAmt {

    @JsonProperty("amt")
    private Amt__3 amt;
    @JsonProperty("ccy")
    private Ccy__2 ccy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("amt")
    public Amt__3 getAmt() {
        return amt;
    }

    @JsonProperty("amt")
    public void setAmt(Amt__3 amt) {
        this.amt = amt;
    }

    @JsonProperty("ccy")
    public Ccy__2 getCcy() {
        return ccy;
    }

    @JsonProperty("ccy")
    public void setCcy(Ccy__2 ccy) {
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
