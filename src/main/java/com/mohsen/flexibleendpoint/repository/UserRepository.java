package com.mohsen.flexibleendpoint.repository;

import com.mohsen.flexibleendpoint.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

