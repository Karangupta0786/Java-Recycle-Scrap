package com.ak.Scrapist.AK.jdbc;

import com.ak.Scrapist.AK.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
