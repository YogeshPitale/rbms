package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "bicfi",
        "uschu",
        "clrSysMmbId",
        "nm",
        "pstlAdr_1",
        "ctrySubDvsn",
        "ctry"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroFinInstnId2__1 {

    @JsonProperty("bicfi")
    private Object bicfi;
    @JsonProperty("uschu")
    private Object uschu;
    @JsonProperty("clrSysMmbId")
    private Object clrSysMmbId;
    @JsonProperty("nm")
    private Nm__3 nm;
    @JsonProperty("pstlAdr_1")
    private PstlAdr1__1 pstlAdr1;
    @JsonProperty("ctrySubDvsn")
    private CtrySubDvsn__1 ctrySubDvsn;
    @JsonProperty("ctry")
    private Ctry__3 ctry;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("bicfi")
    public Object getBicfi() {
        return bicfi;
    }

    @JsonProperty("bicfi")
    public void setBicfi(Object bicfi) {
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
    public Nm__3 getNm() {
        return nm;
    }

    @JsonProperty("nm")
    public void setNm(Nm__3 nm) {
        this.nm = nm;
    }

    @JsonProperty("pstlAdr_1")
    public PstlAdr1__1 getPstlAdr1() {
        return pstlAdr1;
    }

    @JsonProperty("pstlAdr_1")
    public void setPstlAdr1(PstlAdr1__1 pstlAdr1) {
        this.pstlAdr1 = pstlAdr1;
    }

    @JsonProperty("ctrySubDvsn")
    public CtrySubDvsn__1 getCtrySubDvsn() {
        return ctrySubDvsn;
    }

    @JsonProperty("ctrySubDvsn")
    public void setCtrySubDvsn(CtrySubDvsn__1 ctrySubDvsn) {
        this.ctrySubDvsn = ctrySubDvsn;
    }

    @JsonProperty("ctry")
    public Ctry__3 getCtry() {
        return ctry;
    }

    @JsonProperty("ctry")
    public void setCtry(Ctry__3 ctry) {
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
