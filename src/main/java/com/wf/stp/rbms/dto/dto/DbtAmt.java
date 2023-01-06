package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "com_wellsfargo_epd_upo_avro_DbtAmt"
})
@Generated("jsonschema2pojo")
public class DbtAmt {

    @JsonProperty("com_wellsfargo_epd_upo_avro_DbtAmt")
    private ComWellsfargoEpdUpoAvroDbtAmt comWellsfargoEpdUpoAvroDbtAmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_DbtAmt")
    public ComWellsfargoEpdUpoAvroDbtAmt getComWellsfargoEpdUpoAvroDbtAmt() {
        return comWellsfargoEpdUpoAvroDbtAmt;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_DbtAmt")
    public void setComWellsfargoEpdUpoAvroDbtAmt(ComWellsfargoEpdUpoAvroDbtAmt comWellsfargoEpdUpoAvroDbtAmt) {
        this.comWellsfargoEpdUpoAvroDbtAmt = comWellsfargoEpdUpoAvroDbtAmt;
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
