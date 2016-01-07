package codeforces;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SaitamaDestroysHotel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s = in.nextInt();
		Map<Integer,Integer> list = new TreeMap<Integer,Integer>(Collections.reverseOrder());
		for(int x=0; x<n;x++){
			int f = in.nextInt();
			int t = in.nextInt();
			if(!list.containsKey(f))
			list.put(f, t);
			else
			{
				int temp = list.get(f);
				if(t>temp)list.put(f,t);
			}
		}
		int length =0;
		int current = s;
		for(int key:list.keySet())
		{
			int diff = current -key;
			int temp = list.get(key);
			length = Math.max(temp, length+diff);
			current = key;
		}
		if(current!=0)
		{
			length+= current;
		}
		System.out.println(length);
	}

}
