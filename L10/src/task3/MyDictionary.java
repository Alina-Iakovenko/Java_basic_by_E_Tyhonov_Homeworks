package task3;

import java.util.HashMap;
import java.util.Map;

public class MyDictionary<TKey,TValue> {
    Map<TKey, TValue> dictionary = new HashMap<>();

//    public MyDictionary(Map<TKey, TValue> dictionary) {
//        this.dictionary = dictionary;
//    }


    public Map<TKey, TValue> getDictionary() {
        return dictionary;
    }

    public void addMeth(TKey key, TValue value) {
        dictionary.put(key, value);
    }

    public TValue indexOfMeth(TKey key) {
        return dictionary.get(key);
    }

    public int count() {
        return dictionary.size();
    }



}
