/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class Histogram<T> {

    private Map <T,Integer>map;

    public Histogram(Iterator<T> iterator) {
        this(iterableOf(iterator));
    }
    public Histogram(Iterable<T> iterable) {
        this.map = new HashMap<T, Integer>();
        for(T item : iterable)add(item);
    }
    //Metodo generico
    private static <T> Iterable<T> iterableOf(Iterator <T> iterator) {
        return new Iterable<T>(){
            @Override
            public Iterator<T> iterator(){
                return iterator;
            }
        };
    }
    private void add(T item) {
        map.put(item,get(item)+1);
    }
    private int get(T item) {
        return map.containsKey(item) ? map.get(item) :0;
    }

}