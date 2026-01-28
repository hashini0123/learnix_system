package edu.icet.service;

import edu.icet.model.dto.SchoolClassDTO;

import java.util.List;

public interface SchoolClassService {

    void addSchoolClass(SchoolClassDTO schoolClass);

    void updateSchoolClass(SchoolClassDTO schoolClass);

    void deleteSchoolClass(Integer id);

    SchoolClassDTO searchById(Integer id);

    List<SchoolClassDTO> getAll();

}
