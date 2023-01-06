package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "com_wellsfargo_epd_upo_avro_Id_1"
})
@Generated("jsonschema2pojo")
public class Id__4 {

    @JsonProperty("com_wellsfargo_epd_upo_avro_Id_1")
    private ComWellsfargoEpdUpoAvroId1__1 comWellsfargoEpdUpoAvroId1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_Id_1")
    public ComWellsfargoEpdUpoAvroId1__1 getComWellsfargoEpdUpoAvroId1() {
        return comWellsfargoEpdUpoAvroId1;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_Id_1")
    public void setComWellsfargoEpdUpoAvroId1(ComWellsfargoEpdUpoAvroId1__1 comWellsfargoEpdUpoAvroId1) {
        this.comWellsfargoEpdUpoAvroId1 = comWellsfargoEpdUpoAvroId1;
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
