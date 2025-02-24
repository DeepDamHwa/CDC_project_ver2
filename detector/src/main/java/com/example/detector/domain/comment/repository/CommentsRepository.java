package com.example.detector.domain.comment.repository;

import com.example.detector.domain.comment.model.Comments;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CommentsRepository extends JpaRepository<Comments, Long> {
    @Query(value = "SELECT * FROM comments WHERE \"ROWID\" = :rowid", nativeQuery = true)
    Optional<Comments> findByRowId(@Param("rowid") String rowid);
}
