package swe642.project3.student_surveys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import swe642.project3.student_surveys.model.StudentSurvey;

public interface StudentSurveyRepository  extends JpaRepository<StudentSurvey, String> {

}
