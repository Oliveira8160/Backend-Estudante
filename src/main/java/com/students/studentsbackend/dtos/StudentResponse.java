package com.students.studentsbackend.dtos;

public record StudentResponse(
    long id,
    String nome,
    String CPF,
    String semestre,
    String turma
)
{    
}
