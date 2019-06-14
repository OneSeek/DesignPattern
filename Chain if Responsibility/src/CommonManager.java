public class CommonManager extends Manager {

	public CommonManager(String name) {
		super(name);
	}

	@Override
	public void RequestApplications(Request request) {
		if (request.getRequestType() == "请假" && request.getNumber() <= 2) // 经理所能有的权限就是可准许下属两天内的假期
			System.out.println("经理"+name + ":" + request.getRequestContent() + "数量" + request.getNumber() + " 被批准");
		else if (superior != null)
			superior.RequestApplications(request);
	}

}
