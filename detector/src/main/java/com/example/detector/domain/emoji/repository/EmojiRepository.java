package com.example.detector.domain.emoji.repository;


import com.example.detector.domain.emoji.model.Emoji;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmojiRepository extends JpaRepository<Emoji, Long> {
    @Query(value = "SELECT * FROM emoji WHERE \"ROWID\" = :rowid", nativeQuery = true)
    Optional<Emoji> findByRowId(@Param("rowid") String rowid);
}
