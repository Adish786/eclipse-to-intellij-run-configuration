package eclipseConfigReader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class ListEntry {
    @XmlAttribute(name = "value")
    private String value;
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ListEntry{" +
                "value='" + value + '\'' +
                '}';
    }

    public ListEntry() {

    }
}
