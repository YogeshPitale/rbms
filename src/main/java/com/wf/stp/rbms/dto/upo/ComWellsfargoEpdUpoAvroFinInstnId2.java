
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
    "bicfi",
    "uschu",
    "clrSysMmbId",
    "nm",
    "pstlAdr_1",
    "twnNm",
    "ctry"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroFinInstnId2 {

    @JsonProperty("bicfi")
    private String bicfi;
    @JsonProperty("uschu")
    private Object uschu;
    @JsonProperty("clrSysMmbId")
    private Object clrSysMmbId;
    @JsonProperty("nm")
    private Nm__1 nm;
    @JsonProperty("pstlAdr_1")
    private PstlAdr1 pstlAdr1;
    @JsonProperty("twnNm")
    private TwnNm__1 twnNm;
    @JsonProperty("ctry")
    private Ctry__1 ctry;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("bicfi")
    public String getBicfi() {
        return bicfi;
    }

    @JsonProperty("bicfi")
    public void setBicfi(String bicfi) {
        this.bicfi = bicfi;
    }

    @JsonProperty("uschu")
    public Object getUschu() {
        return uschu;
    }

    @JsonProperty("uschu")
    public void setUschu(Object uschu) {
        this.uschu = uschu;
    }

    @JsonProperty("clrSysMmbId")
    public Object getClrSysMmbId() {
        return clrSysMmbId;
    }

    @JsonProperty("clrSysMmbId")
    public void setClrSysMmbId(Object clrSysMmbId) {
        this.clrSysMmbId = clrSysMmbId;
    }

    @JsonProperty("nm")
    public Nm__1 getNm() {
        return nm;
    }

    @JsonProperty("nm")
    public void setNm(Nm__1 nm) {
        this.nm = nm;
    }

    @JsonProperty("pstlAdr_1")
    public PstlAdr1 getPstlAdr1() {
        return pstlAdr1;
    }

    @JsonProperty("pstlAdr_1")
    public void setPstlAdr1(PstlAdr1 pstlAdr1) {
        this.pstlAdr1 = pstlAdr1;
    }

    @JsonProperty("twnNm")
    public TwnNm__1 getTwnNm() {
        return twnNm;
    }

    @JsonProperty("twnNm")
    public void setTwnNm(TwnNm__1 twnNm) {
        this.twnNm = twnNm;
    }

    @JsonProperty("ctry")
    public Ctry__1 getCtry() {
        return ctry;
    }

    @JsonProperty("ctry")
    public void setCtry(Ctry__1 ctry) {
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
