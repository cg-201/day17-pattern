package pattern;

public class DBUtil {
	
	private static DBUtil object = null;

	// private ::  special member :: constructor
	private DBUtil() {}
	
	public static DBUtil method1() {
		if(object == null) {
			object = new DBUtil();
		}
		
		return object;
	}
}
