public class Operation {
    public double NumberA;
    public double NumberB;

    public double GetResult(){
        return 0;
    }
}
class OperationAdd extends Operation{
    public double GetResult(){
        return NumberA + NumberB;
    }
}

class OperationSub extends Operation{
    public double GetResult(){
        return NumberA - NumberB;
    }
}

class OperationMul extends Operation{
    public double GetResult(){
        return NumberA * NumberB;
    }
}

class OperationDiv extends Operation{
    public double GetResult(){
        return NumberA / NumberB;
    }
}