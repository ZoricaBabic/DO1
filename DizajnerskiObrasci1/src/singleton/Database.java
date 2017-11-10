package singleton;

public class Database {
	private static Database instance = new Database();

	private Database() {
		
	}
	
	public static Database getInstance() {
		return instance;
	}
	
	private static Database instanceLazy;
	
	public static Database getInstanceLazy() {
		if(instanceLazy == null) {
			synchronized(Database.class){
				if(instanceLazy == null) {
					instanceLazy = new Database();
				}
			}
		}
		return instanceLazy;
	}
	
	
	public void connect() {
		System.out.println("Povezao sam se...");
	}
	
	public void disconnect() {
		System.out.println("Raskacio sam se...");
	}
}
