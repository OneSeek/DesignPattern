public class AccessUser implements IUser{
    public void  Insert(User user){
        System.out.println("在Access中给User增加一条记录");
    }

    public User GetUser(int id){
        System.out.println("在Access根据Id得到记录");
        return null;
    }
}
