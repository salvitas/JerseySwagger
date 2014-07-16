package org.salvix.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Phone Model")
@XmlRootElement(name = "Phone")
public class Phone {

	private String model;
	private String brand;

	@XmlElement(name = "brand")
	@ApiModelProperty(value = "Phone Brand", required = true, allowableValues = "iPhone,Motorola,Nexus")
	public String getBrand() {
		return brand;
	}

	@XmlElement(name = "model")
	@ApiModelProperty(value = "Phone Model")
	public String getModel() {
		return model;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", model=" + model + "]";
	}
}
