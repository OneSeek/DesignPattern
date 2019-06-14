public abstract class Colleague { //抽象同事类
    protected  Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
