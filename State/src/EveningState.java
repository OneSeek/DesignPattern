public class EveningState extends State {

	@Override
	public void WriteProgram(Work w) {

		if (w.isFinish()) { //如果任务完成，下班
			w.SetState(new RestState());
			w.WriteProgram();
		} else {
			if (w.isWorkFinish()) { //如果公司有强制下班规定，则员工必须离开公司
				System.out.println("当前时间：" + w.getHour() + "点，任务未完成，但公司规定：员工20点之前离开公司");
			} else {
				if (w.getHour() < 21)
					System.out.println("当前时间：" + w.getHour() + "点，工作未完成，加班");
				else {
					w.SetState(new SleepingState());
					w.WriteProgram();
				}
			}

		}
	}
}
