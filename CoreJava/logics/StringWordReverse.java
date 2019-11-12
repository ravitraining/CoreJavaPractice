package logics;

public class StringWordReverse {
public String reverseString(String str)
{
	String words[]=str.split(" ");
	String reverseString="";
	for(String word:words)
	{
		String str2="";
		for(int i=word.length()-1;i>=0;i--)
		{
			str2=str2+word.charAt(i);
		}
	reverseString=reverseString+str2+" ";
	}
	return reverseString;
}
public static void main(String[] args) {
	StringWordReverse st=new StringWordReverse();
	String s1=st.reverseString("Hello Ravi");
	System.out.println(s1);
}
}
