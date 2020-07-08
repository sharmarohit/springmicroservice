package com.webware.microservice.explorecali.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TourPackage {

    @Id
    private String packageCode;

    @Column
    private String packageName;

    public String getPackageCode() {
        return packageCode;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public TourPackage(String packageCode, String packageName) {
        this.packageCode = packageCode;
        this.packageName = packageName;
    }

    @Override
    public String toString() {
        return "TourPackage{" +
                "code='" + packageCode + '\'' +
                ", name='" + packageName + '\'' +
                '}';
    }
}
