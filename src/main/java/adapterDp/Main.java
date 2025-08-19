package adapterDp;

public class Main {

    public static void main(String[] args) {

        XmlProvider xmlProvider=new XmlProvider();
        XmlToJsonAdapter xmlToJson=new XmlToJsonAdapter(xmlProvider);

        String resultJson = xmlToJson.getJsonData();
        System.out.println(resultJson);

    }

}
