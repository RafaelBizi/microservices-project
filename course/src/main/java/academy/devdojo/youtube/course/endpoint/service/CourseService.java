package academy.devdojo.youtube.course.endpoint.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import academy.devdojo.youtube.core.model.Course;
import academy.devdojo.youtube.core.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
@RequiredArgsConstructor
public class CourseService {
	private final CourseRepository courseRepository;

	public Iterable<Course> list(Pageable pageable) {
    	Logger logger = LoggerFactory.getLogger(Course.class);
    	logger.info("Listing all courses");
        return courseRepository.findAll(pageable);
    }
}