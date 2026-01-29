package edu.icet.controller;


import edu.icet.model.dto.SchoolClassDTO;
import edu.icet.service.SchoolClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchoolClassController {

    @Autowired
    SchoolClassService service;

    @PostMapping("/add-school-class")
    public void addSchoolClass(@RequestBody SchoolClassDTO schoolClassDTO){
        service.addSchoolClass(schoolClassDTO);
    }

    @PutMapping("/update-school-class")
    public void updateSchoolClass(@RequestBody SchoolClassDTO schoolClassDTO){
        service.updateSchoolClass(schoolClassDTO);
    }

    @DeleteMapping("/delete-school-class-by-id/{id}")
    public void deleteById(Integer integer){
        Integer id = 0;
        service.deleteSchoolClass(id);
    }

    @GetMapping("/get-all-school-classes")
    public List<SchoolClassDTO> getAll(){
        return service.getAll();
    }


}
