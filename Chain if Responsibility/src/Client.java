public class Client {

	public static void main(String[] args) {
		CommonManager commonManager = new CommonManager("金利");
		Majordomo majordomo = new Majordomo("宗剑");
		GeneralManager generalManager = new GeneralManager("仲景里");

		commonManager.setSuperior(majordomo);
		majordomo.setSuperior(generalManager);

		Request request = new Request();
		request.setRequestType("请假");
		request.setRequestContent("小菜请假");
		request.setNumber(1);
		commonManager.RequestApplications(request);

		Request request2 = new Request();
		request2.setRequestType("请假");
		request2.setRequestContent("小菜请假");
		request2.setNumber(4);
		commonManager.RequestApplications(request2);

		Request request3 = new Request();
		request3.setRequestType("加薪");
		request3.setRequestContent("小菜请求加薪");
		request3.setNumber(500);
		commonManager.RequestApplications(request3);

		Request request4 = new Request();
		request4.setRequestType("加薪");
		request4.setRequestContent("小菜请求加薪");
		request4.setNumber(1000);
		commonManager.RequestApplications(request4);
	}

}
