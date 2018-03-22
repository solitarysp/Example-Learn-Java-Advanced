package com.higgsup.thread.SynchronizedCollectionsConcurrentCollections.SynchronizedCollections;/*
  By Chi Can Em  15-03-2018
 */

import java.util.*;

public class Main extends Thread {
    private Map<Integer, String> StringMap;

    public void setStringMap(Map<Integer, String> stringMap) {
        StringMap = stringMap;
    }

    @Override
    public void run() {
        test(StringMap);
    }

    public void test(Map<Integer, String> integerStringMap) {
        for (int i = 0; i <5 ; i++) {
            integerStringMap.put(integerStringMap.size()+1, "test");
        }
        for (Map.Entry<Integer, String> map:integerStringMap.entrySet()
             ) {
            System.out.println(map.getKey() +"         "+getName());
        }
    }

    public static void main(String[] args) {
        HashMap<Integer, String> integerHashMap = new HashMap<Integer, String>();
        integerHashMap.put(1, "nam");
        integerHashMap.put(2, "tuan");
        integerHashMap.put(3, "hai");
       // System.out.println(integerHashMap);

        Map<Integer, String> synchronizedMap = Collections.synchronizedMap(integerHashMap);
       /* Main main=new Main();
        main.setStringMap(synchronizedMap);

        Main main1=new Main();
        main1.setStringMap(synchronizedMap);
        Thread thread = new Thread(main);
        Thread thread1 = new Thread(main1);
        thread.setName("thread");
        thread1.setName("thread1");
        thread.start();
        thread1.start();*/


        List<String> syncal =
                Collections.synchronizedList(new ArrayList<String>());

        //Adding elements to synchronized ArrayList
        syncal.add("Pen");
        syncal.add("NoteBook");
        syncal.add("Ink");

        synchronized(syncal) {
            Iterator<String> iterator = syncal.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }

        }

    }
}
