package com.wf.stp.rbms.dto.upo;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "adrLine",
        "adrTp",
        "dept",
        "subDept",
        "strtNm",
        "bldgNb",
        "pstCd",
        "twnNm",
        "ctrySubDvsn",
        "ctry"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroPstlAdr {

    @JsonProperty("adrLine")
    private Object adrLine;
    @JsonProperty("adrTp")
    private Object adrTp;
    @JsonProperty("dept")
    private Object dept;
    @JsonProperty("subDept")
    private Object subDept;
    @JsonProperty("strtNm")
    private StrtNm strtNm;
    @JsonProperty("bldgNb")
    private Object bldgNb;
    @JsonProperty("pstCd")
    private PstCd pstCd;
    @JsonProperty("twnNm")
    private TwnNm twnNm;
    @JsonProperty("ctrySubDvsn")
    private CtrySubDvsn ctrySubDvsn;
    @JsonProperty("ctry")
    private Ctry ctry;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("adrLine")
    public Object getAdrLine() {
        return adrLine;
    }

    @JsonProperty("adrLine")
    public void setAdrLine(Object adrLine) {
        this.adrLine = adrLine;
    }

    @JsonProperty("adrTp")
    public Object getAdrTp() {
        return adrTp;
    }

    @JsonProperty("adrTp")
    public void setAdrTp(Object adrTp) {
        this.adrTp = adrTp;
    }

    @JsonProperty("dept")
    public Object getDept() {
        return dept;
    }

    @JsonProperty("dept")
    public void setDept(Object dept) {
        this.dept = dept;
    }

    @JsonProperty("subDept")
    public Object getSubDept() {
        return subDept;
    }

    @JsonProperty("subDept")
    public void setSubDept(Object subDept) {
        this.subDept = subDept;
    }

    @JsonProperty("strtNm")
    public StrtNm getStrtNm() {
        return strtNm;
    }

    @JsonProperty("strtNm")
    public void setStrtNm(StrtNm strtNm) {
        this.strtNm = strtNm;
    }

    @JsonProperty("bldgNb")
    public Object getBldgNb() {
        return bldgNb;
    }

    @JsonProperty("bldgNb")
    public void setBldgNb(Object bldgNb) {
        this.bldgNb = bldgNb;
    }

    @JsonProperty("pstCd")
    public PstCd getPstCd() {
        return pstCd;
    }

    @JsonProperty("pstCd")
    public void setPstCd(PstCd pstCd) {
        this.pstCd = pstCd;
    }

    @JsonProperty("twnNm")
    public TwnNm getTwnNm() {
        return twnNm;
    }

    @JsonProperty("twnNm")
    public void setTwnNm(TwnNm twnNm) {
        this.twnNm = twnNm;
    }

    @JsonProperty("ctrySubDvsn")
    public CtrySubDvsn getCtrySubDvsn() {
        return ctrySubDvsn;
    }

    @JsonProperty("ctrySubDvsn")
    public void setCtrySubDvsn(CtrySubDvsn ctrySubDvsn) {
        this.ctrySubDvsn = ctrySubDvsn;
    }

    @JsonProperty("ctry")
    public Ctry getCtry() {
        return ctry;
    }

    @JsonProperty("ctry")
    public void setCtry(Ctry ctry) {
        this.ctry = ctry;
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
