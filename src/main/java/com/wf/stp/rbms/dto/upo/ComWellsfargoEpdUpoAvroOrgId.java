
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
    "anyBic",
    "estblishdDt",
    "regnDt",
    "regnCtry",
    "othr"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroOrgId {

    @JsonProperty("anyBic")
    private AnyBic anyBic;
    @JsonProperty("estblishdDt")
    private Object estblishdDt;
    @JsonProperty("regnDt")
    private Object regnDt;
    @JsonProperty("regnCtry")
    private Object regnCtry;
    @JsonProperty("othr")
    private Othr othr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("anyBic")
    public AnyBic getAnyBic() {
        return anyBic;
    }

    @JsonProperty("anyBic")
    public void setAnyBic(AnyBic anyBic) {
        this.anyBic = anyBic;
    }

    @JsonProperty("estblishdDt")
    public Object getEstblishdDt() {
        return estblishdDt;
    }

    @JsonProperty("estblishdDt")
    public void setEstblishdDt(Object estblishdDt) {
        this.estblishdDt = estblishdDt;
    }

    @JsonProperty("regnDt")
    public Object getRegnDt() {
        return regnDt;
    }

    @JsonProperty("regnDt")
    public void setRegnDt(Object regnDt) {
        this.regnDt = regnDt;
    }

    @JsonProperty("regnCtry")
    public Object getRegnCtry() {
        return regnCtry;
    }

    @JsonProperty("regnCtry")
    public void setRegnCtry(Object regnCtry) {
        this.regnCtry = regnCtry;
    }

    @JsonProperty("othr")
    public Othr getOthr() {
        return othr;
    }

    @JsonProperty("othr")
    public void setOthr(Othr othr) {
        this.othr = othr;
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
