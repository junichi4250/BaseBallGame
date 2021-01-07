package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Player;
import com.example.repository.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	public List<Player> findAll() {
		return playerRepository.findAll();
	}

	public Player findOne(Long id) {
		return playerRepository.getOne(id);
	}

	public Player save(Player player) {
		return playerRepository.save(player);
	}

	public void delete(Long id) {
		playerRepository.deleteById(id);
	}

}
