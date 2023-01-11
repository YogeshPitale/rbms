package com.wf.stp.rbms.dto.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "instrId",
        "endToEndId",
        "txId",
        "msgId",
        "orgnlInstrId",
        "orgnlEndToEndId",
        "orgnlTxId",
        "orgnlPmtInfId",
        "orgnlMsgId"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroPmtId {

    @JsonProperty("instrId")
    private Object instrId;
    @JsonProperty("endToEndId")
    private Object endToEndId;
    @JsonProperty("txId")
    private TxId txId;
    @JsonProperty("msgId")
    private Object msgId;
    @JsonProperty("orgnlInstrId")
    private Object orgnlInstrId;
    @JsonProperty("orgnlEndToEndId")
    private Object orgnlEndToEndId;
    @JsonProperty("orgnlTxId")
    private Object orgnlTxId;
    @JsonProperty("orgnlPmtInfId")
    private Object orgnlPmtInfId;
    @JsonProperty("orgnlMsgId")
    private Object orgnlMsgId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("instrId")
    public Object getInstrId() {
        return instrId;
    }

    @JsonProperty("instrId")
    public void setInstrId(Object instrId) {
        this.instrId = instrId;
    }

    @JsonProperty("endToEndId")
    public Object getEndToEndId() {
        return endToEndId;
    }

    @JsonProperty("endToEndId")
    public void setEndToEndId(Object endToEndId) {
        this.endToEndId = endToEndId;
    }

    @JsonProperty("txId")
    public TxId getTxId() {
        return txId;
    }

    @JsonProperty("txId")
    public void setTxId(TxId txId) {
        this.txId = txId;
    }

    @JsonProperty("msgId")
    public Object getMsgId() {
        return msgId;
    }

    @JsonProperty("msgId")
    public void setMsgId(Object msgId) {
        this.msgId = msgId;
    }

    @JsonProperty("orgnlInstrId")
    public Object getOrgnlInstrId() {
        return orgnlInstrId;
    }

    @JsonProperty("orgnlInstrId")
    public void setOrgnlInstrId(Object orgnlInstrId) {
        this.orgnlInstrId = orgnlInstrId;
    }

    @JsonProperty("orgnlEndToEndId")
    public Object getOrgnlEndToEndId() {
        return orgnlEndToEndId;
    }

    @JsonProperty("orgnlEndToEndId")
    public void setOrgnlEndToEndId(Object orgnlEndToEndId) {
        this.orgnlEndToEndId = orgnlEndToEndId;
    }

    @JsonProperty("orgnlTxId")
    public Object getOrgnlTxId() {
        return orgnlTxId;
    }

    @JsonProperty("orgnlTxId")
    public void setOrgnlTxId(Object orgnlTxId) {
        this.orgnlTxId = orgnlTxId;
    }

    @JsonProperty("orgnlPmtInfId")
    public Object getOrgnlPmtInfId() {
        return orgnlPmtInfId;
    }

    @JsonProperty("orgnlPmtInfId")
    public void setOrgnlPmtInfId(Object orgnlPmtInfId) {
        this.orgnlPmtInfId = orgnlPmtInfId;
    }

    @JsonProperty("orgnlMsgId")
    public Object getOrgnlMsgId() {
        return orgnlMsgId;
    }

    @JsonProperty("orgnlMsgId")
    public void setOrgnlMsgId(Object orgnlMsgId) {
        this.orgnlMsgId = orgnlMsgId;
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
