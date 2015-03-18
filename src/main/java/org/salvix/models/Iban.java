package org.salvix.models;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;

@ApiModel(value = "Iban Model")
@XmlRootElement(name = "Iban")
public class Iban {

    private String countryCode;
    private String countryName;
    private Integer ibanLength;
    private String ibanRegex;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @XmlElement(name = "countryCode")
    @ApiModelProperty(value = "Iban countryCode", required = true)
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode The countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @XmlElement(name = "countryName")
    @ApiModelProperty(value = "Iban countryName", required = true)
    public String getCountryName() {
        return countryName;
    }

    /**
     * @param countryName The countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @XmlElement(name = "ibanLength")
    @ApiModelProperty(value = "Iban ibanLength", required = true)
    public Integer getIbanLength() {
        return ibanLength;
    }

    /**
     * @param ibanLength The ibanLength
     */
    public void setIbanLength(Integer ibanLength) {
        this.ibanLength = ibanLength;
    }

    @XmlElement(name = "ibanRegex")
    @ApiModelProperty(value = "Iban ibanRegex", required = true)
    public String getIbanRegex() {
        return ibanRegex;
    }

    /**
     * @param ibanRegex The ibanRegex
     */
    public void setIbanRegex(String ibanRegex) {
        this.ibanRegex = ibanRegex;
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
