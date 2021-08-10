package io.pragra.learning.springjpa.domain.entity;

import io.pragra.learning.springjpa.domain.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;
@Entity // marked as an entity it is to be managed by JPA/hybernate
@Table(name = "TABLE_APPT")// table name mentioned in this anotation if table name dif from classname
@Data // getter /setter
@NoArgsConstructor//JPA needs this
@Builder
@AllArgsConstructor
public class Appointment {
    @Id // this anotation is used for primary key when compared to
    // prev databasewhere we manually key the ID as primary
    // example(student.setId(((int) Math.floor(Math.random() * 1000000)));) from prev class Student
    @GeneratedValue(strategy = GenerationType.AUTO)//system will assign the value automatically
    private  Integer id;
    @Column(name = "FIRST_NAME", length = 50,nullable = false)// db will always ask for firstname cannot be null
    private String firstName;
    @Column(name = "LAST_NAME")
    private  String lastName;
    private  String phoneNumber;
    private Date appointmentDate;
    private StatusEnum status;
    @Builder.Default // if you pass this value builder ill add this for u otherwise we need to add this.
    private Date createDate = new Date();
    @Builder.Default
    private Date updateDate = new Date();
    private String doctorName;

}
