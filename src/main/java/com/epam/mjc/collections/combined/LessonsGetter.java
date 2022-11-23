package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable){
        Set<String> lessons = new HashSet<>();
        List<String> list;
        for (Map.Entry<String, List<String>> entry : timetable.entrySet()) {
            list = entry.getValue();
            for (String s : list) {
                lessons.add(s);
            }
        }
        return lessons;
    }
}
