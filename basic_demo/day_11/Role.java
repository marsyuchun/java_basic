package basic_demo.day_11;

import basic_demo.day_11.Interface.MagicAttack;

import javax.annotation.Resource;

@Resource
public class Role {
    private int id;
    private String name;
    private int blood;
    private Weapon wp;
    private Armour ar;
    MagicAttack ma;


    public void setMa(MagicAttack ma) {
        this.ma = ma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public Weapon getWp() {
        return wp;
    }

    public void setWp(Weapon wp) {
        this.wp = wp;
    }

    public Armour getAm() {
        return ar;
    }

    public void setAm(Armour ar) {
        this.ar = ar;
    }

    // 攻击方法
    public void attack(){
        System.out.println("使用"+ wp.getName() +", 造成"+wp.getHurt()+"点伤害");
    }


    public Role(int id, String name, int blood) {
        this.id = id;
        this.name = name;
        this.blood = blood;
    }

    // 穿戴盔甲
    public void wear(){
        // 增加防御,就是增加blood值
        this.blood += ar.getProtect();
        System.out.println("穿上"+ar.getName()+", 生命值增加"+ar.getProtect()+"当前生命值为："+this.getBlood());
    }

    // 法术攻击
    public void magicSkillAttack(){
        System.out.println("发动法术攻击:");
        ma.magicAttack();
        System.out.println("攻击完毕");
    }
}
