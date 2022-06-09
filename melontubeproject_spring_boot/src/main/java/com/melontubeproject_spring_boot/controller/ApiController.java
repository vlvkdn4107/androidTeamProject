package com.melontubeproject_spring_boot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.melontubeproject_spring_boot.dto.MusicSampleList;

@RequestMapping("/melontube")
@RestController
public class ApiController {

	@GetMapping("/musiclist")
	public List<MusicSampleList> musiclist(){
		return MusicSampleList.sampleMusic();
	}
	
}