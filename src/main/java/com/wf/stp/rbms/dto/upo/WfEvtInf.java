
package com.wf.stp.rbms.dto.upo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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
