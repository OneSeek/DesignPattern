public class Client {

	public static void main(String[] args) {
		Abstraction abstraction = new RefinedAbstraction();
		abstraction.setImplementor(new ConcreteImplementorA());
		abstraction.Operation();
		abstraction.setImplementor(new ConcreteImplementorB());
		abstraction.Operation();

	}

}
