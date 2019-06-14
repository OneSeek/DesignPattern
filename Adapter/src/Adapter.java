public class Adapter extends Target { //适配器角色，把源接口转换成目标接口；

	private Adaptee adaptee=new Adaptee();
	
	public void Request() {
		adaptee.SpecificRequest();
	}
		
}
