package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "com_wellsfargo_epd_upo_avro_BrnchId_2"
})
@Generated("jsonschema2pojo")
public class BrnchId__1 {

    @JsonProperty("com_wellsfargo_epd_upo_avro_BrnchId_2")
    private ComWellsfargoEpdUpoAvroBrnchId2 comWellsfargoEpdUpoAvroBrnchId2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_BrnchId_2")
    public ComWellsfargoEpdUpoAvroBrnchId2 getComWellsfargoEpdUpoAvroBrnchId2() {
        return comWellsfargoEpdUpoAvroBrnchId2;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_BrnchId_2")
    public void setComWellsfargoEpdUpoAvroBrnchId2(ComWellsfargoEpdUpoAvroBrnchId2 comWellsfargoEpdUpoAvroBrnchId2) {
        this.comWellsfargoEpdUpoAvroBrnchId2 = comWellsfargoEpdUpoAvroBrnchId2;
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
