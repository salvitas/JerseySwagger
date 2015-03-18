package org.salvix.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@ApiModel(value = "Transaction Model")
@XmlRootElement(name = "Transaction")
public class Transaction {

    private String counterPartyName;
    private String counterPartyAccount;
    private String counterPartyLogoPath;
    private String instructedCurrency;
    private String transactionCurrency;
    private String accountID;
    private String accountFrom;
    private String accountTo;
    private String transactionType;
    private String currencyFrom;
    private String currencyTo;
    private java.util.Date date;
    private String fXRate;
    private BigDecimal amount;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    @XmlElement(name = "fXRate")
    @ApiModelProperty(value = "Transaction fXRate", required = true)
    public String getfXRate() {
        return fXRate;
    }

    public void setfXRate(String fXRate) {
        this.fXRate = fXRate;
    }

    @XmlElement(name = "accountID")
    @ApiModelProperty(value = "Transaction accountID", required = true)
    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    @XmlElement(name = "accountFrom")
    @ApiModelProperty(value = "Transaction accountFrom", required = true)
    public String getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(String accountFrom) {
        this.accountFrom = accountFrom;
    }

    @XmlElement(name = "accountTo")
    @ApiModelProperty(value = "Transaction accountTo", required = true)
    public String getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(String accountTo) {
        this.accountTo = accountTo;
    }

    @XmlElement(name = "transactionType")
    @ApiModelProperty(value = "Transaction transactionType", required = true)
    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @XmlElement(name = "currencyFrom")
    @ApiModelProperty(value = "Transaction currencyFrom", required = true)
    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public void setCurrencyFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    @XmlElement(name = "currencyTo")
    @ApiModelProperty(value = "Transaction currencyTo", required = true)
    public String getCurrencyTo() {
        return currencyTo;
    }

    public void setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    @XmlElement(name = "date")
    @ApiModelProperty(value = "Transaction date", required = true)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @XmlElement(name = "counterPartyName")
    @ApiModelProperty(value = "Transaction counterPartyName", required = true)
    public String getCounterPartyName() {
        return counterPartyName;
    }

    @XmlElement(name = "counterPartyAccount")
    @ApiModelProperty(value = "Transaction counterPartyAccount", required = true)
    public String getCounterPartyAccount() {
        return counterPartyAccount;
    }

    @XmlElement(name = "transactionCurrency")
    @ApiModelProperty(value = "Transaction transactionCurrency", required = true)
    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    @XmlElement(name = "counterPartyLogoPath")
    @ApiModelProperty(value = "Transaction counterPartyLogoPath", required = true)
    public String getCounterPartyLogoPath() {
        return counterPartyLogoPath;
    }


    @XmlElement(name = "amount")
    @ApiModelProperty(value = "Transaction amount", required = true)
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     *
     * @param counterPartyName
     * The counterPartyName
     */
    public void setCounterPartyName(String counterPartyName) {
        this.counterPartyName = counterPartyName;
    }


    /**
     *
     * @param counterPartyAccount
     * The counterPartyAccount
     */
    public void setCounterPartyAccount(String counterPartyAccount) {
        this.counterPartyAccount = counterPartyAccount;
    }

    /**
     *
     * @param counterPartyLogoPath
     * The counterPartyLogoPath
     */
    public void setCounterPartyLogoPath(String counterPartyLogoPath) {
        this.counterPartyLogoPath = counterPartyLogoPath;
    }

    /**
     *
     * @return
     * The instructedCurrency
     */
    public String getInstructedCurrency() {
        return instructedCurrency;
    }

    /**
     *
     * @param instructedCurrency
     * The instructedCurrency
     */
    public void setInstructedCurrency(String instructedCurrency) {
        this.instructedCurrency = instructedCurrency;
    }

    /**
     *
     * @param transactionCurrency
     * The transactionCurrency
     */
    public void setTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
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