package com.postgressql.postgressDemo.repo;

import com.postgressql.postgressDemo.model.TableBEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface TableBResponse extends JpaRepository<TableBEntity, String> {

    List<TableBEntity> findByAreaCode(String AreaCode);
}
