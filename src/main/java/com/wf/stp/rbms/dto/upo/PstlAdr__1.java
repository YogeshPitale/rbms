
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
    "com_wellsfargo_epd_upo_avro_PstlAdr_1"
})
@Generated("jsonschema2pojo")
public class PstlAdr__1 {

    @JsonProperty("com_wellsfargo_epd_upo_avro_PstlAdr_1")
    private ComWellsfargoEpdUpoAvroPstlAdr1 comWellsfargoEpdUpoAvroPstlAdr1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_PstlAdr_1")
    public ComWellsfargoEpdUpoAvroPstlAdr1 getComWellsfargoEpdUpoAvroPstlAdr1() {
        return comWellsfargoEpdUpoAvroPstlAdr1;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_PstlAdr_1")
    public void setComWellsfargoEpdUpoAvroPstlAdr1(ComWellsfargoEpdUpoAvroPstlAdr1 comWellsfargoEpdUpoAvroPstlAdr1) {
        this.comWellsfargoEpdUpoAvroPstlAdr1 = comWellsfargoEpdUpoAvroPstlAdr1;
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
