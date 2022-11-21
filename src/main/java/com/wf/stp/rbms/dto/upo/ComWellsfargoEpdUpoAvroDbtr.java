
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
    "nm",
    "shrtNm",
    "gvnNm",
    "mdlNm",
    "surNm",
    "sfx",
    "pstlAdr",
    "dbtrId",
    "ctryOfRes",
    "ctctDtls",
    "wf_NtfctnDtls"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroDbtr {

    @JsonProperty("nm")
    private Nm nm;
    @JsonProperty("shrtNm")
    private Object shrtNm;
    @JsonProperty("gvnNm")
    private Object gvnNm;
    @JsonProperty("mdlNm")
    private Object mdlNm;
    @JsonProperty("surNm")
    private Object surNm;
    @JsonProperty("sfx")
    private Object sfx;
    @JsonProperty("pstlAdr")
    private PstlAdr pstlAdr;
    @JsonProperty("dbtrId")
    private DbtrId dbtrId;
    @JsonProperty("ctryOfRes")
    private Object ctryOfRes;
    @JsonProperty("ctctDtls")
    private Object ctctDtls;
    @JsonProperty("wf_NtfctnDtls")
    private Object wfNtfctnDtls;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nm")
    public Nm getNm() {
        return nm;
    }

    @JsonProperty("nm")
    public void setNm(Nm nm) {
        this.nm = nm;
    }

    @JsonProperty("shrtNm")
    public Object getShrtNm() {
        return shrtNm;
    }

    @JsonProperty("shrtNm")
    public void setShrtNm(Object shrtNm) {
        this.shrtNm = shrtNm;
    }

    @JsonProperty("gvnNm")
    public Object getGvnNm() {
        return gvnNm;
    }

    @JsonProperty("gvnNm")
    public void setGvnNm(Object gvnNm) {
        this.gvnNm = gvnNm;
    }

    @JsonProperty("mdlNm")
    public Object getMdlNm() {
        return mdlNm;
    }

    @JsonProperty("mdlNm")
    public void setMdlNm(Object mdlNm) {
        this.mdlNm = mdlNm;
    }

    @JsonProperty("surNm")
    public Object getSurNm() {
        return surNm;
    }

    @JsonProperty("surNm")
    public void setSurNm(Object surNm) {
        this.surNm = surNm;
    }

    @JsonProperty("sfx")
    public Object getSfx() {
        return sfx;
    }

    @JsonProperty("sfx")
    public void setSfx(Object sfx) {
        this.sfx = sfx;
    }

    @JsonProperty("pstlAdr")
    public PstlAdr getPstlAdr() {
        return pstlAdr;
    }

    @JsonProperty("pstlAdr")
    public void setPstlAdr(PstlAdr pstlAdr) {
        this.pstlAdr = pstlAdr;
    }

    @JsonProperty("dbtrId")
    public DbtrId getDbtrId() {
        return dbtrId;
    }

    @JsonProperty("dbtrId")
    public void setDbtrId(DbtrId dbtrId) {
        this.dbtrId = dbtrId;
    }

    @JsonProperty("ctryOfRes")
    public Object getCtryOfRes() {
        return ctryOfRes;
    }

    @JsonProperty("ctryOfRes")
    public void setCtryOfRes(Object ctryOfRes) {
        this.ctryOfRes = ctryOfRes;
    }

    @JsonProperty("ctctDtls")
    public Object getCtctDtls() {
        return ctctDtls;
    }

    @JsonProperty("ctctDtls")
    public void setCtctDtls(Object ctctDtls) {
        this.ctctDtls = ctctDtls;
    }

    @JsonProperty("wf_NtfctnDtls")
    public Object getWfNtfctnDtls() {
        return wfNtfctnDtls;
    }

    @JsonProperty("wf_NtfctnDtls")
    public void setWfNtfctnDtls(Object wfNtfctnDtls) {
        this.wfNtfctnDtls = wfNtfctnDtls;
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
