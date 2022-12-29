package com.wf.stp.rbms.dto.upo;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "com_wellsfargo_epd_upo_avro_Wf_EvtInf"
})
@Generated("jsonschema2pojo")
public class WfEvtInf {

    @JsonProperty("com_wellsfargo_epd_upo_avro_Wf_EvtInf")
    private ComWellsfargoEpdUpoAvroWfEvtInf comWellsfargoEpdUpoAvroWfEvtInf;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_Wf_EvtInf")
    public ComWellsfargoEpdUpoAvroWfEvtInf getComWellsfargoEpdUpoAvroWfEvtInf() {
        return comWellsfargoEpdUpoAvroWfEvtInf;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_Wf_EvtInf")
    public void setComWellsfargoEpdUpoAvroWfEvtInf(ComWellsfargoEpdUpoAvroWfEvtInf comWellsfargoEpdUpoAvroWfEvtInf) {
        this.comWellsfargoEpdUpoAvroWfEvtInf = comWellsfargoEpdUpoAvroWfEvtInf;
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
