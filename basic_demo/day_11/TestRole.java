package basic_demo.day_11;

import basic_demo.day_11.Interface.MagicAttack;

public class TestRole {
    public static void main(String[] args) {
        Weapon wp = new Weapon("屠龙刀",300);
        Armour ar =new Armour("复活甲",1000);
        Role re = new Role(1001,"武佳文",1000);
        re.setMa(new MagicAttack() {
            @Override
            public void magicAttack() {
                System.out.println("降龙十八掌");
            }
        });

        re.setAm(ar);
        re.setWp(wp);

        re.attack();
        re.wear();
        re.magicSkillAttack();

        System.out.println("换个技能试试");
        // 换个技能
        re.setMa(() -> {
            System.out.println("吸星大法");
        });
        re.magicSkillAttack();
    }
}
