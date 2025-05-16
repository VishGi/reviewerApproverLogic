package com.postgressql.postgressDemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="TableB")
public class TableBEntity {


    @Id
    @Column(name="guid")
    public String guid;
    @Column(name = "area_code")
    public String areaCode;
    @Column(name = "approver")
    public String Approver;
    @Column(name = "limit")
    public Long Limit;
    @Column(name = "ooo")
    public String ooo;
    @Column(name = "alternateapprover")
    public String alternateapprover;
    public TableBEntity() {

    }



    public TableBEntity(String guid, String areaCode, String Approver, Long Limit, String ooo, String additionalapprover) {
        this.guid = guid;
        this.areaCode = areaCode;
        this.Approver = Approver;
        this.Limit = Limit;
        this.ooo = ooo;
        this.alternateapprover= alternateapprover;


    }
    public String getguid() {
        return guid;
    }
    public void setguid() {
        this.guid = guid;
    }

    public String getAreaCode() {
        return areaCode;
    }
    public void setAreaCode() {
        this.areaCode = areaCode;
    }

    public String getApprover() {
        return Approver;
    }
    public void setApprover(String Approver) {
        this.Approver = Approver;
    }

    public Long getLimit() {
        return Limit;
    }
    public void setLimit() {
        this.Limit = Limit;
    }

    public String getOoo() {return ooo;}
    public void setOoo(String ooo) {this.ooo = ooo;}

    public String getAlternateapprover() {return alternateapprover;}
    public void setAlternateapprover(String alternateapprover) {this.alternateapprover = alternateapprover;}


}
