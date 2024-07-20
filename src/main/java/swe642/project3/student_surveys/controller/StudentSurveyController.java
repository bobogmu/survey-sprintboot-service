package swe642.project3.student_surveys.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import swe642.project3.student_surveys.exception.ResourceNotFoundException;
import swe642.project3.student_surveys.model.StudentSurvey;
import swe642.project3.student_surveys.repository.StudentSurveyRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")  
public class StudentSurveyController {

	@Autowired
	private StudentSurveyRepository surveyRepository;

	public StudentSurveyController(StudentSurveyRepository surveyRepository) {
		super();
		this.surveyRepository = surveyRepository;
		System.out.println("StudentSurveyController initialized");
	}

	@PostMapping("/surveys")
	public void saveSurvey(@RequestBody String survey) {
		System.out.println("POST received");
		System.out.println(survey);
		// TODO: Send to SQL
		//return new ResponseEntity<StudentSurvey>(surveyRepository.save(survey), HttpStatus.CREATED);
	}

	@GetMapping("/surveys")
	public ResponseEntity<String> getAllSurveys() {
		System.out.println("Received GET from client");
		return ResponseEntity.ok().contentType(MediaType.TEXT_PLAIN).body("HI");
	}

	@GetMapping("{email}")
	public ResponseEntity<StudentSurvey> getSurveyByEmail(@PathVariable("email") String email) {
		Optional<StudentSurvey> survey = surveyRepository.findById(email);
		if (survey.isPresent()) {
			return new ResponseEntity<StudentSurvey>(survey.get(), HttpStatus.OK);
		} else {
			throw new ResourceNotFoundException("StudentSurvey", "Email", email);
		}
	}

	@PutMapping("{email}")
	public ResponseEntity<StudentSurvey> updateSurvey(@PathVariable("email") String email,
			@RequestBody StudentSurvey survey) {
		Optional<StudentSurvey> existingSurvey = surveyRepository.findById(email);
		if (existingSurvey.isPresent()) {
			StudentSurvey updateSurvey = existingSurvey.get();
			updateSurvey.setFirstName(survey.getFirstName());
			updateSurvey.setLastName(survey.getLastName());
			updateSurvey.setEmail(survey.getEmail());
			updateSurvey.setDate(survey.getDate());
			updateSurvey.setStreetAddress(survey.getStreetAddress());
			updateSurvey.setCity(survey.getCity());
			updateSurvey.setState(survey.getState());
			updateSurvey.setZipCode(survey.getZipCode());
			updateSurvey.setPhoneNumber(survey.getPhoneNumber());
			updateSurvey.setLikedMost_atmosphere(survey.isLikedMost_atmosphere());
			updateSurvey.setLikedMost_campus(survey.isLikedMost_campus());
			updateSurvey.setLikedMost_dormRooms(survey.isLikedMost_dormRooms());
			updateSurvey.setLikedMost_location(survey.isLikedMost_location());
			updateSurvey.setLikedMost_sports(survey.isLikedMost_sports());
			updateSurvey.setLikedMost_students(survey.isLikedMost_students());
			updateSurvey.setHowDidYouHear(survey.getHowDidYouHear());
			updateSurvey.setRecommendationLikelihood(survey.getRecommendationLikelihood());
			updateSurvey.setAdditionalComments(survey.getAdditionalComments());
			surveyRepository.save(updateSurvey);
			return new ResponseEntity<StudentSurvey>(updateSurvey, HttpStatus.OK);
		} else {
			throw new ResourceNotFoundException("StudentSurvey", "Email", email);
		}
	}

	@DeleteMapping("{email}")
	public ResponseEntity<String> deleteSurvey(@PathVariable("email") String email) {
		Optional<StudentSurvey> survey = surveyRepository.findById(email);
		if (survey.isPresent()) {
			surveyRepository.deleteById(email);
			return new ResponseEntity<String>("Survey deleted successfully", HttpStatus.OK);
		} else {
			throw new ResourceNotFoundException("StudentSurvey", "Email", email);
		}
	}

}
