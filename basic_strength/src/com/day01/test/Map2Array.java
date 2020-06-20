package com.day01.test;

import java.util.*;

/**
 * Created by yanyuchun on 2020/6/10
 */
public class Map2Array {
    public static void main(String[] args) {
        Map<String, ArrayList> map = new HashMap<>();
        HashMap hashMap = formData("name", "age");
        System.out.println(hashMap);
    }

    public static HashMap formData(String... param){
        List<String> arry= Arrays.asList(param);
        System.out.println(arry);

        HashMap ids=new HashMap();
        HashMap map=new HashMap();
        ids.put("ids",arry);
        map.put("data",ids);
        return map;
    }
}
