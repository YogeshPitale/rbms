package com.wf.stp.rbms.dto.dto;

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
public class ComWellsfargoEpdUpoAvroPstlAdr1 {

    @JsonProperty("adrLine")
    private AdrLine adrLine;
    @JsonProperty("adrTp")
    private Object adrTp;
    @JsonProperty("dept")
    private Object dept;
    @JsonProperty("subDept")
    private Object subDept;
    @JsonProperty("strtNm")
    private StrtNm__1 strtNm;
    @JsonProperty("bldgNb")
    private Object bldgNb;
    @JsonProperty("pstCd")
    private Object pstCd;
    @JsonProperty("twnNm")
    private Object twnNm;
    @JsonProperty("ctrySubDvsn")
    private Object ctrySubDvsn;
    @JsonProperty("ctry")
    private Ctry__2 ctry;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("adrLine")
    public AdrLine getAdrLine() {
        return adrLine;
    }

    @JsonProperty("adrLine")
    public void setAdrLine(AdrLine adrLine) {
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
    public StrtNm__1 getStrtNm() {
        return strtNm;
    }

    @JsonProperty("strtNm")
    public void setStrtNm(StrtNm__1 strtNm) {
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
    public Object getPstCd() {
        return pstCd;
    }

    @JsonProperty("pstCd")
    public void setPstCd(Object pstCd) {
        this.pstCd = pstCd;
    }

    @JsonProperty("twnNm")
    public Object getTwnNm() {
        return twnNm;
    }

    @JsonProperty("twnNm")
    public void setTwnNm(Object twnNm) {
        this.twnNm = twnNm;
    }

    @JsonProperty("ctrySubDvsn")
    public Object getCtrySubDvsn() {
        return ctrySubDvsn;
    }

    @JsonProperty("ctrySubDvsn")
    public void setCtrySubDvsn(Object ctrySubDvsn) {
        this.ctrySubDvsn = ctrySubDvsn;
    }

    @JsonProperty("ctry")
    public Ctry__2 getCtry() {
        return ctry;
    }

    @JsonProperty("ctry")
    public void setCtry(Ctry__2 ctry) {
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
