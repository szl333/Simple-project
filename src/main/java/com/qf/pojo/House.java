package com.qf.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class House {
    private Integer id;

    private String hPro;

    private String hOwner;

    private String idcard;

    private String hType;

    private Integer hArea;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern ="yyyy-MM-dd", locale = "zh", timezone = "GMT+8")
    private Date buidtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gethPro() {
        return hPro;
    }

    public void sethPro(String hPro) {
        this.hPro = hPro == null ? null : hPro.trim();
    }

    public String gethOwner() {
        return hOwner;
    }

    public void sethOwner(String hOwner) {
        this.hOwner = hOwner == null ? null : hOwner.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String gethType() {
        return hType;
    }

    public void sethType(String hType) {
        this.hType = hType == null ? null : hType.trim();
    }

    public Integer gethArea() {
        return hArea;
    }

    public void sethArea(Integer hArea) {
        this.hArea = hArea;
    }

    public Date getBuidtime() {
        return buidtime;
    }

    public void setBuidtime(Date buidtime) {
        this.buidtime = buidtime;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", hPro='" + hPro + '\'' +
                ", hOwner='" + hOwner + '\'' +
                ", idcard='" + idcard + '\'' +
                ", hType='" + hType + '\'' +
                ", hArea=" + hArea +
                ", buidtime=" + buidtime +
                '}';
    }
}