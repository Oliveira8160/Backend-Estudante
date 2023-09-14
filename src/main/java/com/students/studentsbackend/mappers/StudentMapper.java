package com.students.studentsbackend.mappers;

import com.students.studentsbackend.dtos.StudentRequest;
import com.students.studentsbackend.dtos.StudentResponse;
import com.students.studentsbackend.entities.Student;

public class StudentMapper {
    
    public static Student toEntity(StudentRequest request) {
        Student student = new Student();
        student.setNome(request.nome());
        student.setCPF(request.CPF());
        student.setSemestre(request.semestre());
        student.setTurma(request.turma());
        return student;
    }

    public static StudentResponse toDTO(Student student) {
        return new StudentResponse(student.getId(),
                student.getNome(),
                student.getCPF(),
                student.getSemestre(),
                student.getTurma());
    }
}
