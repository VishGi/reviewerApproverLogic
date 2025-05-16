package com.postgressql.postgressDemo.service;

import com.postgressql.postgressDemo.model.TableAEntity;
import com.postgressql.postgressDemo.model.TableBEntity;
import com.postgressql.postgressDemo.repo.TableAResponse;
import com.postgressql.postgressDemo.repo.TableBResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class ApproverService {

    @Autowired
    private TableAResponse approverResponse;

    public List<TableAEntity> getAreaCodeByGlCode(){
        //return approverResponse.findAreaCodeByGlCode(glcode);
        return approverResponse.findAll();
    }
    public TableAEntity printAreaCodeByGlCode(Long glCode) {
        return approverResponse.findByglCode(glCode);
    }
    @Autowired
    TableBResponse tableBResponse;

    public List<TableBEntity> getAllByAreaCode(String areaCode){
        List<TableBEntity> list = tableBResponse.findByAreaCode(areaCode);
       // return tableBResponse.findByAreaCode(areaCode);

        TableBEntity minLimitEntity = list.stream()
                .filter(e -> e.getLimit() > 0)
                .min(Comparator.comparingLong(TableBEntity::getLimit))
                .orElse(null);

        for (TableBEntity entity : list) {
            if (entity.getLimit() == 0) {
                System.out.println("Reviewer - " + entity.getApprover());
            } else if (minLimitEntity != null && entity.getguid().equals(minLimitEntity.getguid())) {
                System.out.println( "Approver - " + entity.getApprover() );
            }
        }

        return list;
    }


}



