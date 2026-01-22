package edu.icet.service;

import edu.icet.model.dto.SubjectDTO;

import java.util.List;

public interface SubjectService {

    void addSubject(SubjectDTO subject);

    void updateSubject(SubjectDTO subject);

    void deleteSubject(Integer id);

    SubjectDTO serchById(Integer id);

    List<SubjectDTO> getAll();
}
