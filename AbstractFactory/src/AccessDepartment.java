public class AccessDepartment implements IDepartment {

    @Override
    public void Insert(Department department) {
        System.out.println("在Access中给Department表增加一条记录");
    }


    @Override
    public Department GetDepartment(int id) {
        System.out.println("在Access根据Id得到Department表的一条记录");
        return null;
    }
}
