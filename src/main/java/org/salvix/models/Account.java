package org.salvix.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;



@ApiModel(value = "Account Model")
@XmlRootElement(name = "Account")
public class Account {

    private String name;
    private String currency;
    private String groupCode;
    private String iban;

    @XmlElement(name = "name")
    @ApiModelProperty(value = "Account name", required = true, allowableValues = "iAccount,Motorola,Nexus")
    public String getName() {
        return name;
    }

    @XmlElement(name = "currency")
    @ApiModelProperty(value = "Account currency", required = true, allowableValues = "iAccount,Motorola,Nexus")
    public String getCurrency() {
        return currency;
    }

    @XmlElement(name = "groupCode")
    @ApiModelProperty(value = "Account groupCode", required = true, allowableValues = "iAccount,Motorola,Nexus")
    public String getGroupCode() {
        return groupCode;
    }

    @XmlElement(name = "iban")
    @ApiModelProperty(value = "Account iban", required = true, allowableValues = "iAccount,Motorola,Nexus")
    public String getIban() {
        return iban;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrency(String currency) {
        this.currency= currency;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode= groupCode;
    }

    public void setIban(String iban) {
        this.iban= iban;
    }

    @Override
    public String toString() {
        return "Account [name=" + name + ", currency=" + currency + "]";
    }
}
