
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
    "finInstnId_2",
    "brnchId"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroDbtrAgt {

    @JsonProperty("finInstnId_2")
    private FinInstnId2 finInstnId2;
    @JsonProperty("brnchId")
    private BrnchId brnchId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("finInstnId_2")
    public FinInstnId2 getFinInstnId2() {
        return finInstnId2;
    }

    @JsonProperty("finInstnId_2")
    public void setFinInstnId2(FinInstnId2 finInstnId2) {
        this.finInstnId2 = finInstnId2;
    }

    @JsonProperty("brnchId")
    public BrnchId getBrnchId() {
        return brnchId;
    }

    @JsonProperty("brnchId")
    public void setBrnchId(BrnchId brnchId) {
        this.brnchId = brnchId;
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
