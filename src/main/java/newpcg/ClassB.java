package newpcg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClassB extends ClassA {

    private Integer y;
    private long j;

    public Integer getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public long getJ() {
        return j;
    }

    public void setJ(long j) {
        this.j = j;
    }

    public void newMethod() {
        List<String> stringList = Arrays.asList("a", "b", "c");
        System.out.println(stringList.stream().filter(value -> value.equals("b")).map(value -> value + "aaaa").collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassB classB = (ClassB) o;
        return y == classB.y &&
                j == classB.j;
    }

    public void nullable() throws Exception {
        String myString = null;
        System.out.println(myString.hashCode());
        throw new Exception();
    }

    public static void main(String[] args) {
        ClassB clas = new ClassB();
        System.out.println(clas.getY().toString());
    }
}
