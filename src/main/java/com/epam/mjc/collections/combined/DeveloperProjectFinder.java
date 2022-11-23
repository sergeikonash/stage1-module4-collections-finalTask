package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer){
        List<String> listOfProjects = new ArrayList<>();
        Set<String> set;
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                listOfProjects.add(entry.getKey());
            }
        }
        Comparator<String> stringComparator = new StringComparator();
        Collections.sort(listOfProjects, stringComparator);
        return listOfProjects;
    }

    private static class StringComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            if (o1.length() - o2.length() != 0) {
                return o1.length() - o2.length();
            } else {
                List<String> list = new ArrayList<>();
                list.add(o1);
                list.add(o2);
                list.sort(Comparator.reverseOrder());
                if (o1.equals(list.get(0))) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
    }
}
