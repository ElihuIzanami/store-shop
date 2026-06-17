package com.eime.storeshope.repository;

import com.eime.storeshope.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
