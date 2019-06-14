
public abstract class FlyWeight {

    public abstract void operation(int extrinsicState);

}

class ConcreteFlyWeight extends FlyWeight {

    @Override
    public void operation(int extrinsicState) {
	System.out.println("具体FlyWeight：" + extrinsicState);
    }

}

class UnsharedConcreteFlyWeight extends FlyWeight {

    @Override
    public void operation(int extrinsicState) {
	System.out.println("不共享的具体FlyWeight：" + extrinsicState);
    }

}