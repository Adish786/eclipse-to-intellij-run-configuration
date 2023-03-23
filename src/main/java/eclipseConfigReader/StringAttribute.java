package eclipseConfigReader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class StringAttribute {
    @XmlAttribute(name = "key")
    private String key;
    @XmlAttribute(name = "value")
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "StringAttribute{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }


}
