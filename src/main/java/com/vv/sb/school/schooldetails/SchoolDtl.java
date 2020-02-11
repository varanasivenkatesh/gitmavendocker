package com.vv.sb.school.schooldetails;

public class SchoolDtl {

    private String schoolName;

    public SchoolDtl(String schoolName, String schoolAddress, String schoolType) {
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.schoolType = schoolType;
    }

    private String schoolAddress;
    private String schoolType;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }
}
