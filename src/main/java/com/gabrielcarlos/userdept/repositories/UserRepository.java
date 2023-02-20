package com.gabrielcarlos.userdept.repositories;

import com.gabrielcarlos.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
