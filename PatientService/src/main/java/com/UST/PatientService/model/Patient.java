package com.UST.PatientService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "patient_table")
public class Patient {

    @Id
    @GeneratedValue
    private Integer patient_Id;
    private String patient_Name;

}
