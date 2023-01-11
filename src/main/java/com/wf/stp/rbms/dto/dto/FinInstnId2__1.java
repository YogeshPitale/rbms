package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "com_wellsfargo_epd_upo_avro_FinInstnId_2"
})
@Generated("jsonschema2pojo")
public class FinInstnId2__1 {

    @JsonProperty("com_wellsfargo_epd_upo_avro_FinInstnId_2")
    private ComWellsfargoEpdUpoAvroFinInstnId2__1 comWellsfargoEpdUpoAvroFinInstnId2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_FinInstnId_2")
    public ComWellsfargoEpdUpoAvroFinInstnId2__1 getComWellsfargoEpdUpoAvroFinInstnId2() {
        return comWellsfargoEpdUpoAvroFinInstnId2;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_FinInstnId_2")
    public void setComWellsfargoEpdUpoAvroFinInstnId2(ComWellsfargoEpdUpoAvroFinInstnId2__1 comWellsfargoEpdUpoAvroFinInstnId2) {
        this.comWellsfargoEpdUpoAvroFinInstnId2 = comWellsfargoEpdUpoAvroFinInstnId2;
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
