package com.postgressql.postgressDemo.dto;

import com.postgressql.postgressDemo.model.TableAEntity;
import com.postgressql.postgressDemo.model.TableBEntity;

import java.util.List;

public class responseDto {
    public TableAEntity getTableA() {
        return tableA;
    }

    public void setTableA(TableAEntity tableA) {
        this.tableA = tableA;
    }

    public List<TableBEntity> getTableBList() {
        return tableBList;
    }

    public void setTableBList(List<TableBEntity> tableBList) {
        this.tableBList = tableBList;
    }

    private TableAEntity tableA;
    private List<TableBEntity> tableBList;
}
