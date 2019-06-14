public class SqlserverUser implements IUser{
    public void  Insert(User user){
        System.out.println("在SQL Server中给User增加一条记录");
    }

    public User GetUser(int id){
        System.out.println("在SQL Server根据Id得到记录");
        return null;
    }
}
