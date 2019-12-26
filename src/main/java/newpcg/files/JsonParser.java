package newpcg.files;

import com.google.gson.Gson;
import newpcg.files.json.SimpleObject;

public class JsonParser {

    private static final Gson gson = new Gson();
    private String json = "{" +
            "name: \"\"," +
            " age: 12," +
            " city: \"NYC\"," +
            " country: \"USA\"" +
            "}";
    private String path = "src\\main\\resources\\ex.json";

    public SimpleObject from() {
        return gson.fromJson(json, SimpleObject.class);
    }

    public String to() {
        return gson.toJson(from());
    }

    public static void main(String[] args) {
        JsonParser parser = new JsonParser();
        System.out.println(parser.from());
        System.out.println(parser.to());
    }
}
