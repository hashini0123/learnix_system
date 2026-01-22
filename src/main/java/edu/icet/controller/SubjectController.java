package edu.icet.controller;


import edu.icet.model.dto.SubjectDTO;
import edu.icet.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    SubjectService service;

    @PostMapping("/add")
    public void addSubject(@RequestBody SubjectDTO subjectDTO){

        service.addSubject(subjectDTO);
    }

    @PutMapping("/update")
    public void updateSubject(@RequestBody SubjectDTO subjectDTO){

        service.updateSubject(subjectDTO);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteById(Integer integer) {
        Integer id = 0;
        service.deleteSubject(id);
    }

    @GetMapping("/get-all")
    public List<SubjectDTO> getAll() {

        return service.getAll();
    }



}
