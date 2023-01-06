package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "com_wellsfargo_epd_upo_avro_Othr"
})
@Generated("jsonschema2pojo")
public class Othr__1 {

    @JsonProperty("com_wellsfargo_epd_upo_avro_Othr")
    private ComWellsfargoEpdUpoAvroOthr comWellsfargoEpdUpoAvroOthr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_Othr")
    public ComWellsfargoEpdUpoAvroOthr getComWellsfargoEpdUpoAvroOthr() {
        return comWellsfargoEpdUpoAvroOthr;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_Othr")
    public void setComWellsfargoEpdUpoAvroOthr(ComWellsfargoEpdUpoAvroOthr comWellsfargoEpdUpoAvroOthr) {
        this.comWellsfargoEpdUpoAvroOthr = comWellsfargoEpdUpoAvroOthr;
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
