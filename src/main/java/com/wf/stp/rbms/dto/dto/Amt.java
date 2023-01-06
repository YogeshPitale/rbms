package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "com_wellsfargo_epd_upo_avro_Amt"
})
@Generated("jsonschema2pojo")
public class Amt {

    @JsonProperty("com_wellsfargo_epd_upo_avro_Amt")
    private ComWellsfargoEpdUpoAvroAmt comWellsfargoEpdUpoAvroAmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_Amt")
    public ComWellsfargoEpdUpoAvroAmt getComWellsfargoEpdUpoAvroAmt() {
        return comWellsfargoEpdUpoAvroAmt;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_Amt")
    public void setComWellsfargoEpdUpoAvroAmt(ComWellsfargoEpdUpoAvroAmt comWellsfargoEpdUpoAvroAmt) {
        this.comWellsfargoEpdUpoAvroAmt = comWellsfargoEpdUpoAvroAmt;
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
