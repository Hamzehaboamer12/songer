package com.example.songr.Repository;

import com.example.songr.classes.Albums;
import org.springframework.data.jpa.repository.JpaRepository;

public interface REPO extends JpaRepository<Albums,Long> {
}
