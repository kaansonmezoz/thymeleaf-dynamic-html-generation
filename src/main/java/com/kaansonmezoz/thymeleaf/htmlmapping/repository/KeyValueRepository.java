package com.kaansonmezoz.thymeleaf.htmlmapping.repository;

import com.kaansonmezoz.thymeleaf.htmlmapping.entities.database.KeyValueEntity;
import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;


@N1qlPrimaryIndexed
public interface KeyValueRepository extends CouchbasePagingAndSortingRepository<KeyValueEntity, String> {

}
