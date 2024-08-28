package com.collections;

import java.util.List;

public class Lists {
    public static int indexOf(String palabra, List<String> list){
        int i = 0;
        for (String word: list){
            if (word.equals(palabra)){
                return i;
            }
            i ++;
        }
        return -1;
    }
    public static int indexOfByIndex(String palabra, List<String> list, int index){
        int i = 0;
        for (String word: list){
            if (word.equals(palabra) && i >= index){
                return i;
            }
            i ++;
        }
        return -1;
    }
    public static int indexOfEmpty(List<String> list){
        int i = 0;
        for (String word: list){
            if (word.isEmpty()){
                return i;
            }
            i ++;
        }
        return -1;
    }
    public static int put(String palabra, List<String> list){
        if (list.contains("")){        int i = indexOfEmpty(list);
            list.remove(i);
            list.add(i, palabra);
            return i;
        }
        return -1;
    }
    public static int remove(String palabra, List<String> list){
        int removed = 0;
        if (list.contains(palabra)){
            for (int i = 0; i <= list.size()- 1; i++){
                if (list.get(i).contains((palabra))){
                    list.remove(i);
                    i --;
                    removed ++;
                }
            }
            return removed;
        }
        return 0;
    }
}
