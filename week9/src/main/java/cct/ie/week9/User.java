package cct.ie.week9;

import java.util.ArrayList;

public class User {

	private int id;
	private String name;
	private String email;
	private String password;
	private boolean smoker;
	private int age;
	double latitude;
	double longitude;
	private ArrayList<String> hobbies = new ArrayList<>();

	public User(String email, String password) {

		this.email = email;
		this.password = password;

	}

	/**
	 * 
	 */
	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isSmoker() {
		return smoker;
	}

	public void setSmoker(boolean smoker) {
		this.smoker = smoker;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public ArrayList<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", smoker="
				+ smoker + ", age=" + age + ", latitude=" + latitude + ", longitude=" + longitude + ", hobbies="
				+ hobbies + "]";
	}

}
