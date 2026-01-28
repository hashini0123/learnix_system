package edu.icet.service.Impl;

import edu.icet.model.dto.SchoolClassDTO;
import edu.icet.repository.SchoolClassRepository;
import edu.icet.service.SchoolClassService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SchoolClassServiceImpl implements SchoolClassService {


    @Autowired
    SchoolClassRepository repository;

    @Override
    public void addSchoolClass(SchoolClassDTO schoolClass) {

        repository.
    }

    @Override
    public void updateSchoolClass(SchoolClassDTO schoolClass) {

    }

    @Override
    public void deleteSchoolClass(Integer id) {

    }

    @Override
    public SchoolClassDTO searchById(Integer id) {
        return null;
    }

    @Override
    public List<SchoolClassDTO> getAll() {
        return List.of();
    }
}
