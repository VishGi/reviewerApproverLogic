package com.postgressql.postgressDemo.dto;

import com.postgressql.postgressDemo.model.TableAEntity;
import com.postgressql.postgressDemo.model.TableBEntity;

import java.util.List;

public class responseDto {
    private String approver;
    private String reviewer;
   // public TableAEntity getTableA() {
      //  return tableA;
   // }

    //public void setTableA(TableAEntity tableA) {
      //  this.tableA = tableA;
    //}

    //public List<TableBEntity> getTableBList() {
      //  return tableBList;
   // }

    //public void setTableBList(List<TableBEntity> tableBList) {
      //  this.tableBList = tableBList;
   // }

    //private TableAEntity tableA;
    //private List<TableBEntity> tableBList;

    // getters and setters for new fields
    public String getApprover() { return approver; }
    public void setApprover(String approver) { this.approver = approver; }

    public String getReviewer() { return reviewer; }
    public void setReviewer(String reviewer) { this.reviewer = reviewer; }
}
