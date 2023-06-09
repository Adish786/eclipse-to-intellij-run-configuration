package intellijConfigWriter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Configuration {
    @XmlAttribute(name = "default")
    private String defaults;
    @XmlAttribute(name = "name")
    private String name;
    @XmlAttribute(name = "type")
    private String type;
    @XmlAttribute(name = "factoryName")
    private String factoryName;
    @XmlAttribute(name = "nameIsGenerated")
    private String nameIsGenerated;
    @XmlElement(name = "envs")
    private List<Envs> envs;
    @XmlElement(name = "option")
    private List<Option> option;
    @XmlElement(name = "module")
    private Module module;
    @XmlElement(name = "extension")
    private List<Extension> extension;
    @XmlElement(name = "method")
    private List<Method> method;

    @Override
    public String toString() {
        return "Configuration{" +
                "defaults='" + defaults + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", factoryName='" + factoryName + '\'' +
                ", nameIsGenerated='" + nameIsGenerated + '\'' +
                ", envs=" + envs +
                ", option=" + option +
                ", module=" + module +
                ", extension=" + extension +
                ", method=" + method +
                '}';
    }

    public Configuration(String defaults, String name, String type, String factoryName, String nameIsGenerated, List<Envs> envs, List<Option> option, Module module, List<Extension> extension, List<Method> method) {
        this.defaults = defaults;
        this.name = name;
        this.type = type;
        this.factoryName = factoryName;
        this.nameIsGenerated = nameIsGenerated;
        this.envs = envs;
        this.option = option;
        this.module = module;
        this.extension = extension;
        this.method = method;
    }

    public String getDefaults() {
        return defaults;
    }

    public void setDefaults(String defaults) {
        this.defaults = defaults;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getNameIsGenerated() {
        return nameIsGenerated;
    }

    public void setNameIsGenerated(String nameIsGenerated) {
        this.nameIsGenerated = nameIsGenerated;
    }

    public List<Envs> getEnvs() {
        return envs;
    }

    public void setEnvs(List<Envs> envs) {
        this.envs = envs;
    }

    public List<Option> getOption() {
        return option;
    }

    public void setOption(List<Option> option) {
        this.option = option;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public List<Extension> getExtension() {
        return extension;
    }

    public void setExtension(List<Extension> extension) {
        this.extension = extension;
    }

    public List<Method> getMethod() {
        return method;
    }

    public void setMethod(List<Method> method) {
        this.method = method;
    }

    public Configuration() {
    }
}
