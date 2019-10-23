package logics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListReplace {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1132);
		arrayList.add(4232);
		arrayList.add(7232);
		arrayList.add(5222);
		arrayList.add(1332);
		arrayList.add(9232);
		Collections.sort(arrayList);
		System.out.println(arrayList);
		ListIterator<Integer> listIte = arrayList.listIterator();
		while (listIte.hasNext()) {
			int num = listIte.next();
			System.out.println(".." + num);
			int temp = 0;
				for (int i = 1; i <= num; i++) {
					if(num%i==0)
					{
						temp++;
					}
				}
				System.out.println("Temp:"+temp);
				if (temp == 2) {
					System.out.println("The given number:" + num
							+ " is a prime number");
				} else {
					System.out.println("The given number:" + num
							+ " is nop prime number");
				}

			}
			

			
		}
	}

