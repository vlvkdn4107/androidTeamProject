package com.example.spring_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_server.dto.Data;
import com.example.spring_server.dto.Music;

@RequestMapping("/melontube")
@RestController
public class ApiController {

	@GetMapping("/musiclist")
	public Data musicList() {
		Data data = new Data();
		data.setMusicList(Music.sampledata());
		return data;
	}

}
