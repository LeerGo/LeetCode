package me.leergo;

import java.util.*;

/*
大佬们，我在网上找了一道特级安卓开发工程师的题
将以下数组
{"a1", "b1", "b2", "a3", "a2", "b3"}
变成
{"a","a1","a2","a3","b","b1","b2","b3"}
且每当有新的元素添加时，如：a4、c1、f1、f2，将数组变成：
{"a","a1","a2","a3","a4","b","b1","b2","b3","c","c1","f","f1","f2"}
输出结果必须为list，初始输入为list，实现方法不限，请写出方案
*/
public class Test {
    public static void main(String[] args) {
        String[] raw = new String[]{"a1", "b1", "b2", "a3", "a2", "b3"};
        
        // 追加数据
        Set<String> prefix = new HashSet<>();
        for (String s : raw) {
            prefix.add(String.valueOf(s.charAt(0)));
        }
        // 创建 List
        List<String> data = new ArrayList<>(Arrays.asList(raw));
        data.addAll(prefix);
        
        // 排序
        Collections.sort(data);
        
        // 打印
        System.out.println(data);
        
        insertData(data, "f1");
        insertData(data, "a4");
        insertData(data, "c6");
        insertData(data, "c7");
        Collections.sort(data);
        System.out.println(data);
    }
    
    private static void insertData(List<String> data, String item) {
        String key = String.valueOf(item.charAt(0));
        
        if (!data.contains(key)) {
            data.add(key);
        }
        data.add(item);
    }
}
