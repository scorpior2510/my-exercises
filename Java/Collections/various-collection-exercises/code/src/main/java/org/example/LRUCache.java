package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class LRUCache {

    private final Map<Integer, Object> cache;
    private final int cacheCapacity;

    public LRUCache(int cacheCapacity) {
        this.cacheCapacity = cacheCapacity;
        this.cache = new LinkedHashMap<>(cacheCapacity, 0.75f, true);
    }

    public Optional<Object> get(int key) {
        return Optional.ofNullable(this.cache.get(key));
    }

    public void put(int key, Object value) {

        if (!this.cache.containsKey(key) && this.cache.size() == this.cacheCapacity) {
            int eldestKey = this.cache.keySet().iterator().next();
            this.cache.remove(eldestKey);
        }

        this.cache.put(key, value);
    }

    public String toString() {
        return this.cache.toString();
    }


}
