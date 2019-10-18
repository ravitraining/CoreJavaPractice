package logics;

import java.lang.annotation.Annotation;
import java.lang.annotation.Target;

public class Creatennotation {
public static void main(String[] args) {
	NokiaMobile nokia=new NokiaMobile("Jio", 10);
	Class c=nokia.getClass();
	Annotation a=c.getAnnotation(SmartPhone.class);
	SmartPhone s=(SmartPhone)a;
	System.out.println(s.modelName());
}
	
	
}
@interface SmartPhone
{
	String modelName() default "Asha";
	int modelno() default 3310 ;
}
@SmartPhone
class NokiaMobile
{
	String modelName;
	int size;
	NokiaMobile(String modelname, int size)
	{
		
	}
	
	
}
