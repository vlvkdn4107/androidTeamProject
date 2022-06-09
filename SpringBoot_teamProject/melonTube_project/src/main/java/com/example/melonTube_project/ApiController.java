package com.example.melonTube_project;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/melontube")
@RestController
public class ApiController {

	@GetMapping("/musiclist")
		public List<MusictSampleData> musiclist(){
			return MusictSampleData.sampledata();
		}
	
}
