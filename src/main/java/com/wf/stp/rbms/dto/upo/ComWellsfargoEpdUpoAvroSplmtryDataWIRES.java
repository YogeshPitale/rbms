
package com.wf.stp.rbms.dto.upo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "corssBorderIndicator",
    "hsWireCustType",
    "hsWireDbSubprod",
    "hsWireRefAcct",
    "fREFnum"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroSplmtryDataWIRES {

    @JsonProperty("corssBorderIndicator")
    private Object corssBorderIndicator;
    @JsonProperty("hsWireCustType")
    private Object hsWireCustType;
    @JsonProperty("hsWireDbSubprod")
    private Object hsWireDbSubprod;
    @JsonProperty("hsWireRefAcct")
    private Object hsWireRefAcct;
    @JsonProperty("fREFnum")
    private FREFnum fREFnum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("corssBorderIndicator")
    public Object getCorssBorderIndicator() {
        return corssBorderIndicator;
    }

    @JsonProperty("corssBorderIndicator")
    public void setCorssBorderIndicator(Object corssBorderIndicator) {
        this.corssBorderIndicator = corssBorderIndicator;
    }

    @JsonProperty("hsWireCustType")
    public Object getHsWireCustType() {
        return hsWireCustType;
    }

    @JsonProperty("hsWireCustType")
    public void setHsWireCustType(Object hsWireCustType) {
        this.hsWireCustType = hsWireCustType;
    }

    @JsonProperty("hsWireDbSubprod")
    public Object getHsWireDbSubprod() {
        return hsWireDbSubprod;
    }

    @JsonProperty("hsWireDbSubprod")
    public void setHsWireDbSubprod(Object hsWireDbSubprod) {
        this.hsWireDbSubprod = hsWireDbSubprod;
    }

    @JsonProperty("hsWireRefAcct")
    public Object getHsWireRefAcct() {
        return hsWireRefAcct;
    }

    @JsonProperty("hsWireRefAcct")
    public void setHsWireRefAcct(Object hsWireRefAcct) {
        this.hsWireRefAcct = hsWireRefAcct;
    }

    @JsonProperty("fREFnum")
    public FREFnum getfREFnum() {
        return fREFnum;
    }

    @JsonProperty("fREFnum")
    public void setfREFnum(FREFnum fREFnum) {
        this.fREFnum = fREFnum;
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
