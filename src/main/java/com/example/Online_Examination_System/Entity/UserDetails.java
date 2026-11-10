package com.example.Online_Examination_System.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity
public class UserDetails {

    private String name;
    private String email;
    @Id
    private String rollno;
    private String password;

}
