package pattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		// Objec1
		DBUtil obj1 = DBUtil.method1();
		System.out.println(obj1);
		
		// object2
		DBUtil obj2 = DBUtil.method1();
		System.out.println(obj2);
		
		
	}
}
