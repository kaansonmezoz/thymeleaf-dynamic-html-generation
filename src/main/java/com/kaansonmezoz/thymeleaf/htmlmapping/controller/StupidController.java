package com.kaansonmezoz.thymeleaf.htmlmapping.controller;

import com.kaansonmezoz.thymeleaf.htmlmapping.entities.database.KeyValueEntity;
import com.kaansonmezoz.thymeleaf.htmlmapping.model.ViewModel;
import com.kaansonmezoz.thymeleaf.htmlmapping.repository.KeyValueRepository;
import com.kaansonmezoz.thymeleaf.htmlmapping.service.StupidControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/deneme")
public class StupidController{
    @Autowired
    KeyValueRepository repo;

    @GetMapping
    public String getContentAsHtml(@RequestBody HashMap<String, Object> requestJson){
        StupidControllerService service = new StupidControllerService();
        KeyValueEntity entity = new KeyValueEntity();
        entity.setKeyValuePairs(requestJson);


        repo.save(entity);

        return service.getMappedHtml(new ViewModel(requestJson));
    }

}
