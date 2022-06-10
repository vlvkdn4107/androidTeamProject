package com.example.spring_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/skipmusic/next")
	public Music skipNextMusic(@RequestParam int id) {
		Music music = Music.sampledata().get(id);		
		return music;
	}
	
	@GetMapping("/skipmusic/previous")
	public Music skipPreviousMusic(@RequestParam int id) {
		Music music = Music.sampledata().get(id-2);		
		return music;
	}
	
	@PostMapping("/addmylist")
	public Music addMyList(@RequestBody Music myMusic) {
		Music music = new Music();
		music.setTitle(myMusic.getTitle());
		music.setSinger(myMusic.getSinger());
		music.setImageUrl(myMusic.getImageUrl());
		music.setLyrics(myMusic.getLyrics());
		return music;
	}

}
