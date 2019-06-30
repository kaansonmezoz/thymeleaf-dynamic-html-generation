package com.kaansonmezoz.thymeleaf.htmlmapping.entities.database;

import com.couchbase.client.java.repository.annotation.Field;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;

import java.util.HashMap;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KeyValueEntity {
    @Id
    @GeneratedValue(strategy = GenerationStrategy.UNIQUE)
    private String id;

    @Field
    @NonNull
    private HashMap keyValuePairs;
}
