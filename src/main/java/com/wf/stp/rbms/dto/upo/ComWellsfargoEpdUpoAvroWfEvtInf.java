package com.wf.stp.rbms.dto.upo;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "evtTp",
        "evtId",
        "evtNm",
        "evtDtTm",
        "evtUsrId",
        "evtOrgtnChnl",
        "evtDesc",
        "evtApplSts",
        "evtTxSts",
        "evtRcncltnInf"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroWfEvtInf {

    @JsonProperty("evtTp")
    private Object evtTp;
    @JsonProperty("evtId")
    private Object evtId;
    @JsonProperty("evtNm")
    private Object evtNm;
    @JsonProperty("evtDtTm")
    private EvtDtTm evtDtTm;
    @JsonProperty("evtUsrId")
    private Object evtUsrId;
    @JsonProperty("evtOrgtnChnl")
    private Object evtOrgtnChnl;
    @JsonProperty("evtDesc")
    private EvtDesc evtDesc;
    @JsonProperty("evtApplSts")
    private EvtApplSts evtApplSts;
    @JsonProperty("evtTxSts")
    private Object evtTxSts;
    @JsonProperty("evtRcncltnInf")
    private Object evtRcncltnInf;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("evtTp")
    public Object getEvtTp() {
        return evtTp;
    }

    @JsonProperty("evtTp")
    public void setEvtTp(Object evtTp) {
        this.evtTp = evtTp;
    }

    @JsonProperty("evtId")
    public Object getEvtId() {
        return evtId;
    }

    @JsonProperty("evtId")
    public void setEvtId(Object evtId) {
        this.evtId = evtId;
    }

    @JsonProperty("evtNm")
    public Object getEvtNm() {
        return evtNm;
    }

    @JsonProperty("evtNm")
    public void setEvtNm(Object evtNm) {
        this.evtNm = evtNm;
    }

    @JsonProperty("evtDtTm")
    public EvtDtTm getEvtDtTm() {
        return evtDtTm;
    }

    @JsonProperty("evtDtTm")
    public void setEvtDtTm(EvtDtTm evtDtTm) {
        this.evtDtTm = evtDtTm;
    }

    @JsonProperty("evtUsrId")
    public Object getEvtUsrId() {
        return evtUsrId;
    }

    @JsonProperty("evtUsrId")
    public void setEvtUsrId(Object evtUsrId) {
        this.evtUsrId = evtUsrId;
    }

    @JsonProperty("evtOrgtnChnl")
    public Object getEvtOrgtnChnl() {
        return evtOrgtnChnl;
    }

    @JsonProperty("evtOrgtnChnl")
    public void setEvtOrgtnChnl(Object evtOrgtnChnl) {
        this.evtOrgtnChnl = evtOrgtnChnl;
    }

    @JsonProperty("evtDesc")
    public EvtDesc getEvtDesc() {
        return evtDesc;
    }

    @JsonProperty("evtDesc")
    public void setEvtDesc(EvtDesc evtDesc) {
        this.evtDesc = evtDesc;
    }

    @JsonProperty("evtApplSts")
    public EvtApplSts getEvtApplSts() {
        return evtApplSts;
    }

    @JsonProperty("evtApplSts")
    public void setEvtApplSts(EvtApplSts evtApplSts) {
        this.evtApplSts = evtApplSts;
    }

    @JsonProperty("evtTxSts")
    public Object getEvtTxSts() {
        return evtTxSts;
    }

    @JsonProperty("evtTxSts")
    public void setEvtTxSts(Object evtTxSts) {
        this.evtTxSts = evtTxSts;
    }

    @JsonProperty("evtRcncltnInf")
    public Object getEvtRcncltnInf() {
        return evtRcncltnInf;
    }

    @JsonProperty("evtRcncltnInf")
    public void setEvtRcncltnInf(Object evtRcncltnInf) {
        this.evtRcncltnInf = evtRcncltnInf;
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
