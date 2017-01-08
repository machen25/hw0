package uchidb;


/**
 * @author aelmore
 */
public class HW0Runner {

	private static Containers<Integer, String> singleton = new AContainer<>();
	
	public static Containers<Integer, String> getContainers() {
		return singleton;
	}

	public static void main(String[] args){
		
	}
}
