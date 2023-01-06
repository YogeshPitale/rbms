package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "com_wellsfargo_epd_upo_avro_Dbtr"
})
@Generated("jsonschema2pojo")
public class Dbtr {

    @JsonProperty("com_wellsfargo_epd_upo_avro_Dbtr")
    private ComWellsfargoEpdUpoAvroDbtr comWellsfargoEpdUpoAvroDbtr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_Dbtr")
    public ComWellsfargoEpdUpoAvroDbtr getComWellsfargoEpdUpoAvroDbtr() {
        return comWellsfargoEpdUpoAvroDbtr;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_Dbtr")
    public void setComWellsfargoEpdUpoAvroDbtr(ComWellsfargoEpdUpoAvroDbtr comWellsfargoEpdUpoAvroDbtr) {
        this.comWellsfargoEpdUpoAvroDbtr = comWellsfargoEpdUpoAvroDbtr;
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
