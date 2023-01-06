package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;
import org.dozer.Mapping;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "$numberLong"
})
@Generated("jsonschema2pojo")
public class Long {

    @Mapping("_numberLong")
    @JsonProperty("$numberLong")
    private String $numberLong;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("$numberLong")
    public String get$numberLong() {
        return $numberLong;
    }

    @JsonProperty("$numberLong")
    public void set$numberLong(String $numberLong) {
        this.$numberLong = $numberLong;
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
