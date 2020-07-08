package com.webware.microservice.explorecali.service;

import com.webware.microservice.explorecali.domain.TourPackage;
import com.webware.microservice.explorecali.repository.TourPackageRepository;
import org.hibernate.id.IntegralDataTypeHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourPackageService {
    private TourPackageRepository tourPackageRepository;

    @Autowired
    public TourPackageService(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    public TourPackage createTourPackage(String packageCode, String packageName) {
        return new TourPackage(packageCode, packageName);
    }

    public Iterable<TourPackage> lookup() {return null;}

    public long total() {return 0;}
}
