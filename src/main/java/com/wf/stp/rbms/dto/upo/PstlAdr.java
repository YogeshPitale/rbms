package com.wf.stp.rbms.dto.upo;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "com_wellsfargo_epd_upo_avro_PstlAdr"
})
@Generated("jsonschema2pojo")
public class PstlAdr {

    @JsonProperty("com_wellsfargo_epd_upo_avro_PstlAdr")
    private ComWellsfargoEpdUpoAvroPstlAdr comWellsfargoEpdUpoAvroPstlAdr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_PstlAdr")
    public ComWellsfargoEpdUpoAvroPstlAdr getComWellsfargoEpdUpoAvroPstlAdr() {
        return comWellsfargoEpdUpoAvroPstlAdr;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_PstlAdr")
    public void setComWellsfargoEpdUpoAvroPstlAdr(ComWellsfargoEpdUpoAvroPstlAdr comWellsfargoEpdUpoAvroPstlAdr) {
        this.comWellsfargoEpdUpoAvroPstlAdr = comWellsfargoEpdUpoAvroPstlAdr;
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
