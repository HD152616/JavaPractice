/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 * 		|_ MelonGenreChart
 * 1. 개요 :  
 * 2. 작성일 : 2017. 6. 13. 
 * </pre>
 * @author		: 변은서
 * @version		: 1.0
 */
public class MelonGenreChart {
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		List<Music> list1 = new ArrayList<>();
		List<Music> list2 = new ArrayList<>();
		System.out.println("--<< 멜론 장르별 차트 >>--");
		list1.add(new Music("팔레트", "아이유"));
		list2.add(new Music("ILUVIT", "PSY"));
		list2.add(new Music("맞지?", "언니쓰"));
		map.put("발라드", list1);
		map.put("댄스", list2);
		printMap(map);
		System.out.println("--<< 댄스 2위곡 변경 >>--");
		map.get("댄스").set(1, new Music("SIGNAL", "트와이스"));
		printMap(map);
		System.out.println("--<< 댄스 1위곡 삭제 >>--");
		map.get("댄스").remove(0);
		printMap(map);
		System.out.println("--<< 전체 리스트 삭제 >>--");
		map.clear();
		printMap(map);
	}
	public static void printMap(Map<String, List<Music>> map )
	{
		for(String a : map.keySet())
		{
			System.out.println("["+a+"]");
			for(Music b : map.get(a))
			{
				System.out.print(map.get(a).indexOf(b)+1);
				System.out.println(". "+b);
			}
		}
		System.out.println();
	}

}
