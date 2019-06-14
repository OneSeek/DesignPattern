public abstract class Abstraction {

	protected Implementor im;
	public void setImplementor(Implementor im) {
		this.im=im;
	}

	public abstract void Operation();
}
