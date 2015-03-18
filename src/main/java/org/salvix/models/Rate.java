package org.salvix.models;

import java.util.HashMap;
import java.util.Map;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@ApiModel(value = "Rate Model")
@XmlRootElement(name = "Rate")
public class Rate {

    private String sourceCurrency;
    private String targetCurrency;
    private Double exchangeRate;
    private Boolean isPreferred;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @XmlElement(name = "sourceCurrency")
    @ApiModelProperty(value = "Rate sourceCurrency", required = true)
    public String getSourceCurrency() {
        return sourceCurrency;
    }

    @XmlElement(name = "targetCurrency")
    @ApiModelProperty(value = "Rate targetCurrency", required = true)
    public String getTargetCurrency() { return targetCurrency; }

    @XmlElement(name = "isPreferred")
    @ApiModelProperty(value = "Rate isPreferred", required = true)
    public Boolean getIsPreferred() {
        return isPreferred;
    }

    @XmlElement(name = "exchangeRate")
    @ApiModelProperty(value = "Rate exchangeRate", required = true)
    public Double getExchangeRate() {
        return exchangeRate;
    }


    /**
     *
     * @param sourceCurrency
     * The sourceCurrency
     */
    public void setSourceCurrency(String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    /**
     *
     * @param targetCurrency
     * The targetCurrency
     */
    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }


    /**
     *
     * @param exchangeRate
     * The exchangeRate
     */
    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    /**
     *
     * @param isPreferred
     * The isPreferred
     */
    public void setIsPreferred(Boolean isPreferred) {
        this.isPreferred = isPreferred;
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