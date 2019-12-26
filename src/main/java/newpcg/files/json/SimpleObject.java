package newpcg.files.json;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.StringJoiner;

@XStreamAlias("newpcg.files.json.SimpleObject")
public class SimpleObject {

    private String name;
    private Integer age;
    private String city;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SimpleObject.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .add("city='" + city + "'")
                .add("country='" + country + "'")
                .toString();
    }
}
