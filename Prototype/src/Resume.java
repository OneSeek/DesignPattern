public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private WorkExperience work;

    public Resume(String name){
        this.name = name;
        work = new WorkExperience();
    }
    private Resume(WorkExperience work){
        this.work = (WorkExperience) work.Clone();
    }

    public void SetPersonalInfo(String sex,String age){
        this.sex =sex;
        this.age = age;
    }

    public void SetWorkExperience(String workData,String company){
        work.setWorkData(workData);
        work.setCompany(company);
    }
    public void Display(){
        System.out.println(name+ " "+sex+" "+age);
        System.out.println("工作经历："+work.getWorkData()+work.getCompany());
    }
    public Object Clone(){
        Resume obj = new Resume(this.work);
        obj.name = this.name;
        obj.sex = this.sex;
        obj.age = this.age;
        return obj;
    }
}
