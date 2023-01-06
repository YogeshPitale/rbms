package com.wf.stp.rbms.dto.upo;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "com_wellsfargo_epd_upo_avro_InstdAmt"
})
@Generated("jsonschema2pojo")
public class InstdAmt {

    @JsonProperty("com_wellsfargo_epd_upo_avro_InstdAmt")
    private ComWellsfargoEpdUpoAvroInstdAmt comWellsfargoEpdUpoAvroInstdAmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_InstdAmt")
    public ComWellsfargoEpdUpoAvroInstdAmt getComWellsfargoEpdUpoAvroInstdAmt() {
        return comWellsfargoEpdUpoAvroInstdAmt;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_InstdAmt")
    public void setComWellsfargoEpdUpoAvroInstdAmt(ComWellsfargoEpdUpoAvroInstdAmt comWellsfargoEpdUpoAvroInstdAmt) {
        this.comWellsfargoEpdUpoAvroInstdAmt = comWellsfargoEpdUpoAvroInstdAmt;
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
