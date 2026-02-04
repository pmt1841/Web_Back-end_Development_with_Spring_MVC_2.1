package org.example.simple_dictionary.service.impl;

import org.example.simple_dictionary.model.Dictionary;
import org.example.simple_dictionary.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    private final Dictionary dictionary;

    @Autowired
    public DictionaryServiceImpl(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public String search(String keyword) {
        Map<String, String> dictionaryMap = dictionary.getDictionaryMap();
        String result = dictionaryMap.get(keyword.trim().toLowerCase());
        if (result == null) {
            result = "Không tìm thấy";
        }
        return result;
    }
}
