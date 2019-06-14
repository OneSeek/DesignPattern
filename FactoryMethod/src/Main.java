public class Main {

    public static void main(String[] args) {
        IFactory operFactory = new AddFactory();
        Operation oper = operFactory.CreateOperation();
        oper.NumberA = 1;
        oper.NumberB = 2;
        double result = oper.GetResult();
        System.out.println(result );
    }
}
