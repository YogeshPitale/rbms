package com.wf.stp.rbms.dto.upo;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "com_wellsfargo_epd_upo_avro_CdtAmt"
})
@Generated("jsonschema2pojo")
public class CdtAmt {

    @JsonProperty("com_wellsfargo_epd_upo_avro_CdtAmt")
    private ComWellsfargoEpdUpoAvroCdtAmt comWellsfargoEpdUpoAvroCdtAmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_CdtAmt")
    public ComWellsfargoEpdUpoAvroCdtAmt getComWellsfargoEpdUpoAvroCdtAmt() {
        return comWellsfargoEpdUpoAvroCdtAmt;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_CdtAmt")
    public void setComWellsfargoEpdUpoAvroCdtAmt(ComWellsfargoEpdUpoAvroCdtAmt comWellsfargoEpdUpoAvroCdtAmt) {
        this.comWellsfargoEpdUpoAvroCdtAmt = comWellsfargoEpdUpoAvroCdtAmt;
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
