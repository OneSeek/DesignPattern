public class Originator { //创建一个备忘录

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) { 
		this.state = state;
	}
	
	public Memento CreateMemento() {
		return (new Memento(state));
	}
	
	public void setMemento(Memento memento) { 
		state=memento.getState();
	}
	
	public void show() {
		System.out.println("State="+state);
	}
}
