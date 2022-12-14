package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;
import org.dozer.Mapping;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "$date"
})
@Generated("jsonschema2pojo")
public class CreatedDate {

    @Mapping("_date")
    @JsonProperty("$date")
    private String $date;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("$date")
    public String get$date() {
        return $date;
    }

    @JsonProperty("$date")
    public void set$date(String $date) {
        this.$date = $date;
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
