
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
    "com_wellsfargo_epd_upo_avro_Othr"
})
@Generated("jsonschema2pojo")
public class Othr__2 {

    @JsonProperty("com_wellsfargo_epd_upo_avro_Othr")
    private ComWellsfargoEpdUpoAvroOthr__1 comWellsfargoEpdUpoAvroOthr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_Othr")
    public ComWellsfargoEpdUpoAvroOthr__1 getComWellsfargoEpdUpoAvroOthr() {
        return comWellsfargoEpdUpoAvroOthr;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_Othr")
    public void setComWellsfargoEpdUpoAvroOthr(ComWellsfargoEpdUpoAvroOthr__1 comWellsfargoEpdUpoAvroOthr) {
        this.comWellsfargoEpdUpoAvroOthr = comWellsfargoEpdUpoAvroOthr;
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
