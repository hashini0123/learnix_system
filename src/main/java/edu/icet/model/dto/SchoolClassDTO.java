package edu.icet.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SchoolClassDTO {

    private Integer classId;

    private Integer subjectId;

    private Integer studentId;

    private String classCode;

    private String className;

}
