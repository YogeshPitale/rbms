package com.wf.stp.rbms.dto.upo;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "com_wellsfargo_epd_upo_avro_WfPmtOrdrPrcg"
})
@Generated("jsonschema2pojo")
public class WfPmtOrdrPrcg {

    @JsonProperty("com_wellsfargo_epd_upo_avro_WfPmtOrdrPrcg")
    private ComWellsfargoEpdUpoAvroWfPmtOrdrPrcg comWellsfargoEpdUpoAvroWfPmtOrdrPrcg;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_WfPmtOrdrPrcg")
    public ComWellsfargoEpdUpoAvroWfPmtOrdrPrcg getComWellsfargoEpdUpoAvroWfPmtOrdrPrcg() {
        return comWellsfargoEpdUpoAvroWfPmtOrdrPrcg;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_WfPmtOrdrPrcg")
    public void setComWellsfargoEpdUpoAvroWfPmtOrdrPrcg(ComWellsfargoEpdUpoAvroWfPmtOrdrPrcg comWellsfargoEpdUpoAvroWfPmtOrdrPrcg) {
        this.comWellsfargoEpdUpoAvroWfPmtOrdrPrcg = comWellsfargoEpdUpoAvroWfPmtOrdrPrcg;
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
