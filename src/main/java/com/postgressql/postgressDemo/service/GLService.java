package com.postgressql.postgressDemo.service;

import com.postgressql.postgressDemo.model.GLEntity;
import com.postgressql.postgressDemo.repo.ApproverResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GLService {

    @Autowired
    private ApproverResponse approverResponse;

    public List<GLEntity> getAreaCodeByGlCode(){
        //return approverResponse.findAreaCodeByGlCode(glcode);
        return approverResponse.findAll();
    }
    public GLEntity printAreaCodeByGlCode(Long glCode) {
        return approverResponse.findByglCode(glCode);
    }
}
