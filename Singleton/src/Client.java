public class Client {
	public static void main(String[] args) {

		Singleton s1 = Singleton.GetInstance();
		Singleton s2 = Singleton.GetInstance();
		if (s1 == s2) {
			System.out.println("Objects are the same instance");
		}
	}

}
