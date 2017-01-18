package controller;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "BMIcount")
public class BMIcount {

	private String text;
	private String height;
	private String weight;
	private String result="";

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getResult() {
		return result;
	}
	public String setResult() {
		return result;
	}

	public void countResult() {
		int h = Integer.valueOf(height);
		int w = Integer.valueOf(weight);

		double r = w / (h * 0.01)*(h*0.01);
		
		result ="Name:"+text+" BMI:"+r;
	}

}
