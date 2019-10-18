package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TimeCalculator {
public static void main(String[] args) {
	long start=System.currentTimeMillis();
	ArrayList<Integer> a=new ArrayList<>();
for(int i=1;i<100000;i++)
	{
		a.add(i);
	}
	long end=System.currentTimeMillis();
	System.out.println("Start time:"+start+".. End Time"+end+"... Diff:"+(end-start));
}
}
