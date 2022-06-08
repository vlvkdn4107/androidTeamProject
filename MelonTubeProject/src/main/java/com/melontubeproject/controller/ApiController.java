package com.melontubeproject.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.melontubeproject.dto.Music;

@RestController
@RequestMapping("/melontube")
public class ApiController {
		
	@GetMapping("/musiclist")
	public List<Music> musicList() {
		return Music.sampleMusic();
	}
}
