package com.generation.blogpessoal.repository;

import com.generation.blogpessoal.model.Postagens;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostagemRepository extends JpaRepository<Postagens, Long> {

}
