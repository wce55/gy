package cn.wce.demo;

import java.util.HashMap;
import java.util.Map;

public class Janda {
public static void main(String[] args) {
	LongSubstring("abcabc");
	LongSubstring("aaaa");
	LongSubstring("abbjj");
	LongSubstring("abcdef");
	LongSubstring("asd");
	
}
	public static int LongSubstring(String s) {
	    int n = s.length(), a = 0;
	    Map<Character, Integer> map = new HashMap<>(); 
	    int i = 0, j = 0;
	    for (; j < n; j++) {
	        if (map.containsKey(s.charAt(j))) {
	            i = Math.max(map.get(s.charAt(j)), i); // 直接获取该重复元素的下标，重复元素的下标会改变，所以保留最大下标
	        }
	        a = Math.max(a, j - i + 1);
	        map.put(s.charAt(j), j + 1);
	    }
	    System.out.println(a);
	    return a;
	}
}
