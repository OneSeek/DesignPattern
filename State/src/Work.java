public class Work {

	private State current;
	private double hour;
	private boolean finish = false;
	private boolean workFinish = false;

	public Work() {
		current = new ForenoonState(); // 设定初始值为上午工作
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}

	public boolean isWorkFinish() {
		return workFinish;
	}

	public void setWorkFinish(boolean workFinish) {
		this.workFinish = workFinish;
	}

	public void SetState(State s) {
		current = s;
	}

	public void WriteProgram() {
		current.WriteProgram(this);
	}
}
