
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
public class ComWellsfargoEpdUpoAvroDbtrAcct {

    @JsonProperty("id")
    private Id__2 id;
    @JsonProperty("tp")
    private Tp__1 tp;
    @JsonProperty("ccy")
    private Object ccy;
    @JsonProperty("nm")
    private Object nm;
    @JsonProperty("wf_AcctFlg")
    private Object wfAcctFlg;
    @JsonProperty("wf_AcctTp")
    private Object wfAcctTp;
    @JsonProperty("wf_PrdtCd")
    private Object wfPrdtCd;
    @JsonProperty("wf_CpnyNb")
    private Object wfCpnyNb;
    @JsonProperty("wf_SubPrdtCd")
    private Object wfSubPrdtCd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Id__2 getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Id__2 id) {
        this.id = id;
    }

    @JsonProperty("tp")
    public Tp__1 getTp() {
        return tp;
    }

    @JsonProperty("tp")
    public void setTp(Tp__1 tp) {
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
    public Object getWfAcctTp() {
        return wfAcctTp;
    }

    @JsonProperty("wf_AcctTp")
    public void setWfAcctTp(Object wfAcctTp) {
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
