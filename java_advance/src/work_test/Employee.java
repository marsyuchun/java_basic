package work_test;

/**
 * Created by yanyuchun on 2020/5/7
 */
public enum Employee {

    PRODUCT_MANAGER("1036","产品经理"),

    TEST_DEVELPOPMENT("1035","测试开发");

    public String getCode() {
        return code;
    }

    Employee(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    public String getDesc() {
        return desc;
    }

    private String code;
    private String desc;

}
