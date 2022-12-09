
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
        "_id",
        "wfPmtOrdrPrcg",
        "pmtInf",
        "casePmtInf",
        "cstmrInf",
        "wf_EvtInf",
        "splmtryData"
})
@Generated("jsonschema2pojo")
public class Upo {

    @JsonProperty("_id")
    private Id id;
    @JsonProperty("wfPmtOrdrPrcg")
    private WfPmtOrdrPrcg wfPmtOrdrPrcg;
    @JsonProperty("pmtInf")
    private PmtInf pmtInf;
    @JsonProperty("casePmtInf")
    private Object casePmtInf;
    @JsonProperty("cstmrInf")
    private Object cstmrInf;
    @JsonProperty("wf_EvtInf")
    private WfEvtInf wfEvtInf;
    @JsonProperty("splmtryData")
    private SplmtryData splmtryData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_id")
    public Id getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(Id id) {
        this.id = id;
    }

    @JsonProperty("wfPmtOrdrPrcg")
    public WfPmtOrdrPrcg getWfPmtOrdrPrcg() {
        return wfPmtOrdrPrcg;
    }

    @JsonProperty("wfPmtOrdrPrcg")
    public void setWfPmtOrdrPrcg(WfPmtOrdrPrcg wfPmtOrdrPrcg) {
        this.wfPmtOrdrPrcg = wfPmtOrdrPrcg;
    }

    @JsonProperty("pmtInf")
    public PmtInf getPmtInf() {
        return pmtInf;
    }

    @JsonProperty("pmtInf")
    public void setPmtInf(PmtInf pmtInf) {
        this.pmtInf = pmtInf;
    }

    @JsonProperty("casePmtInf")
    public Object getCasePmtInf() {
        return casePmtInf;
    }

    @JsonProperty("casePmtInf")
    public void setCasePmtInf(Object casePmtInf) {
        this.casePmtInf = casePmtInf;
    }

    @JsonProperty("cstmrInf")
    public Object getCstmrInf() {
        return cstmrInf;
    }

    @JsonProperty("cstmrInf")
    public void setCstmrInf(Object cstmrInf) {
        this.cstmrInf = cstmrInf;
    }

    @JsonProperty("wf_EvtInf")
    public WfEvtInf getWfEvtInf() {
        return wfEvtInf;
    }

    @JsonProperty("wf_EvtInf")
    public void setWfEvtInf(WfEvtInf wfEvtInf) {
        this.wfEvtInf = wfEvtInf;
    }

    @JsonProperty("splmtryData")
    public SplmtryData getSplmtryData() {
        return splmtryData;
    }

    @JsonProperty("splmtryData")
    public void setSplmtryData(SplmtryData splmtryData) {
        this.splmtryData = splmtryData;
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
