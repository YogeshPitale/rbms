package com.wf.stp.rbms.dto.upo;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "unitCcy",
        "wf_QtdCcy",
        "xchgRate",
        "rateTp",
        "ctrctId",
        "wf_CtrctTp",
        "wf_BuySellInd"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroXchgRateInf {

    @JsonProperty("unitCcy")
    private Object unitCcy;
    @JsonProperty("wf_QtdCcy")
    private Object wfQtdCcy;
    @JsonProperty("xchgRate")
    private XchgRate xchgRate;
    @JsonProperty("rateTp")
    private Object rateTp;
    @JsonProperty("ctrctId")
    private Object ctrctId;
    @JsonProperty("wf_CtrctTp")
    private Object wfCtrctTp;
    @JsonProperty("wf_BuySellInd")
    private Object wfBuySellInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("unitCcy")
    public Object getUnitCcy() {
        return unitCcy;
    }

    @JsonProperty("unitCcy")
    public void setUnitCcy(Object unitCcy) {
        this.unitCcy = unitCcy;
    }

    @JsonProperty("wf_QtdCcy")
    public Object getWfQtdCcy() {
        return wfQtdCcy;
    }

    @JsonProperty("wf_QtdCcy")
    public void setWfQtdCcy(Object wfQtdCcy) {
        this.wfQtdCcy = wfQtdCcy;
    }

    @JsonProperty("xchgRate")
    public XchgRate getXchgRate() {
        return xchgRate;
    }

    @JsonProperty("xchgRate")
    public void setXchgRate(XchgRate xchgRate) {
        this.xchgRate = xchgRate;
    }

    @JsonProperty("rateTp")
    public Object getRateTp() {
        return rateTp;
    }

    @JsonProperty("rateTp")
    public void setRateTp(Object rateTp) {
        this.rateTp = rateTp;
    }

    @JsonProperty("ctrctId")
    public Object getCtrctId() {
        return ctrctId;
    }

    @JsonProperty("ctrctId")
    public void setCtrctId(Object ctrctId) {
        this.ctrctId = ctrctId;
    }

    @JsonProperty("wf_CtrctTp")
    public Object getWfCtrctTp() {
        return wfCtrctTp;
    }

    @JsonProperty("wf_CtrctTp")
    public void setWfCtrctTp(Object wfCtrctTp) {
        this.wfCtrctTp = wfCtrctTp;
    }

    @JsonProperty("wf_BuySellInd")
    public Object getWfBuySellInd() {
        return wfBuySellInd;
    }

    @JsonProperty("wf_BuySellInd")
    public void setWfBuySellInd(Object wfBuySellInd) {
        this.wfBuySellInd = wfBuySellInd;
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
