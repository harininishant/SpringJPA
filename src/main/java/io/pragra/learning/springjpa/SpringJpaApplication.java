package io.pragra.learning.springjpa;

import io.pragra.learning.springjpa.domain.entity.Appointment;
import io.pragra.learning.springjpa.repo.ApptRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class SpringJpaApplication {
//    AppointmentRepo repo;
//
//    public SpringJpaApplication(AppointmentRepo repo) {
//        this.repo = repo;
//    }

    private ApptRepo repo;//injecting the interface that implements JPA

    public SpringJpaApplication(ApptRepo repo) {
        this.repo = repo;
    }

    public static void main(String[] args) {
  SpringApplication.run(SpringJpaApplication.class, args);

    }

    @Bean
    CommandLineRunner runner() {
        return args ->{
            Appointment appointment= Appointment.builder().firstName("harini").lastName("nishant").appointmentDate(new Date())
            .createDate(new Date()).updateDate(new Date()).doctorName("myatt").build();
             repo.save(appointment);
        };
    }

    /*POJO layer - domain
    DAO layer /repo- data access object layer helps with connection to database also known as REPO
    service - business logic defined here
    Controller- exposing APi's


     */

}
