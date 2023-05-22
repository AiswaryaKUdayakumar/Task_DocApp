package com.UST.DocterService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Doctor_table")
public class Doctor {
    @Id
    @GeneratedValue
    private Integer doctor_Id;
    private String doctor_Name;
    private String doctor_Spec;
}
