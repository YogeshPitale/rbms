
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
    "pmtId",
    "cdtDbtInd",
    "amt",
    "xchgRateInf",
    "chrgBr",
    "wf_CutoffDtTm",
    "wf_XprtnDays",
    "instrForCdtrAgt",
    "instrForNxtAgt",
    "InstrForDbtrAgt",
    "chrgsAcct",
    "chrgsAcctAgt",
    "initgPty",
    "fwdgAgt",
    "dbtr",
    "dbtrAcct",
    "dbtrAgt",
    "ultmtDbtr",
    "cdtr",
    "cdtrAcct",
    "cdtrAgt",
    "cdtrAgtAcct",
    "ultmtCdtr",
    "intrmyAgt1",
    "intrmyAgt1Acct",
    "intrmyAgt2",
    "intrmyAgt2Acct",
    "chqInstr",
    "wf_dfinf",
    "rgltryRptg",
    "rltdRmtInf",
    "rmtInf",
    "msgRcpt"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroPmtInf {

    @JsonProperty("pmtId")
    private PmtId pmtId;
    @JsonProperty("cdtDbtInd")
    private Object cdtDbtInd;
    @JsonProperty("amt")
    private Amt amt;
    @JsonProperty("xchgRateInf")
    private XchgRateInf xchgRateInf;
    @JsonProperty("chrgBr")
    private Object chrgBr;
    @JsonProperty("wf_CutoffDtTm")
    private Object wfCutoffDtTm;
    @JsonProperty("wf_XprtnDays")
    private Object wfXprtnDays;
    @JsonProperty("instrForCdtrAgt")
    private Object instrForCdtrAgt;
    @JsonProperty("instrForNxtAgt")
    private Object instrForNxtAgt;
    @JsonProperty("InstrForDbtrAgt")
    private Object instrForDbtrAgt;
    @JsonProperty("chrgsAcct")
    private Object chrgsAcct;
    @JsonProperty("chrgsAcctAgt")
    private Object chrgsAcctAgt;
    @JsonProperty("initgPty")
    private Object initgPty;
    @JsonProperty("fwdgAgt")
    private Object fwdgAgt;
    @JsonProperty("dbtr")
    private Dbtr dbtr;
    @JsonProperty("dbtrAcct")
    private DbtrAcct dbtrAcct;
    @JsonProperty("dbtrAgt")
    private DbtrAgt dbtrAgt;
    @JsonProperty("ultmtDbtr")
    private Object ultmtDbtr;
    @JsonProperty("cdtr")
    private Cdtr cdtr;
    @JsonProperty("cdtrAcct")
    private CdtrAcct cdtrAcct;
    @JsonProperty("cdtrAgt")
    private CdtrAgt cdtrAgt;
    @JsonProperty("cdtrAgtAcct")
    private Object cdtrAgtAcct;
    @JsonProperty("ultmtCdtr")
    private Object ultmtCdtr;
    @JsonProperty("intrmyAgt1")
    private Object intrmyAgt1;
    @JsonProperty("intrmyAgt1Acct")
    private Object intrmyAgt1Acct;
    @JsonProperty("intrmyAgt2")
    private Object intrmyAgt2;
    @JsonProperty("intrmyAgt2Acct")
    private Object intrmyAgt2Acct;
    @JsonProperty("chqInstr")
    private Object chqInstr;
    @JsonProperty("wf_dfinf")
    private Object wfDfinf;
    @JsonProperty("rgltryRptg")
    private Object rgltryRptg;
    @JsonProperty("rltdRmtInf")
    private Object rltdRmtInf;
    @JsonProperty("rmtInf")
    private Object rmtInf;
    @JsonProperty("msgRcpt")
    private Object msgRcpt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pmtId")
    public PmtId getPmtId() {
        return pmtId;
    }

    @JsonProperty("pmtId")
    public void setPmtId(PmtId pmtId) {
        this.pmtId = pmtId;
    }

    @JsonProperty("cdtDbtInd")
    public Object getCdtDbtInd() {
        return cdtDbtInd;
    }

    @JsonProperty("cdtDbtInd")
    public void setCdtDbtInd(Object cdtDbtInd) {
        this.cdtDbtInd = cdtDbtInd;
    }

    @JsonProperty("amt")
    public Amt getAmt() {
        return amt;
    }

    @JsonProperty("amt")
    public void setAmt(Amt amt) {
        this.amt = amt;
    }

    @JsonProperty("xchgRateInf")
    public XchgRateInf getXchgRateInf() {
        return xchgRateInf;
    }

    @JsonProperty("xchgRateInf")
    public void setXchgRateInf(XchgRateInf xchgRateInf) {
        this.xchgRateInf = xchgRateInf;
    }

    @JsonProperty("chrgBr")
    public Object getChrgBr() {
        return chrgBr;
    }

    @JsonProperty("chrgBr")
    public void setChrgBr(Object chrgBr) {
        this.chrgBr = chrgBr;
    }

    @JsonProperty("wf_CutoffDtTm")
    public Object getWfCutoffDtTm() {
        return wfCutoffDtTm;
    }

    @JsonProperty("wf_CutoffDtTm")
    public void setWfCutoffDtTm(Object wfCutoffDtTm) {
        this.wfCutoffDtTm = wfCutoffDtTm;
    }

    @JsonProperty("wf_XprtnDays")
    public Object getWfXprtnDays() {
        return wfXprtnDays;
    }

    @JsonProperty("wf_XprtnDays")
    public void setWfXprtnDays(Object wfXprtnDays) {
        this.wfXprtnDays = wfXprtnDays;
    }

    @JsonProperty("instrForCdtrAgt")
    public Object getInstrForCdtrAgt() {
        return instrForCdtrAgt;
    }

    @JsonProperty("instrForCdtrAgt")
    public void setInstrForCdtrAgt(Object instrForCdtrAgt) {
        this.instrForCdtrAgt = instrForCdtrAgt;
    }

    @JsonProperty("instrForNxtAgt")
    public Object getInstrForNxtAgt() {
        return instrForNxtAgt;
    }

    @JsonProperty("instrForNxtAgt")
    public void setInstrForNxtAgt(Object instrForNxtAgt) {
        this.instrForNxtAgt = instrForNxtAgt;
    }

    @JsonProperty("InstrForDbtrAgt")
    public Object getInstrForDbtrAgt() {
        return instrForDbtrAgt;
    }

    @JsonProperty("InstrForDbtrAgt")
    public void setInstrForDbtrAgt(Object instrForDbtrAgt) {
        this.instrForDbtrAgt = instrForDbtrAgt;
    }

    @JsonProperty("chrgsAcct")
    public Object getChrgsAcct() {
        return chrgsAcct;
    }

    @JsonProperty("chrgsAcct")
    public void setChrgsAcct(Object chrgsAcct) {
        this.chrgsAcct = chrgsAcct;
    }

    @JsonProperty("chrgsAcctAgt")
    public Object getChrgsAcctAgt() {
        return chrgsAcctAgt;
    }

    @JsonProperty("chrgsAcctAgt")
    public void setChrgsAcctAgt(Object chrgsAcctAgt) {
        this.chrgsAcctAgt = chrgsAcctAgt;
    }

    @JsonProperty("initgPty")
    public Object getInitgPty() {
        return initgPty;
    }

    @JsonProperty("initgPty")
    public void setInitgPty(Object initgPty) {
        this.initgPty = initgPty;
    }

    @JsonProperty("fwdgAgt")
    public Object getFwdgAgt() {
        return fwdgAgt;
    }

    @JsonProperty("fwdgAgt")
    public void setFwdgAgt(Object fwdgAgt) {
        this.fwdgAgt = fwdgAgt;
    }

    @JsonProperty("dbtr")
    public Dbtr getDbtr() {
        return dbtr;
    }

    @JsonProperty("dbtr")
    public void setDbtr(Dbtr dbtr) {
        this.dbtr = dbtr;
    }

    @JsonProperty("dbtrAcct")
    public DbtrAcct getDbtrAcct() {
        return dbtrAcct;
    }

    @JsonProperty("dbtrAcct")
    public void setDbtrAcct(DbtrAcct dbtrAcct) {
        this.dbtrAcct = dbtrAcct;
    }

    @JsonProperty("dbtrAgt")
    public DbtrAgt getDbtrAgt() {
        return dbtrAgt;
    }

    @JsonProperty("dbtrAgt")
    public void setDbtrAgt(DbtrAgt dbtrAgt) {
        this.dbtrAgt = dbtrAgt;
    }

    @JsonProperty("ultmtDbtr")
    public Object getUltmtDbtr() {
        return ultmtDbtr;
    }

    @JsonProperty("ultmtDbtr")
    public void setUltmtDbtr(Object ultmtDbtr) {
        this.ultmtDbtr = ultmtDbtr;
    }

    @JsonProperty("cdtr")
    public Cdtr getCdtr() {
        return cdtr;
    }

    @JsonProperty("cdtr")
    public void setCdtr(Cdtr cdtr) {
        this.cdtr = cdtr;
    }

    @JsonProperty("cdtrAcct")
    public CdtrAcct getCdtrAcct() {
        return cdtrAcct;
    }

    @JsonProperty("cdtrAcct")
    public void setCdtrAcct(CdtrAcct cdtrAcct) {
        this.cdtrAcct = cdtrAcct;
    }

    @JsonProperty("cdtrAgt")
    public CdtrAgt getCdtrAgt() {
        return cdtrAgt;
    }

    @JsonProperty("cdtrAgt")
    public void setCdtrAgt(CdtrAgt cdtrAgt) {
        this.cdtrAgt = cdtrAgt;
    }

    @JsonProperty("cdtrAgtAcct")
    public Object getCdtrAgtAcct() {
        return cdtrAgtAcct;
    }

    @JsonProperty("cdtrAgtAcct")
    public void setCdtrAgtAcct(Object cdtrAgtAcct) {
        this.cdtrAgtAcct = cdtrAgtAcct;
    }

    @JsonProperty("ultmtCdtr")
    public Object getUltmtCdtr() {
        return ultmtCdtr;
    }

    @JsonProperty("ultmtCdtr")
    public void setUltmtCdtr(Object ultmtCdtr) {
        this.ultmtCdtr = ultmtCdtr;
    }

    @JsonProperty("intrmyAgt1")
    public Object getIntrmyAgt1() {
        return intrmyAgt1;
    }

    @JsonProperty("intrmyAgt1")
    public void setIntrmyAgt1(Object intrmyAgt1) {
        this.intrmyAgt1 = intrmyAgt1;
    }

    @JsonProperty("intrmyAgt1Acct")
    public Object getIntrmyAgt1Acct() {
        return intrmyAgt1Acct;
    }

    @JsonProperty("intrmyAgt1Acct")
    public void setIntrmyAgt1Acct(Object intrmyAgt1Acct) {
        this.intrmyAgt1Acct = intrmyAgt1Acct;
    }

    @JsonProperty("intrmyAgt2")
    public Object getIntrmyAgt2() {
        return intrmyAgt2;
    }

    @JsonProperty("intrmyAgt2")
    public void setIntrmyAgt2(Object intrmyAgt2) {
        this.intrmyAgt2 = intrmyAgt2;
    }

    @JsonProperty("intrmyAgt2Acct")
    public Object getIntrmyAgt2Acct() {
        return intrmyAgt2Acct;
    }

    @JsonProperty("intrmyAgt2Acct")
    public void setIntrmyAgt2Acct(Object intrmyAgt2Acct) {
        this.intrmyAgt2Acct = intrmyAgt2Acct;
    }

    @JsonProperty("chqInstr")
    public Object getChqInstr() {
        return chqInstr;
    }

    @JsonProperty("chqInstr")
    public void setChqInstr(Object chqInstr) {
        this.chqInstr = chqInstr;
    }

    @JsonProperty("wf_dfinf")
    public Object getWfDfinf() {
        return wfDfinf;
    }

    @JsonProperty("wf_dfinf")
    public void setWfDfinf(Object wfDfinf) {
        this.wfDfinf = wfDfinf;
    }

    @JsonProperty("rgltryRptg")
    public Object getRgltryRptg() {
        return rgltryRptg;
    }

    @JsonProperty("rgltryRptg")
    public void setRgltryRptg(Object rgltryRptg) {
        this.rgltryRptg = rgltryRptg;
    }

    @JsonProperty("rltdRmtInf")
    public Object getRltdRmtInf() {
        return rltdRmtInf;
    }

    @JsonProperty("rltdRmtInf")
    public void setRltdRmtInf(Object rltdRmtInf) {
        this.rltdRmtInf = rltdRmtInf;
    }

    @JsonProperty("rmtInf")
    public Object getRmtInf() {
        return rmtInf;
    }

    @JsonProperty("rmtInf")
    public void setRmtInf(Object rmtInf) {
        this.rmtInf = rmtInf;
    }

    @JsonProperty("msgRcpt")
    public Object getMsgRcpt() {
        return msgRcpt;
    }

    @JsonProperty("msgRcpt")
    public void setMsgRcpt(Object msgRcpt) {
        this.msgRcpt = msgRcpt;
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
