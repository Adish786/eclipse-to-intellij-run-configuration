package eclipseConfigReader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class ListAttribute {
    @XmlElement(name = "listEntry")
    private List<ListEntry> listEntry;
    public List<ListEntry> getListEntry() {
        return listEntry;
    }

    public void setListEntry(List<ListEntry> listEntry) {
        this.listEntry = listEntry;
    }

    @Override
    public String toString() {
        return "ListAttribute{" +
                "listEntry=" + listEntry +
                '}';
    }

    public ListAttribute() {

    }

}
