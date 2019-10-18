package collection;
import java.util.Enumeration;
import java.util.Vector;


public class EnumertionDemo {
public static void main(String[] args) {
	Vector<Integer> v=new Vector<Integer>();
	v.addElement(100);
	v.addElement(45);
	v.addElement(233);
	v.addElement(98);
	v.addElement(1232);
	System.out.println(v);
	Enumeration<Integer> enu=v.elements();
	while(enu.hasMoreElements())
	{
		Integer i=enu.nextElement();
		System.out.println(i);
		if(i%2==0)
		{
		System.out.println(i+": Even Numbers");
		v.remove(i);
		}
		else
		{
			System.out.println(i+": Odd Numbers");
		}
	}
	
}
}
