package com.example.spring_server.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Album {
	
	private String albumTitle;
	private String albumSinger;
	private String albumImageUrl;
	private List<Music> trackList;

}
