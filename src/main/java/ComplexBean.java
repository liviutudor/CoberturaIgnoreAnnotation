import java.util.Map;

/**
 * Created by ltudor on 5/14/15.
 */
public class ComplexBean {
    private Map<String, String> propertyMap;

    private int propertyInt;

    public ComplexBean() {
    }

    public ComplexBean(Map<String, String> propertyMap, int propertyInt) {
        this.propertyMap = propertyMap;
        this.propertyInt = propertyInt;
    }

    public Map<String, String> getPropertyMap() {
        return propertyMap;
    }

    public void setPropertyMap(Map<String, String> propertyMap) {
        this.propertyMap = propertyMap;
    }

    public int getPropertyInt() {
        return propertyInt;
    }

    public void setPropertyInt(int propertyInt) {
        this.propertyInt = propertyInt;
    }

    public boolean someLibraryMethod() {
        return true;
    }

    @Override @AvoidCoverage
    public String toString() {
        return "ComplexBean: [int=" + propertyInt + ", has data=" + (propertyMap != null && !propertyMap.isEmpty()) + "]";
    }

}
