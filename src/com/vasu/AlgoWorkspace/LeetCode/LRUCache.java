package com.vasu.AlgoWorkspace.LeetCode;


import java.util.LinkedHashMap;

class LRUCache {

    int capacity;

    LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if(!cache.containsKey(key)) {
            return -1;
        }
        int value = cache.remove(key);
        cache.putLast(key, value);
        return value;
    }

    public void put(int key, int value) {

        cache.putLast(key, value);

        if(cache.size() > this.capacity) {
            cache.remove(cache.firstEntry().getKey());
        }


    }


    public static void main(String[] args) {
        LRUCache o = new LRUCache(2);
        o.put(1, 1);
        o.put(2, 2);
        System.out.println(o.get(1));
        o.put(3, 3);
        System.out.println(o.get(2));
        o.put(4, 4);
        System.out.println(o.get(1));
        System.out.println(o.get(3));
        System.out.println(o.get(4));
    }
}
