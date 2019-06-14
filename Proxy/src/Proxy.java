public class Proxy implements IGiveGift {
    Pursuit gg;
    public Proxy(SchoolGirl mm){
        gg = new Pursuit(mm);
    }
    @Override
    public void GiveDolls() {
        gg.GiveDolls();
    }

    @Override
    public void GiveFlower() {
        gg.GiveFlower();
    }

    @Override
    public void GiveChocolate() {
        gg.GiveChocolate();
    }
}
