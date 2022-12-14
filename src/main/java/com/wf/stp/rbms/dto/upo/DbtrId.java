package com.wf.stp.rbms.dto.upo;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "com_wellsfargo_epd_upo_avro_Id"
})
@Generated("jsonschema2pojo")
public class DbtrId {

    @JsonProperty("com_wellsfargo_epd_upo_avro_Id")
    private ComWellsfargoEpdUpoAvroId comWellsfargoEpdUpoAvroId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_Id")
    public ComWellsfargoEpdUpoAvroId getComWellsfargoEpdUpoAvroId() {
        return comWellsfargoEpdUpoAvroId;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_Id")
    public void setComWellsfargoEpdUpoAvroId(ComWellsfargoEpdUpoAvroId comWellsfargoEpdUpoAvroId) {
        this.comWellsfargoEpdUpoAvroId = comWellsfargoEpdUpoAvroId;
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
