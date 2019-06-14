public class SqlServerFactory implements IFactory {
    @Override
    public IUser CreateUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment CreateDepartment() {
        return new SqlserverDepartment();
    }
}
