public class WorkExperience implements Cloneable {

    private String workData;
    private String Company;

    public String getWorkData() {
        return workData;
    }

    public void setWorkData(String workData) {
        this.workData = workData;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public Object Clone(){
        Object m = null;
        try {
            m = this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return m;
    }
}
