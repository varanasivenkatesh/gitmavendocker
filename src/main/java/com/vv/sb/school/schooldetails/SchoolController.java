package com.vv.sb.school.schooldetails;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {

    @GetMapping("/getSchoolDtl")
    public SchoolDtl getSchoolDetails()
    {
        return new SchoolDtl("INTER","Hyderabad","International");
    }
}
