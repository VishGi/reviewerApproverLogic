package com.postgressql.postgressDemo.repo;

import com.postgressql.postgressDemo.model.TableAEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TableAResponse extends JpaRepository<TableAEntity,Long> {
   // @Query("SELECT g.areaCode FROM GLEntity g WHERE g.glCode = :glCode")
  //  String findAreaCodeByGlCode(@Param("glCode") String glCode);

    TableAEntity findByglCode(Long glCode );

}
