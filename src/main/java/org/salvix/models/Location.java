package org.salvix.models;

import java.util.HashMap;
import java.util.Map;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@ApiModel(value = "Location Model")
@XmlRootElement(name = "Location")
public class Location {

    private String name;
    private String value;
    private Boolean json;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    @XmlElement(name = "name")
    @ApiModelProperty(value = "Location name", required = true)
    public String getName() {
        return name;
    }

    @XmlElement(name = "type")
    @ApiModelProperty(value = "Location type", required = true)
    public String getValue() {
        return value;
    }

    @XmlElement(name = "json")
    @ApiModelProperty(value = "Location json", required = true)
    public Boolean getJson() {
        return json;
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
     * @param value
     * The value
     */
    public void setValue(String value) {
        this.value = value;
    }




    /**
     *
     * @param json
     * The json
     */
    public void setJson(Boolean json) {
        this.json = json;
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