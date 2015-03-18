package org.salvix.models;

import java.util.HashMap;
import java.util.Map;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@ApiModel(value = "Preference Model")
@XmlRootElement(name = "Preference")
public class Preference {

    private String name;
    private String type;
    private String value;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    @XmlElement(name = "name")
    @ApiModelProperty(value = "Preference name", required = true)
    public String getName() {
        return name;
    }


    @XmlElement(name = "type")
    @ApiModelProperty(value = "Preference type", required = true)
    public String getType() {
        return type;
    }

    @XmlElement(name = "value")
    @ApiModelProperty(value = "Preference value", required = true)

    public String getValue() {
        return value;
    }



    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @param value
     * The value
     */
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}