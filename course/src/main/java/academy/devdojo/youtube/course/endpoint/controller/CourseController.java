package academy.devdojo.youtube.course.endpoint.controller;

import academy.devdojo.youtube.core.model.Course;
import academy.devdojo.youtube.core.repository.CourseRepository;
import academy.devdojo.youtube.course.endpoint.service.CourseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("v1/admin/course")
@Slf4j
@RequiredArgsConstructor
public class CourseController {
	@Autowired
	private final CourseService courseService;
	private final CourseRepository courseRepository;

	private void verifyCourseExists(Long id){
		if(!courseRepository.findById(id).isPresent())
			throw new ResourceNotFoundException("Course not found for ID: " + id);
	}

	@SuppressWarnings("deprecation")
	@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Iterable<Course>> list(Pageable pageable) {
		return new ResponseEntity<>(courseService.list(pageable), HttpStatus.OK);
	}

	@GetMapping(path="/{id}")
	public ResponseEntity<?> getCourseById (@PathVariable Long id){
		verifyCourseExists(id);
		return new ResponseEntity<>(courseRepository.findById(id), HttpStatus.OK);
	}

	@Validated
	@Transactional(rollbackFor = Exception.class)
	@PostMapping
	public ResponseEntity<?> save(@Valid @RequestBody Course course){
		return new ResponseEntity<>(courseRepository.save(course), HttpStatus.CREATED);
	}
}
