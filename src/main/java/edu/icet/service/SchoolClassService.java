package edu.icet.service;

import java.util.List;

public interface SchoolClassService {

    void addSchoolClass(SchoolClass schoolClass);

    void updateSchoolClass(SchoolClass schoolClass);

    void deleteSchoolClass(Integer id);

    SchoolClass searchById(Integer id);

    List<SchoolClass> getAll();

}
