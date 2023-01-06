package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "com_wellsfargo_epd_upo_avro_XchgRateInf"
})
@Generated("jsonschema2pojo")
public class XchgRateInf {

    @JsonProperty("com_wellsfargo_epd_upo_avro_XchgRateInf")
    private ComWellsfargoEpdUpoAvroXchgRateInf comWellsfargoEpdUpoAvroXchgRateInf;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_XchgRateInf")
    public ComWellsfargoEpdUpoAvroXchgRateInf getComWellsfargoEpdUpoAvroXchgRateInf() {
        return comWellsfargoEpdUpoAvroXchgRateInf;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_XchgRateInf")
    public void setComWellsfargoEpdUpoAvroXchgRateInf(ComWellsfargoEpdUpoAvroXchgRateInf comWellsfargoEpdUpoAvroXchgRateInf) {
        this.comWellsfargoEpdUpoAvroXchgRateInf = comWellsfargoEpdUpoAvroXchgRateInf;
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
