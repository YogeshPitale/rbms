package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "com_wellsfargo_epd_upo_avro_DbtrAcct"
})
@Generated("jsonschema2pojo")
public class DbtrAcct {

    @JsonProperty("com_wellsfargo_epd_upo_avro_DbtrAcct")
    private ComWellsfargoEpdUpoAvroDbtrAcct comWellsfargoEpdUpoAvroDbtrAcct;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_DbtrAcct")
    public ComWellsfargoEpdUpoAvroDbtrAcct getComWellsfargoEpdUpoAvroDbtrAcct() {
        return comWellsfargoEpdUpoAvroDbtrAcct;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_DbtrAcct")
    public void setComWellsfargoEpdUpoAvroDbtrAcct(ComWellsfargoEpdUpoAvroDbtrAcct comWellsfargoEpdUpoAvroDbtrAcct) {
        this.comWellsfargoEpdUpoAvroDbtrAcct = comWellsfargoEpdUpoAvroDbtrAcct;
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
