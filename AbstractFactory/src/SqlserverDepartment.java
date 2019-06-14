public class SqlserverDepartment implements IDepartment {
    @Override
    public void Insert(Department department) {
        System.out.println("在SQL Server中给Department增加一条记录");
    }

    @Override
    public Department GetDepartment(int id) {
        System.out.println("在SQL Server中给根据ID得到Department表一条记录");
        return null;
    }
}
