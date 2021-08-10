package io.pragra.learning.springjpa.repo;

import io.pragra.learning.springjpa.domain.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository// instead of class AppointmentRepo we use interface
// as it can extend the JpaRepositoryand hence Spring does everything for us. it is also a generic
public interface ApptRepo extends JpaRepository<Appointment,Integer> {
    // <Appointment,Integer> this is written to say entity class is appointment and
    // integer is for main var ID.




}
