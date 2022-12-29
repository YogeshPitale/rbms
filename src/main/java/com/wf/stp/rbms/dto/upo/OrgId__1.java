package com.wf.stp.rbms.dto.upo;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "com_wellsfargo_epd_upo_avro_OrgId"
})
@Generated("jsonschema2pojo")
public class OrgId__1 {

    @JsonProperty("com_wellsfargo_epd_upo_avro_OrgId")
    private ComWellsfargoEpdUpoAvroOrgId__1 comWellsfargoEpdUpoAvroOrgId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_OrgId")
    public ComWellsfargoEpdUpoAvroOrgId__1 getComWellsfargoEpdUpoAvroOrgId() {
        return comWellsfargoEpdUpoAvroOrgId;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_OrgId")
    public void setComWellsfargoEpdUpoAvroOrgId(ComWellsfargoEpdUpoAvroOrgId__1 comWellsfargoEpdUpoAvroOrgId) {
        this.comWellsfargoEpdUpoAvroOrgId = comWellsfargoEpdUpoAvroOrgId;
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
