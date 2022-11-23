package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap){
        Map<Integer, Set<String>> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        int count;
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            count = entry.getKey().length();
            if (map.containsKey(count)) {
                set = map.get(count);
                set.add(entry.getKey());
            } else {
                set = new HashSet<>();
                set.add(entry.getKey());
                map.put(count, set);
            }
        }
        return map;
    }
}
