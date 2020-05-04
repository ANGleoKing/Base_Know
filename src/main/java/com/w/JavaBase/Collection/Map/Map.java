package com.w.JavaBase.Collection.Map;

import java.util.HashMap;

/**
 * @ClassNameMap
 * @Description
 * @Author ANGLE0
 * @Date2019/12/20 18:35
 * @Version V1.0
 **/
public class Map extends HashMap {


    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String >();
         map.put("name", "lili");
         map.put("age", "12");
         map.put("address", "zg");

        System.out.println(map.get("name"));
        System.out.println(map.get("age"));
    }

}
