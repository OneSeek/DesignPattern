public class Main {


    public static void main(String[] args) {

        Resume a = new Resume("大鸟");
        a.SetPersonalInfo("男","29");
        a.SetWorkExperience("1998-2006","XX-公司");

        Resume b = (Resume)a.Clone();
        b.SetWorkExperience("1998-2006","YY-企业");


        Resume c = (Resume)a.Clone();
        c.SetPersonalInfo("男","24");
        c.SetWorkExperience("1998-2003","ZZ-企业");

        a.Display();
        b.Display();
        c.Display();
    }
}
