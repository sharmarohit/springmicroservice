package com.webware.microservice.explorecali.repository;

import com.webware.microservice.explorecali.domain.Tour;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository<Tour, Integer> {
}
