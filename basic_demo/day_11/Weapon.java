package basic_demo.day_11;

public class Weapon {
    private String name;
    private int hurt;

    public String getName() {
        return name;
    }

    public Weapon(String name, int hurt) {
        this.name = name;
        this.hurt = hurt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }
}
