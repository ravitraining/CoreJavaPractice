package logics;

public class DuplicateCharacters {
public static void main(String[] args) {
	String string="raviravi";
	int count=0;
	char cha[]=string.toCharArray();
	System.out.println("Duplicate chars are:");
	for(int i=0;i<string.length();i++)
	{
		for(int j=0;j<string.length();j++)
		{
			if(cha[i]==cha[j])
			{
				System.out.println(cha[j]);
				count++;
				break;
			}
		}
	}
}
}
