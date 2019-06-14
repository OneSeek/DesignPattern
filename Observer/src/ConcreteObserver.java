
public class ConcreteObserver extends Observer {

    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject concreteSubject, String name) {
        this.setName(name);
        this.setConcreteSubject(concreteSubject);
    }

    @Override
    public void Update() {
	this.setObserverState(subject.getSubjectState());
	System.out.println("观察者" + this.getName() + "的新状态是"
		+ this.getObserverState());
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getObserverState() {
	return observerState;
    }

    public void setObserverState(String observerState) {
	this.observerState = observerState;
    }

    public ConcreteSubject getConcreteSubject() {
	return subject;
    }

    public void setConcreteSubject(ConcreteSubject subject) {
	this.subject = subject;
    }

}
