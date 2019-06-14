public abstract class Manager { // 管理者

	protected String name;
	protected Manager superior; //管理者的上级

	public Manager(String name) {
		this.name = name;
	}
	
	public void setSuperior( Manager superior) { //设置管理者的上级
		this.superior=superior;
	}
	 
	public abstract void RequestApplications(Request request); //申请请求

}
