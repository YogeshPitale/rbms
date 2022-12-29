package com.wf.stp.rbms.dto.upo;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "createdDate",
        "splmtrydataAch",
        "splmtrydataCcdms",
        "splmtrydataSao",
        "splmtrydataWires",
        "splmtrydataBillPay",
        "timestamp",
        "currentTimestamp",
        "shard_key",
        "payoriswells",
        "payeeiswells",
        "error_msg"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroSplmtryData {

    @JsonProperty("createdDate")
    private CreatedDate createdDate;
    @JsonProperty("splmtrydataAch")
    private Object splmtrydataAch;
    @JsonProperty("splmtrydataCcdms")
    private Object splmtrydataCcdms;
    @JsonProperty("splmtrydataSao")
    private Object splmtrydataSao;
    @JsonProperty("splmtrydataWires")
    private SplmtrydataWires splmtrydataWires;
    @JsonProperty("splmtrydataBillPay")
    private Object splmtrydataBillPay;
    @JsonProperty("timestamp")
    private Timestamp timestamp;
    @JsonProperty("currentTimestamp")
    private CurrentTimestamp currentTimestamp;
    @JsonProperty("shard_key")
    private ShardKey shardKey;
    @JsonProperty("payoriswells")
    private Payoriswells payoriswells;
    @JsonProperty("payeeiswells")
    private Payeeiswells payeeiswells;
    @JsonProperty("error_msg")
    private Object errorMsg;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("createdDate")
    public CreatedDate getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("createdDate")
    public void setCreatedDate(CreatedDate createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("splmtrydataAch")
    public Object getSplmtrydataAch() {
        return splmtrydataAch;
    }

    @JsonProperty("splmtrydataAch")
    public void setSplmtrydataAch(Object splmtrydataAch) {
        this.splmtrydataAch = splmtrydataAch;
    }

    @JsonProperty("splmtrydataCcdms")
    public Object getSplmtrydataCcdms() {
        return splmtrydataCcdms;
    }

    @JsonProperty("splmtrydataCcdms")
    public void setSplmtrydataCcdms(Object splmtrydataCcdms) {
        this.splmtrydataCcdms = splmtrydataCcdms;
    }

    @JsonProperty("splmtrydataSao")
    public Object getSplmtrydataSao() {
        return splmtrydataSao;
    }

    @JsonProperty("splmtrydataSao")
    public void setSplmtrydataSao(Object splmtrydataSao) {
        this.splmtrydataSao = splmtrydataSao;
    }

    @JsonProperty("splmtrydataWires")
    public SplmtrydataWires getSplmtrydataWires() {
        return splmtrydataWires;
    }

    @JsonProperty("splmtrydataWires")
    public void setSplmtrydataWires(SplmtrydataWires splmtrydataWires) {
        this.splmtrydataWires = splmtrydataWires;
    }

    @JsonProperty("splmtrydataBillPay")
    public Object getSplmtrydataBillPay() {
        return splmtrydataBillPay;
    }

    @JsonProperty("splmtrydataBillPay")
    public void setSplmtrydataBillPay(Object splmtrydataBillPay) {
        this.splmtrydataBillPay = splmtrydataBillPay;
    }

    @JsonProperty("timestamp")
    public Timestamp getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("currentTimestamp")
    public CurrentTimestamp getCurrentTimestamp() {
        return currentTimestamp;
    }

    @JsonProperty("currentTimestamp")
    public void setCurrentTimestamp(CurrentTimestamp currentTimestamp) {
        this.currentTimestamp = currentTimestamp;
    }

    @JsonProperty("shard_key")
    public ShardKey getShardKey() {
        return shardKey;
    }

    @JsonProperty("shard_key")
    public void setShardKey(ShardKey shardKey) {
        this.shardKey = shardKey;
    }

    @JsonProperty("payoriswells")
    public Payoriswells getPayoriswells() {
        return payoriswells;
    }

    @JsonProperty("payoriswells")
    public void setPayoriswells(Payoriswells payoriswells) {
        this.payoriswells = payoriswells;
    }

    @JsonProperty("payeeiswells")
    public Payeeiswells getPayeeiswells() {
        return payeeiswells;
    }

    @JsonProperty("payeeiswells")
    public void setPayeeiswells(Payeeiswells payeeiswells) {
        this.payeeiswells = payeeiswells;
    }

    @JsonProperty("error_msg")
    public Object getErrorMsg() {
        return errorMsg;
    }

    @JsonProperty("error_msg")
    public void setErrorMsg(Object errorMsg) {
        this.errorMsg = errorMsg;
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
