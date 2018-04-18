import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

interface Parnet{
	void m1();}
class child implements  Parnet{
	private  child() {
		// TODO Auto-generated constructor stub
		System.out.println("private");
	}
	void m2(){
		System.out.println("hello CHILD");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
}
public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
	Class c=Class.forName("child");
	Constructor con[]=c.getDeclaredConstructors();
	con[0].setAccessible(true);
	con[0].newInstance();
	
	}

}
