package swe642.project3.student_surveys.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student-survey")
public class StudentSurvey {
	@Id
	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "date", nullable = false)
	private String date;
	
	@Column(name = "streetAddress", nullable = false)
	private String streetAddress;
	
	@Column(name = "country", nullable = false)
	private String country;
	
	@Column(name = "city", nullable = false)
	private String city;
	
	@Column(name = "state", nullable = false)
	private String state;
	
	@Column(name = "zipCode", nullable = false)
	private String zipCode;
	
	@Column(name = "phoneNumber", nullable = false)
	private String phoneNumber;
	
	@Column(name = "likedMost_students", nullable = false)
	private boolean likedMost_students;
	
	@Column(name = "likedMost_location", nullable = false)
	private boolean likedMost_location;
	
	@Column(name = "likedMost_campus", nullable = false)
	private boolean likedMost_campus;
	
	@Column(name = "likedMost_atmosphere", nullable = false)
	private boolean likedMost_atmosphere;
	
	@Column(name = "likedMost_dormRooms", nullable = false)
	private boolean likedMost_dormRooms;
	
	@Column(name = "likedMost_sports", nullable = false)
	private boolean likedMost_sports;
	
	@Column(name = "howDidYouHear", nullable = false)
	private String howDidYouHear;
	
	@Column(name = "recommendationLikelihood", nullable = false)
	private String recommendationLikelihood;
	
	@Column(name = "additionalComments", nullable = false)
	private String additionalComments;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isLikedMost_students() {
		return likedMost_students;
	}

	public void setLikedMost_students(boolean likedMost_students) {
		this.likedMost_students = likedMost_students;
	}

	public boolean isLikedMost_location() {
		return likedMost_location;
	}

	public void setLikedMost_location(boolean likedMost_location) {
		this.likedMost_location = likedMost_location;
	}

	public boolean isLikedMost_campus() {
		return likedMost_campus;
	}

	public void setLikedMost_campus(boolean likedMost_campus) {
		this.likedMost_campus = likedMost_campus;
	}

	public boolean isLikedMost_atmosphere() {
		return likedMost_atmosphere;
	}

	public void setLikedMost_atmosphere(boolean likedMost_atmosphere) {
		this.likedMost_atmosphere = likedMost_atmosphere;
	}

	public boolean isLikedMost_dormRooms() {
		return likedMost_dormRooms;
	}

	public void setLikedMost_dormRooms(boolean likedMost_dormRooms) {
		this.likedMost_dormRooms = likedMost_dormRooms;
	}

	public boolean isLikedMost_sports() {
		return likedMost_sports;
	}

	public void setLikedMost_sports(boolean likedMost_sports) {
		this.likedMost_sports = likedMost_sports;
	}

	public String getHowDidYouHear() {
		return howDidYouHear;
	}

	public void setHowDidYouHear(String howDidYouHear) {
		this.howDidYouHear = howDidYouHear;
	}

	public String getRecommendationLikelihood() {
		return recommendationLikelihood;
	}

	public void setRecommendationLikelihood(String recommendationLikelihood) {
		this.recommendationLikelihood = recommendationLikelihood;
	}

	public String getAdditionalComments() {
		return additionalComments;
	}

	public void setAdditionalComments(String additionalComments) {
		this.additionalComments = additionalComments;
	}

	@Override
	public String toString() {
		return "StudentSurvey [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", date="
				+ date + ", streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", zipCode="
				+ zipCode + ", phoneNumber=" + phoneNumber + ", likedMost_students=" + likedMost_students
				+ ", likedMost_location=" + likedMost_location + ", likedMost_campus=" + likedMost_campus
				+ ", likedMost_atmosphere=" + likedMost_atmosphere + ", likedMost_dormRooms=" + likedMost_dormRooms
				+ ", likedMost_sports=" + likedMost_sports + ", howDidYouHear=" + howDidYouHear
				+ ", recommendationLikelihood=" + recommendationLikelihood + ", additionalComments="
				+ additionalComments + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(additionalComments, city, date, email, firstName, howDidYouHear, lastName,
				likedMost_atmosphere, likedMost_campus, likedMost_dormRooms, likedMost_location, likedMost_sports,
				likedMost_students, phoneNumber, recommendationLikelihood, state, streetAddress, zipCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentSurvey other = (StudentSurvey) obj;
		return Objects.equals(additionalComments, other.additionalComments) && Objects.equals(city, other.city)
				&& Objects.equals(date, other.date) && Objects.equals(email, other.email)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(howDidYouHear, other.howDidYouHear)
				&& Objects.equals(lastName, other.lastName) && likedMost_atmosphere == other.likedMost_atmosphere
				&& likedMost_campus == other.likedMost_campus && likedMost_dormRooms == other.likedMost_dormRooms
				&& likedMost_location == other.likedMost_location && likedMost_sports == other.likedMost_sports
				&& likedMost_students == other.likedMost_students && Objects.equals(phoneNumber, other.phoneNumber)
				&& Objects.equals(recommendationLikelihood, other.recommendationLikelihood)
				&& Objects.equals(state, other.state) && Objects.equals(streetAddress, other.streetAddress)
				&& Objects.equals(zipCode, other.zipCode);
	}

}
