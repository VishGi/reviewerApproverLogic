package com.postgressql.postgressDemo.repo;

import com.postgressql.postgressDemo.model.GLEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ApproverResponse extends JpaRepository<GLEntity,Long> {
   // @Query("SELECT g.areaCode FROM GLEntity g WHERE g.glCode = :glCode")
  //  String findAreaCodeByGlCode(@Param("glCode") String glCode);

    GLEntity findByglCode(Long glCode );

}
