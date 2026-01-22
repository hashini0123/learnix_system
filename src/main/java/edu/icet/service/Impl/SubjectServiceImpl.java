package edu.icet.service.Impl;

import edu.icet.model.dto.SubjectDTO;
import edu.icet.model.entity.SubjectEntity;
import edu.icet.repository.SubjectRepository;
import edu.icet.service.SubjectService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    SubjectRepository repository;

    @Autowired
    ModelMapper mapper;

    @Override
    public void addSubject(SubjectDTO subject) {
        SubjectEntity entity = mapper.map(subject,SubjectEntity.class);
        repository.save(entity);

    }

    @Override
    public void updateSubject(SubjectDTO subject) {
        repository.save(mapper.map(subject,SubjectEntity.class));
    }

    @Override
    public void deleteSubject(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public SubjectDTO serchById(Integer id) {
        SubjectEntity subjectEntity = repository.findById(id).get();
        SubjectDTO subjectDTO = mapper.map(subjectEntity,SubjectDTO.class);
        return subjectDTO;
    }

    @Override
    public List<SubjectDTO> getAll() {
    List<SubjectEntity> subjectEntities = repository.findAll();
        ArrayList<SubjectDTO> subjectDTOArrayList = new ArrayList<>();
        subjectEntities.forEach(SubjectEntity subjectEntity ->{
            SubjectDTO subjectDTO = mapper.map(subjectEntity,SubjectDTO.class);
        });
    }
}
