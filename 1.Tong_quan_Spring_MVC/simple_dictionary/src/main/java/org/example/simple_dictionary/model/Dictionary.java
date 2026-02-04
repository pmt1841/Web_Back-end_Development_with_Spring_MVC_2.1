package org.example.simple_dictionary.model;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class Dictionary {
    private final Map<String, String> dictionaryMap;

    public Dictionary() {
        this.dictionaryMap = new HashMap<>();
        dictionaryMap.put("one", "Một");
        dictionaryMap.put("two", "Hai");
        dictionaryMap.put("three", "Ba");
        dictionaryMap.put("four", "Bốn");
        dictionaryMap.put("five", "Năm");
    }

    public Map<String, String> getDictionaryMap() {
        return dictionaryMap;
    }
}
