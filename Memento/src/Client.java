public class Client {

	public static void main(String[] args) {

		Originator o = new Originator();
		o.setState("on");
		o.show();
		
		CareTaker careTaker = new CareTaker();
		careTaker.setMemento(o.CreateMemento());
		o.setState("off");
		o.show();
		
		o.setMemento(careTaker.getMemento());
		o.show();
	}

}
