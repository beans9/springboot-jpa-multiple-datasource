package com.example.repo.alpha;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.User;

public interface UserRepoAlpha extends JpaRepository<User, Integer>{
	
}
