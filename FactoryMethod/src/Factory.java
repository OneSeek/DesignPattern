
class AddFactory implements IFactory{

    @Override
    public Operation CreateOperation() {
        return new OperationAdd();
    }
}

class SubFactory implements IFactory{

    @Override
    public Operation CreateOperation() {
        return new OperationSub();
    }
}

class MulFactory implements IFactory{

    @Override
    public Operation CreateOperation() {
        return new OperationMul();
    }
}

class DivFactory implements IFactory{

    @Override
    public Operation CreateOperation() {
        return new OperationDiv();
    }
}