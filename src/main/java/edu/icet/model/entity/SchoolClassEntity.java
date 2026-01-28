package edu.icet.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SchoolClassEntity {
    private Integer classId;

    private Integer subjectId;

    private Integer studentId;

    private String classCode;

    private String className;

}
