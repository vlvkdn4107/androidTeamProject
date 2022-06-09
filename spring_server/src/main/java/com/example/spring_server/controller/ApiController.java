<<<<<<< HEAD
package com.example.spring_server.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_server.dto.Music;

@RequestMapping("/melontube")
@RestController
public class ApiController {

	@GetMapping("/musiclist")
	public List<Music> musiclist() {
		return Music.sampledata();
	}

}
=======
package com.example.spring_server.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_server.dto.Music;

@RequestMapping("/melontube")
@RestController
public class ApiController {

	@GetMapping("/musiclist")
	public List<Music> musiclist() {
		return Music.sampledata();
	}

}
>>>>>>> feature_jh
