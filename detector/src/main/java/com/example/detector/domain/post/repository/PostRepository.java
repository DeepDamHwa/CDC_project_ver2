package com.example.detector.domain.post.repository;


import com.example.detector.domain.post.model.Post;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PostRepository extends JpaRepository<Post,Long> {
    @Query(value = "SELECT * FROM post WHERE \"ROWID\" = :rowid", nativeQuery = true)
    Optional<Post> findByRowId(@Param("rowid") String rowid);
}
