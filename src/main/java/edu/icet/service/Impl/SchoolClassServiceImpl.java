package edu.icet.service.Impl;

import edu.icet.model.dto.SchoolClassDTO;
import edu.icet.model.entity.SchoolClassEntity;
import edu.icet.repository.SchoolClassRepository;
import edu.icet.service.SchoolClassService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolClassServiceImpl implements SchoolClassService {


    @Autowired
    SchoolClassRepository repository;

    @Autowired
    ModelMapper mapper;

    @Override
    public void addSchoolClass(SchoolClassDTO schoolClass) {

        SchoolClassEntity schoolClassEntity = mapper.map(schoolClass,SchoolClassEntity.class);
        repository.save(schoolClassEntity);
    }

    @Override
    public void updateSchoolClass(SchoolClassDTO schoolClass) {

        repository.save(mapper.map(schoolClass,SchoolClassEntity.class));

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
