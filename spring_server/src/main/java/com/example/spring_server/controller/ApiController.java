package com.example.spring_server.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

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
	
	public static ArrayList<Music> sampleMusic = (ArrayList<Music>)Music.sampledata();

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
		music.setId(myMusic.getId());
		music.setTitle(myMusic.getTitle());
		music.setSinger(myMusic.getSinger());
		music.setImageUrl(myMusic.getImageUrl());
		music.setLyrics(myMusic.getLyrics());
		return music;
	}
	
	@GetMapping("/searchlist")
	public Data searchlist(@RequestParam Map<String ,String> map) {
		Data data = new Data();
		HashSet<Music> tempmusics = new HashSet<Music>();
		// key 값이 제목일떄와 가수일떄 구분해주어야한다.
		
		map.entrySet().forEach( entry -> {
			if(entry.getKey().equals("title")) {
				for (Music music : sampleMusic) {
					if(music.getTitle().contains(entry.getValue())) {
						tempmusics.add(music);
					}
				}
			} else if (entry.getKey().equals("singer")) {
				for (Music music : sampleMusic) {
					if(music.getSinger().contains(entry.getValue())) {
						tempmusics.add(music);
					}
				}
			}
		});
		ArrayList<Music> muscis = new ArrayList<Music>();
		muscis.addAll(tempmusics);
			
		data.setMusicList(muscis);
		return data;
		
	} 

}
