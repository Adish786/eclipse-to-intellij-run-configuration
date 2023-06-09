package eclipseConfigReader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class MapAttribute {
    @XmlElement(name = "mapEntry", required = true)
    private List<MapEntry> mapEntry;

    public List<MapEntry> getMapEntry() {
        return mapEntry;
    }

    public void setMapEntry(List<MapEntry> mapEntry) {
        this.mapEntry = mapEntry;
    }

    @Override
    public String toString() {
        return "MapAttribute{" +
                "mapEntry=" + mapEntry +
                '}';
    }

    public MapAttribute() {

    }
}
