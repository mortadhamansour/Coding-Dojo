package com.OmikujiForm;

public class message {
	private Integer number;
	private String city;
	private String person;
	private String hobby;
	private String thing;
	private String description;

	public message(Integer number, String city, String person, String hobby, String thing, String description) {
		this.setNumber(number);
		this.setCity(city);
		this.setPerson(person);
		this.setHobby(hobby);
		this.setThing(thing);
		this.setDescription(description);
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getThing() {
		return thing;
	}

	public void setThing(String thing) {
		this.thing = thing;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
