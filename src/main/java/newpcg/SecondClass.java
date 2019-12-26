package newpcg;

import java.util.Objects;

public class SecondClass extends ClassB {

    private String string1;
    private int int1;

    public SecondClass(String string1, int i) {
        this.string1 = string1;
        int1 = i;
    }

    public String getString1() {
        return string1;
    }

    public String updateString1(String value) {
        return string1 + value;
    }

    @Override
    public boolean equals(Object obj) {
        super.equals(new Object());
        return this.string1.equals(((SecondClass) obj).string1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SecondClass{");
        sb.append("string1='").append(string1).append('\'');
        sb.append(", int1=").append(int1);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(string1, int1);
    }
}
