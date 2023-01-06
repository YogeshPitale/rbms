package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "applId",
        "pmtRail",
        "pmtDlvryTp",
        "pmtTp",
        "applCstmrId",
        "applUsrId",
        "pmtDesc",
        "thrdPtyId",
        "pmtOrdrId",
        "acctSvcrId",
        "clrSysInf",
        "applFileId",
        "pmtErr",
        "tplInf",
        "acctTracId",
        "cstmrInf",
        "pmtTrckrUUID"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroWfPmtOrdrPrcg {

    @JsonProperty("applId")
    private ApplId applId;
    @JsonProperty("pmtRail")
    private PmtRail pmtRail;
    @JsonProperty("pmtDlvryTp")
    private Object pmtDlvryTp;
    @JsonProperty("pmtTp")
    private PmtTp pmtTp;
    @JsonProperty("applCstmrId")
    private Object applCstmrId;
    @JsonProperty("applUsrId")
    private Object applUsrId;
    @JsonProperty("pmtDesc")
    private PmtDesc pmtDesc;
    @JsonProperty("thrdPtyId")
    private Object thrdPtyId;
    @JsonProperty("pmtOrdrId")
    private PmtOrdrId pmtOrdrId;
    @JsonProperty("acctSvcrId")
    private Object acctSvcrId;
    @JsonProperty("clrSysInf")
    private Object clrSysInf;
    @JsonProperty("applFileId")
    private ApplFileId applFileId;
    @JsonProperty("pmtErr")
    private Object pmtErr;
    @JsonProperty("tplInf")
    private Object tplInf;
    @JsonProperty("acctTracId")
    private Object acctTracId;
    @JsonProperty("cstmrInf")
    private Object cstmrInf;
    @JsonProperty("pmtTrckrUUID")
    private Object pmtTrckrUUID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("applId")
    public ApplId getApplId() {
        return applId;
    }

    @JsonProperty("applId")
    public void setApplId(ApplId applId) {
        this.applId = applId;
    }

    @JsonProperty("pmtRail")
    public PmtRail getPmtRail() {
        return pmtRail;
    }

    @JsonProperty("pmtRail")
    public void setPmtRail(PmtRail pmtRail) {
        this.pmtRail = pmtRail;
    }

    @JsonProperty("pmtDlvryTp")
    public Object getPmtDlvryTp() {
        return pmtDlvryTp;
    }

    @JsonProperty("pmtDlvryTp")
    public void setPmtDlvryTp(Object pmtDlvryTp) {
        this.pmtDlvryTp = pmtDlvryTp;
    }

    @JsonProperty("pmtTp")
    public PmtTp getPmtTp() {
        return pmtTp;
    }

    @JsonProperty("pmtTp")
    public void setPmtTp(PmtTp pmtTp) {
        this.pmtTp = pmtTp;
    }

    @JsonProperty("applCstmrId")
    public Object getApplCstmrId() {
        return applCstmrId;
    }

    @JsonProperty("applCstmrId")
    public void setApplCstmrId(Object applCstmrId) {
        this.applCstmrId = applCstmrId;
    }

    @JsonProperty("applUsrId")
    public Object getApplUsrId() {
        return applUsrId;
    }

    @JsonProperty("applUsrId")
    public void setApplUsrId(Object applUsrId) {
        this.applUsrId = applUsrId;
    }

    @JsonProperty("pmtDesc")
    public PmtDesc getPmtDesc() {
        return pmtDesc;
    }

    @JsonProperty("pmtDesc")
    public void setPmtDesc(PmtDesc pmtDesc) {
        this.pmtDesc = pmtDesc;
    }

    @JsonProperty("thrdPtyId")
    public Object getThrdPtyId() {
        return thrdPtyId;
    }

    @JsonProperty("thrdPtyId")
    public void setThrdPtyId(Object thrdPtyId) {
        this.thrdPtyId = thrdPtyId;
    }

    @JsonProperty("pmtOrdrId")
    public PmtOrdrId getPmtOrdrId() {
        return pmtOrdrId;
    }

    @JsonProperty("pmtOrdrId")
    public void setPmtOrdrId(PmtOrdrId pmtOrdrId) {
        this.pmtOrdrId = pmtOrdrId;
    }

    @JsonProperty("acctSvcrId")
    public Object getAcctSvcrId() {
        return acctSvcrId;
    }

    @JsonProperty("acctSvcrId")
    public void setAcctSvcrId(Object acctSvcrId) {
        this.acctSvcrId = acctSvcrId;
    }

    @JsonProperty("clrSysInf")
    public Object getClrSysInf() {
        return clrSysInf;
    }

    @JsonProperty("clrSysInf")
    public void setClrSysInf(Object clrSysInf) {
        this.clrSysInf = clrSysInf;
    }

    @JsonProperty("applFileId")
    public ApplFileId getApplFileId() {
        return applFileId;
    }

    @JsonProperty("applFileId")
    public void setApplFileId(ApplFileId applFileId) {
        this.applFileId = applFileId;
    }

    @JsonProperty("pmtErr")
    public Object getPmtErr() {
        return pmtErr;
    }

    @JsonProperty("pmtErr")
    public void setPmtErr(Object pmtErr) {
        this.pmtErr = pmtErr;
    }

    @JsonProperty("tplInf")
    public Object getTplInf() {
        return tplInf;
    }

    @JsonProperty("tplInf")
    public void setTplInf(Object tplInf) {
        this.tplInf = tplInf;
    }

    @JsonProperty("acctTracId")
    public Object getAcctTracId() {
        return acctTracId;
    }

    @JsonProperty("acctTracId")
    public void setAcctTracId(Object acctTracId) {
        this.acctTracId = acctTracId;
    }

    @JsonProperty("cstmrInf")
    public Object getCstmrInf() {
        return cstmrInf;
    }

    @JsonProperty("cstmrInf")
    public void setCstmrInf(Object cstmrInf) {
        this.cstmrInf = cstmrInf;
    }

    @JsonProperty("pmtTrckrUUID")
    public Object getPmtTrckrUUID() {
        return pmtTrckrUUID;
    }

    @JsonProperty("pmtTrckrUUID")
    public void setPmtTrckrUUID(Object pmtTrckrUUID) {
        this.pmtTrckrUUID = pmtTrckrUUID;
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
