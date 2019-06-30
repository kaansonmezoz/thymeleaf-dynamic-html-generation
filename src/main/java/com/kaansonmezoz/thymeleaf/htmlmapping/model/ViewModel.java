package com.kaansonmezoz.thymeleaf.htmlmapping.model;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ViewModel {
    private HashMap<String, Object> dictionary;

    public ViewModel(){}

    public ViewModel(HashMap dictionary){
        this.dictionary = dictionary;
    }

    public void setDictionary(HashMap<String, Object> dictionary){
        this.dictionary = dictionary;
    }

    public String getString(String key){
        return (String) dictionary.get(key);
    }

    public double getDouble(String key){
        return (double) dictionary.get(key);
    }

    public List getList(String key){
        return (List) dictionary.get(key);
    }

    public List getListOfSubDictionaries(String key){
        ObjectMapper mapper = new ObjectMapper();

        List<ViewModel> viewModelList = new ArrayList<>();

        List<Object> subDictonaryList = (List<Object>) dictionary.get(key);

        for(Object subDictionary: subDictonaryList){
            ViewModel viewModel = new ViewModel();
            viewModel.setDictionary(mapper.convertValue(subDictionary, HashMap.class));
            viewModelList.add(viewModel);
        }

        return viewModelList;
    }

    public ViewModel getSubDictionary(String key){
        return new ViewModel((HashMap<String, Object>) dictionary.get(key));
    }

}
