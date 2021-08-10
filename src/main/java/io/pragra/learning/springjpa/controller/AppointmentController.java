package io.pragra.learning.springjpa.controller;

import io.pragra.learning.springjpa.domain.entity.Appointment;
import io.pragra.learning.springjpa.repo.ApptRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppointmentController {
    private ApptRepo repo;//injecting the interface that implements JPA


    public AppointmentController(ApptRepo repo) {
        this.repo = repo;
    }
    @GetMapping("/appointment")
    public List<Appointment> getAllAppointment(){
        return repo.findAll();
    }


    @PostMapping("/appointment")// updating single appointment
    public  Appointment createAppointment(@RequestBody Appointment appointment){
        return this.repo.save(appointment);// save methos will save in database
    }
    @PutMapping("/appointment/update") //localhost:8080/student is the api to call the created table api.
    public Appointment update(@RequestBody Appointment appointment) {
        return repo.save(appointment);
    }
}
