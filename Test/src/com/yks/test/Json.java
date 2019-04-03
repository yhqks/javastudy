package com.yks.test;

public class Json {
  private String name;
  private String  text;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
@Override
public String toString() {
	return "Json [name=" + name + ", text=" + text + "]";
}
public Json() {
	super();
	// TODO Auto-generated constructor stub
}
public Json(String name, String text) {
	super();
	this.name = name;
	this.text = text;
}

}
