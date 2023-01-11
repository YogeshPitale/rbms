package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;
import org.dozer.Mapping;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "$oid"
})
@Generated("jsonschema2pojo")
public class Id {


    @Mapping("_oid")
    @JsonProperty("$oid")
    private String $oid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("$oid")
    public String get$oid() {
        return $oid;
    }

    @JsonProperty("$oid")
    public void set$oid(String $oid) {
        this.$oid = $oid;
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
