
abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
	this.receiver = receiver;
    }


    abstract void Execute();

}

class ConcreteCommand extends Command {

    private Command command;

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }


    public void Execute() {
        receiver.action();
    }

}
