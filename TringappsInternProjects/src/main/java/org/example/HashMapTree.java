package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HashMapTree {
    public static void internalwokHash() {
        Logger ou = Logger.getLogger("com.api.jar");

        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        ou.log(Level.INFO,()->""+hs.isEmpty());
        ou.log(Level.INFO,()->""+hs);

        TreeSet<Integer>  ts= new TreeSet<>();
        ts.add(3);
        ts.add(1);
        ts.add(2);

        ou.log(Level.INFO,()->""+hs);

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");
        ou.log(Level.INFO,()->""+hm);

        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(3, "three");
        tm.put(1, "one");
        tm.put(2, "two");
        ou.log(Level.INFO,()->""+tm.isEmpty());
        ou.log(Level.INFO,()->""+tm);



    }
}
