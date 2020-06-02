package day13_Stream.SuperReference;

/**
 * Created by yanyuchun on 2020/6/1
 */
public class Man extends Human {
    // 子类重写父类sayHello的方法

    @Override
    public void sayHello() {
        System.out.println("Hello ,I'm Man!");
    }

    public void method(Greetable g){
        g.greet();
    }

    public  void show(){
//        method(()->{
//            // 创建父类Human对象，
//            Human h = new Human();
//            //调用父类方法
//            h.sayHello();
//        });
        // 因为有子父类关系，存在关键字super，代表父类，可以直接使用
        method(()->super.sayHello());

        /*
        使用super引用父类的成员方法
        super是已经存在的
        父类的成员方法也是已经存在的
         */
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
