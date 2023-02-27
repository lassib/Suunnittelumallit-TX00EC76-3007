package decorator;

import java.util.Map;

public class DataStructure implements IDataAccess{

    private final Map<String, String> data;

    public DataStructure(Map<String, String> data) {
        this.data = data;
    }

    public IDataAccess readData() {
        return this;
    }

    public void add(String key, String value) {
        data.put(key, value);
    }

    @Override
    public String toString() {
        if (data == null) {
            return "There is no data";
        }
        return data.toString();
    }
}
