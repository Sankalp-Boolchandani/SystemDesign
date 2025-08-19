package adapterDp;


import org.json.JSONObject;
import org.json.XML;

public class XmlToJsonAdapter implements JsonData{

    XmlProvider xmlProvider;

    public XmlToJsonAdapter(XmlProvider xmlProvider) {
        this.xmlProvider = xmlProvider;
    }

    @Override
    public String getJsonData() {
        String xml = xmlProvider.getXml();
        JSONObject jsonObject = XML.toJSONObject(xml);
        return jsonObject.toString();
    }
}
