
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
    "com_wellsfargo_epd_upo_avro_FinInstnId_2"
})
@Generated("jsonschema2pojo")
public class FinInstnId2 {

    @JsonProperty("com_wellsfargo_epd_upo_avro_FinInstnId_2")
    private ComWellsfargoEpdUpoAvroFinInstnId2 comWellsfargoEpdUpoAvroFinInstnId2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_FinInstnId_2")
    public ComWellsfargoEpdUpoAvroFinInstnId2 getComWellsfargoEpdUpoAvroFinInstnId2() {
        return comWellsfargoEpdUpoAvroFinInstnId2;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_FinInstnId_2")
    public void setComWellsfargoEpdUpoAvroFinInstnId2(ComWellsfargoEpdUpoAvroFinInstnId2 comWellsfargoEpdUpoAvroFinInstnId2) {
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
