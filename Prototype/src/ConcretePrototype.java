public class ConcretePrototype extends Prototype implements Cloneable{
    public ConcretePrototype(String id) {
        super(id);
    }

    @Override
    public Prototype Clone() {
        Prototype p = null;
        try {
            p = (Prototype) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
