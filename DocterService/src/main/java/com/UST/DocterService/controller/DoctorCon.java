package com.UST.DocterService.controller;

import com.UST.DocterService.model.Doctor;
import com.UST.DocterService.repository.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorCon {
    @Autowired
    DoctorRepo repo;
    @PostMapping("/reg")
    public Doctor addDoctor(@RequestBody Doctor doc)
    {
        return repo.save(doc);
    }
    @GetMapping("/all")
    public List<Doctor> getAllDoctor()
    {
        return repo.findAll();
    }
    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Integer id)
    {
        return repo.findById(id).orElse(null);
    }
    @PutMapping("/{id}")
    public Doctor updateDoctor(@PathVariable Integer id,@RequestBody Doctor doctor)
    {
        Doctor doc  = repo.findById(id).orElse(null);
        if(doc!=null)
        {
            Doctor d = new Doctor(id, doctor.getDoctor_Name(), doctor.getDoctor_Spec());
            return repo.save(d);
        }
        return null;
    }
}
