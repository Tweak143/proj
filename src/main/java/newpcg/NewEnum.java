package newpcg;

public enum NewEnum {
    STAGE("url1"),
    PROD("url1"),
    TEST("url1");

    private String value;
    private int i;

    NewEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
