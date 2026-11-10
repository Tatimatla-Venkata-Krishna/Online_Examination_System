package com.example.Online_Examination_System.Repository;

import com.example.Online_Examination_System.Entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDetails,String> {
}
