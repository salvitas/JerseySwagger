package org.salvix.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@ApiModel(value = "Contact Model")
@XmlRootElement(name = "Contact")
public class Contact {

    private String name;
    private String photoUrl;
    private String account;
    private List<Detail> details = new ArrayList<Detail>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @XmlElement(name = "name")
    @ApiModelProperty(value = "Contact name", required = true)
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "photoUrl")
    @ApiModelProperty(value = "Contact photoUrl", required = true)
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     *
     * @param photoUrl
     * The photoUrl
     */
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @XmlElement(name = "account")
    @ApiModelProperty(value = "Contact account", required = true)
    public String getAccount() {
        return account;
    }

    /**
     *
     * @param account
     * The account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    @XmlElement(name = "details")
    @ApiModelProperty(value = "Contact details", required = true)
    public List<Detail> getDetails() {
        return details;
    }

    /**
     *
     * @param details
     * The details
     */
    public void setDetails(List<Detail> details) {
        this.details = details;
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