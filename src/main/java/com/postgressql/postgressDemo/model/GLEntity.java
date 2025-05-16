package com.postgressql.postgressDemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="TableA")
public class GLEntity {
    public GLEntity(Long glCode, String areaCode) {
        this.glCode = glCode;
        this.areaCode = areaCode;
    }

    public Long getGlCode() {
        return glCode;
    }

    public void setGlCode(Long glCode) {
        this.glCode = glCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public GLEntity() {
   }

    @Id
    @Column(name = "glcode")
    private Long glCode;
    @Column(name = "areacode")
    private String areaCode;
  //  private String reviewer;
   // private String approver;
}
