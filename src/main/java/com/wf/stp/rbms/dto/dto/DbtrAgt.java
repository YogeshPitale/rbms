package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "com_wellsfargo_epd_upo_avro_DbtrAgt"
})
@Generated("jsonschema2pojo")
public class DbtrAgt {

    @JsonProperty("com_wellsfargo_epd_upo_avro_DbtrAgt")
    private ComWellsfargoEpdUpoAvroDbtrAgt comWellsfargoEpdUpoAvroDbtrAgt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_DbtrAgt")
    public ComWellsfargoEpdUpoAvroDbtrAgt getComWellsfargoEpdUpoAvroDbtrAgt() {
        return comWellsfargoEpdUpoAvroDbtrAgt;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_DbtrAgt")
    public void setComWellsfargoEpdUpoAvroDbtrAgt(ComWellsfargoEpdUpoAvroDbtrAgt comWellsfargoEpdUpoAvroDbtrAgt) {
        this.comWellsfargoEpdUpoAvroDbtrAgt = comWellsfargoEpdUpoAvroDbtrAgt;
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
