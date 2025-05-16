package com.postgressql.postgressDemo.controller;

import com.postgressql.postgressDemo.dto.responseDto;
import com.postgressql.postgressDemo.model.TableAEntity;
import com.postgressql.postgressDemo.model.TableBEntity;
import com.postgressql.postgressDemo.service.ApproverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GLController {

    @Autowired
    private ApproverService glService;

    //public String getAreaCode() {
     //   String hardcodedGlCode = "10034";  //
       // String areaCode = glService.getAreaCodeByGlCode(hardcodedGlCode).toString();
        //return "Area Code for GLCode " + hardcodedGlCode + ": " + areaCode;
  //  }

    @GetMapping("/printAreaCode")
    public ResponseEntity<List<TableAEntity>> getAreaCodeByGlCode()

    {
        List<TableAEntity> tableAEntityList = glService.getAreaCodeByGlCode();
        return ResponseEntity.ok(tableAEntityList);

    }

    @GetMapping("/printAreaCode/{glCode}")
    public ResponseEntity<TableAEntity> printAreaCodeByGlCode(@PathVariable Long glCode) {

            TableAEntity tableAEntityList = glService.printAreaCodeByGlCode(glCode);
            if (tableAEntityList != null) {
                return ResponseEntity.ok(tableAEntityList);
            } else
                return ResponseEntity.notFound().build();

    }

    @GetMapping("/printTableBDetails/{areaCode}")
    public ResponseEntity<List<TableBEntity>> getAllByAreaCode(@PathVariable String areaCode)

    {
        List<TableBEntity> tableBEntityList = glService.getAllByAreaCode(areaCode);
        if(tableBEntityList !=null) {
            return ResponseEntity.ok(tableBEntityList);
        }else
            return  ResponseEntity.notFound().build();

    }

    @GetMapping("/printAllDetailsByGlCode/{glCode}")
    public ResponseEntity<responseDto> printAllByGlCode(@PathVariable Long glCode) {
        TableAEntity tableA = glService.printAreaCodeByGlCode(glCode);

        if (tableA == null) {
            return ResponseEntity.notFound().build();
        }

        String areaCode = tableA.getAreaCode();
        List<TableBEntity> tableBList = glService.getApproverReviewerByAreaCode(areaCode);

        responseDto response = new responseDto();
        response.setTableA(tableA);
        response.setTableBList(tableBList);

        return ResponseEntity.ok(response);
    }
}

