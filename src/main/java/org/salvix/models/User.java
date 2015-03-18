package org.salvix.models;

import java.util.*;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@ApiModel(value = "User Model")
@XmlRootElement(name = "User")
public class User {

    private String username;
    private String password;
    private String citizenship;
    private String firstName;
    private String lastName;
    private String identityNumber;
    private String gender;
    private Date dateOfBirth;
    private Boolean useOTP;
    private List<Location> locations = new ArrayList<Location>();
    private List<Preference> preferences = new ArrayList<Preference>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    @XmlElement(name = "username")
    @ApiModelProperty(value = "User username", required = true)
    public String getUsername() {
        return username;
    }

    @XmlElement(name = "password")
    @ApiModelProperty(value = "User password", required = true)
    public String getPassword() {
        return password;
    }

    @XmlElement(name = "preferences")
    @ApiModelProperty(value = "User preferences", required = true)
    public List<Preference> getPreferences() {
        return preferences;
    }

    @XmlElement(name = "citizenship")
    @ApiModelProperty(value = "User citizenship", required = true)
    public String getCitizenship() {
        return citizenship;
    }

    @XmlElement(name = "firstName")
    @ApiModelProperty(value = "User firstName", required = true)
    public String getFirstName() {
        return firstName;
    }

    @XmlElement(name = "lastName")
    @ApiModelProperty(value = "User lastName", required = true)
    public String getLastName() {
        return lastName;
    }

    @XmlElement(name = "identityNumber")
    @ApiModelProperty(value = "User identityNumber", required = true)
    public String getIdentityNumber() {
        return identityNumber;
    }

    @XmlElement(name = "gender")
    @ApiModelProperty(value = "User gender", required = true)
    public String getGender() {
        return gender;
    }

    @XmlElement(name = "dateOfBirth")
    @ApiModelProperty(value = "User dateOfBirth", required = true)
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @XmlElement(name = "useOTP")
    @ApiModelProperty(value = "User useOTP", required = true)
    public Boolean getUseOTP() {
        return useOTP;
    }

    @XmlElement(name = "locations")
    @ApiModelProperty(value = "User locations", required = true)
    public List<Location> getLocations() {
        return locations;
    }


    /**
     *
     * @param username
     * The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @param password
     * The password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     *
     * @param citizenship
     * The citizenship
     */
    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    /**
     *
     * @param firstName
     * The firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    /**
     *
     * @param lastName
     * The lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     *
     * @param identityNumber
     * The identityNumber
     */
    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    /**
     *
     * @param gender
     * The gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     *
     * @param dateOfBirth
     * The dateOfBirth
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     *
     * @param useOTP
     * The useOTP
     */
    public void setUseOTP(Boolean useOTP) {
        this.useOTP = useOTP;
    }

    /**
     *
     * @param locations
     * The locations
     */
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }



    /**
     *
     * @param preferences
     * The preferences
     */
    public void setPreferences(List<Preference> preferences) {
        this.preferences = preferences;
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