
public class Main {

	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
		System.out.println("Prototype Design pattern");
		NetworkConnection networkConnection1 = new NetworkConnection();
		networkConnection1.setIp("127.0.0.1");
		networkConnection1.loadImportantData();
		
		System.out.println(networkConnection1);
		System.out.println("***************");
		
		NetworkConnection networkConnecction2 = (NetworkConnection)networkConnection1.clone();
		System.out.println(networkConnecction2);
		
	}

}
