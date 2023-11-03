package com.marcelo.nisum.challenge.repository;

import com.marcelo.nisum.challenge.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, String> {
}
