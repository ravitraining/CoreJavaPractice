package oops;

public class InheritanceTest {
public static void main(String[] args) {
	Multiplication add=new Multiplication();
	add.num1=12;
	add.num2=11;
	add.add();
	System.out.println(add.result);
	add.subtraction();
	System.out.println(add.result);
	add.multiplication();
	System.out.println(add.result);

	
}

}

//Parent, Super, Base class
class Addition { // this is paent class
int num1,num2,result=0;
public void add()
{
	result=num1+num2;
}
}
// Child, Sub, Derived
class Subtraction extends Addition { // this is single level inheritance
public void subtraction()
{
	result=num1-num2;
}
}
// Child, Sub, Derived class
class Multiplication extends Subtraction
{
	public void multiplication()
	{
		result=num1*num2;
	}
}
