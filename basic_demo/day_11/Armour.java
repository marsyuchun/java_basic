package basic_demo.day_11;

public class Armour {
    String name;
    int protect;

    public String getName() {
        return name;
    }

    public Armour(String name, int protect) {
        this.name = name;
        this.protect = protect;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtect() {
        return protect;
    }

    public void setProtect(int protect) {
        this.protect = protect;
    }
}
