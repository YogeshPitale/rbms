package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "com_wellsfargo_epd_upo_avro_PmtInf"
})
@Generated("jsonschema2pojo")
public class PmtInf {

    @JsonProperty("com_wellsfargo_epd_upo_avro_PmtInf")
    private ComWellsfargoEpdUpoAvroPmtInf comWellsfargoEpdUpoAvroPmtInf;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_PmtInf")
    public ComWellsfargoEpdUpoAvroPmtInf getComWellsfargoEpdUpoAvroPmtInf() {
        return comWellsfargoEpdUpoAvroPmtInf;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_PmtInf")
    public void setComWellsfargoEpdUpoAvroPmtInf(ComWellsfargoEpdUpoAvroPmtInf comWellsfargoEpdUpoAvroPmtInf) {
        this.comWellsfargoEpdUpoAvroPmtInf = comWellsfargoEpdUpoAvroPmtInf;
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
