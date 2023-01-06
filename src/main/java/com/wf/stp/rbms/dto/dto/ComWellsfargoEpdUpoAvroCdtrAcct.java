package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "tp",
        "ccy",
        "nm",
        "wf_AcctFlg",
        "wf_AcctTp",
        "wf_PrdtCd",
        "wf_CpnyNb",
        "wf_SubPrdtCd"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroCdtrAcct {

    @JsonProperty("id")
    private Id__4 id;
    @JsonProperty("tp")
    private Tp__2 tp;
    @JsonProperty("ccy")
    private Object ccy;
    @JsonProperty("nm")
    private Object nm;
    @JsonProperty("wf_AcctFlg")
    private Object wfAcctFlg;
    @JsonProperty("wf_AcctTp")
    private WfAcctTp wfAcctTp;
    @JsonProperty("wf_PrdtCd")
    private Object wfPrdtCd;
    @JsonProperty("wf_CpnyNb")
    private Object wfCpnyNb;
    @JsonProperty("wf_SubPrdtCd")
    private Object wfSubPrdtCd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Id__4 getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Id__4 id) {
        this.id = id;
    }

    @JsonProperty("tp")
    public Tp__2 getTp() {
        return tp;
    }

    @JsonProperty("tp")
    public void setTp(Tp__2 tp) {
        this.tp = tp;
    }

    @JsonProperty("ccy")
    public Object getCcy() {
        return ccy;
    }

    @JsonProperty("ccy")
    public void setCcy(Object ccy) {
        this.ccy = ccy;
    }

    @JsonProperty("nm")
    public Object getNm() {
        return nm;
    }

    @JsonProperty("nm")
    public void setNm(Object nm) {
        this.nm = nm;
    }

    @JsonProperty("wf_AcctFlg")
    public Object getWfAcctFlg() {
        return wfAcctFlg;
    }

    @JsonProperty("wf_AcctFlg")
    public void setWfAcctFlg(Object wfAcctFlg) {
        this.wfAcctFlg = wfAcctFlg;
    }

    @JsonProperty("wf_AcctTp")
    public WfAcctTp getWfAcctTp() {
        return wfAcctTp;
    }

    @JsonProperty("wf_AcctTp")
    public void setWfAcctTp(WfAcctTp wfAcctTp) {
        this.wfAcctTp = wfAcctTp;
    }

    @JsonProperty("wf_PrdtCd")
    public Object getWfPrdtCd() {
        return wfPrdtCd;
    }

    @JsonProperty("wf_PrdtCd")
    public void setWfPrdtCd(Object wfPrdtCd) {
        this.wfPrdtCd = wfPrdtCd;
    }

    @JsonProperty("wf_CpnyNb")
    public Object getWfCpnyNb() {
        return wfCpnyNb;
    }

    @JsonProperty("wf_CpnyNb")
    public void setWfCpnyNb(Object wfCpnyNb) {
        this.wfCpnyNb = wfCpnyNb;
    }

    @JsonProperty("wf_SubPrdtCd")
    public Object getWfSubPrdtCd() {
        return wfSubPrdtCd;
    }

    @JsonProperty("wf_SubPrdtCd")
    public void setWfSubPrdtCd(Object wfSubPrdtCd) {
        this.wfSubPrdtCd = wfSubPrdtCd;
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
