package com.wf.stp.rbms.dto.upo;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "_numberLong"
})
@Generated("jsonschema2pojo")
public class Long {

    @JsonProperty("_numberLong")
    private String _numberLong;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_numberLong")
    public String get_numberLong() {
        return _numberLong;
    }

    @JsonProperty("_numberLong")
    public void set_numberLong(String _numberLong) {
        this._numberLong = _numberLong;
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
