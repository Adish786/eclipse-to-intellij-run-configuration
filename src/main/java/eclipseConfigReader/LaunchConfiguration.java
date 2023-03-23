package eclipseConfigReader;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "launchConfiguration")
public class LaunchConfiguration {
    @XmlAttribute(name = "type", required = true)
    private String launchConfiguration;
    @XmlElement(name = "listAttribute")
    private List<ListAttribute> listAttribute;
    @XmlElement(name = "mapAttribute")
    private MapAttribute mapAttribute;
    @XmlElement(name = "booleanAttribute", required = true)
    private BooleanAttribute booleanAttribute;
    @XmlElement(name = "stringAttribute", required = true)
    private List<StringAttribute> stringAttribute;

    public LaunchConfiguration() {
    }

    @Override
    public String toString() {
        return "LaunchMain{" +
                "launchConfiguration='" + launchConfiguration + '\'' +
                ", listAttribute=" + listAttribute +
                ", mapAttribute=" + mapAttribute +
                ", booleanAttribute=" + booleanAttribute +
                ", stringAttribute=" + stringAttribute +
                '}';
    }

    public String getLaunchConfiguration() {
        return launchConfiguration;
    }

    public List<ListAttribute> getListAttribute() {
        return listAttribute;
    }

    public MapAttribute getMapAttribute() {
        return mapAttribute;
    }

    public BooleanAttribute getBooleanAttribute() {
        return booleanAttribute;
    }

    public List<StringAttribute> getStringAttribute() {
        return stringAttribute;
    }

}
