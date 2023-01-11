package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "com_wellsfargo_epd_upo_avro_SplmtryData"
})
@Generated("jsonschema2pojo")
public class SplmtryData {

    @JsonProperty("com_wellsfargo_epd_upo_avro_SplmtryData")
    private ComWellsfargoEpdUpoAvroSplmtryData comWellsfargoEpdUpoAvroSplmtryData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_SplmtryData")
    public ComWellsfargoEpdUpoAvroSplmtryData getComWellsfargoEpdUpoAvroSplmtryData() {
        return comWellsfargoEpdUpoAvroSplmtryData;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_SplmtryData")
    public void setComWellsfargoEpdUpoAvroSplmtryData(ComWellsfargoEpdUpoAvroSplmtryData comWellsfargoEpdUpoAvroSplmtryData) {
        this.comWellsfargoEpdUpoAvroSplmtryData = comWellsfargoEpdUpoAvroSplmtryData;
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
