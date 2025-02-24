package com.example.detector.domain.role.repository;

import com.example.detector.domain.role.model.Role;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoleRepository extends JpaRepository<Role,Long> {
    @Query(value = "SELECT * FROM role WHERE \"ROWID\" = :rowid", nativeQuery = true)
    Optional<Role> findByRowId(@Param("rowid") String rowid);
}
