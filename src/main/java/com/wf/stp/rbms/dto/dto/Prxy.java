package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "com_wellsfargo_epd_upo_avro_Prxy"
})
@Generated("jsonschema2pojo")
public class Prxy {

    @JsonProperty("com_wellsfargo_epd_upo_avro_Prxy")
    private ComWellsfargoEpdUpoAvroPrxy comWellsfargoEpdUpoAvroPrxy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_Prxy")
    public ComWellsfargoEpdUpoAvroPrxy getComWellsfargoEpdUpoAvroPrxy() {
        return comWellsfargoEpdUpoAvroPrxy;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_Prxy")
    public void setComWellsfargoEpdUpoAvroPrxy(ComWellsfargoEpdUpoAvroPrxy comWellsfargoEpdUpoAvroPrxy) {
        this.comWellsfargoEpdUpoAvroPrxy = comWellsfargoEpdUpoAvroPrxy;
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
