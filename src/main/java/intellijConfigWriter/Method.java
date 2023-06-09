package intellijConfigWriter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Method {
    @XmlElement(name = "option")
    private List<Option> option;
    @XmlAttribute(name = "v")
    private String version;

    public List<Option> getOption() {
        return option;
    }

    public void setOption(List<Option> option) {
        this.option = option;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Method(List<Option> option, String version) {
        this.option = option;
        this.version = version;
    }

    @Override
    public String toString() {
        return "Method{" +
                "option=" + option +
                ", version='" + version + '\'' +
                '}';
    }

    public Method() {
    }
}
