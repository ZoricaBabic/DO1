package singleton;

public class TestSingleton {
	
	public static void main(String[] args) {
		Database db = Database.getInstance();
		
		System.out.println(db);
		
		Database db2 = Database.getInstance();
				
		System.out.println(db2);
		
		Database db3 = Database.getInstanceLazy();
		
		System.out.println(db3);
		
		Database db4 = Database.getInstanceLazy();
		
		System.out.println(db4);
	}
}
