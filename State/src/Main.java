public class Main {

    public static void main(String[] args) {
        System.out.println("在第一个公司工作：");
        Work emergencyProjects=new Work();
        emergencyProjects.setHour(9);
        emergencyProjects.WriteProgram();
        emergencyProjects.setHour(12);
        emergencyProjects.WriteProgram();
        emergencyProjects.setHour(13);
        emergencyProjects.WriteProgram();
        emergencyProjects.setHour(17);
        emergencyProjects.setFinish(false);
        emergencyProjects.WriteProgram();
        emergencyProjects.setHour(22);
        emergencyProjects.WriteProgram();
        System.out.println("在第二个公司工作：");
        Work normalProjects=new Work();
        normalProjects.setHour(10);
        normalProjects.WriteProgram();
        normalProjects.setHour(12);
        normalProjects.WriteProgram();
        normalProjects.setHour(13);
        normalProjects.WriteProgram();
        normalProjects.setHour(18);
        normalProjects.setFinish(false);
        normalProjects.setWorkFinish(true);
        normalProjects.WriteProgram();
    }



}
