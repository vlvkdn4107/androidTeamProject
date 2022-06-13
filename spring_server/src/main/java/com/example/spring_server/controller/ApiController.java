package com.example.spring_server.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_server.dto.Album;
import com.example.spring_server.dto.Music;

@RequestMapping("/melontube")
@RestController
public class ApiController {

	private static List<Music> sampleMusic = Music.sampledata();

	@GetMapping("/musiclist")
	public List<Music> musicList() {
		return sampleMusic;
	}

	// 마지막 곡이면 다음 곡 첫 곡으로
	@GetMapping("/skipmusic/next")
	public Music skipNextMusic(@RequestParam int id) {
		Music music = new Music();
		if (id == sampleMusic.size()) {
			music = sampleMusic.get(0);
		} else {
			music = sampleMusic.get(id);
		}
		return music;
	}

	// 첫 곡이면 이전 곡 마지막 곡으로
	@GetMapping("/skipmusic/previous")
	public Music skipPreviousMusic(@RequestParam int id) {
		Music music = new Music();
		if (id == 1) {
			music = sampleMusic.get(sampleMusic.size() - 1);
		} else {
			music = sampleMusic.get(id - 2);
		}
		return music;
	}

	// 앨범 상세정보 출력 (수록곡)
	@GetMapping(path = "/albumlist/{albumTitle}")
	public Album albumInfo(@PathVariable String albumTitle) {
		List<Music> albumList = new ArrayList<Music>();
		Album album = new Album();

		for (int i = 0; i < sampleMusic.size(); i++) {
			if (sampleMusic.get(i).getAlbumTitle().equals(albumTitle)) {
				albumList.add(sampleMusic.get(i));
				album.setAlbumImageUrl(sampleMusic.get(i).getImageUrl());
				album.setAlbumTitle(sampleMusic.get(i).getAlbumTitle());
				album.setAlbumSinger(sampleMusic.get(i).getSinger());
			}
		}
		album.setTrackList(albumList);
		return album;

	}

	@GetMapping("/albumlist")
	public List<Album> albumMusicList() {
		List<Album> albumList = new ArrayList<Album>();
		List<Music> musicList = new ArrayList<Music>();

		for (int i = 0; i < sampleMusic.size(); i++) {
			Music music = new Music();
			String albumTitle = sampleMusic.get(i).getAlbumTitle();
			String singer = sampleMusic.get(i).getSinger();
			String imageUrl = sampleMusic.get(i).getImageUrl();

			music.setAlbumTitle(albumTitle);
			music.setSinger(singer);
			music.setImageUrl(imageUrl);
			musicList.add(music);
		}

		Set<Music> musicSet = new HashSet<>(musicList);
		Iterator<Music> iter = musicSet.iterator();

		while (iter.hasNext()) {
			Album album = new Album();
			Music music = iter.next();

			album.setAlbumTitle(music.getAlbumTitle());
			album.setAlbumImageUrl(music.getImageUrl());
			album.setAlbumSinger(music.getSinger());
			albumList.add(album);
		}

		return albumList;
	}

	@PostMapping("/addmylist")
	public Music addMyList(@RequestBody Music myMusic) {
		Music music = new Music();
		music.setTitle(myMusic.getTitle());
		music.setSinger(myMusic.getSinger());
		music.setAudioUrl(myMusic.getAudioUrl());
		music.setImageUrl(myMusic.getImageUrl());
		music.setLyrics(myMusic.getLyrics());
		return music;
	}

	@GetMapping("/play")
	public Music playMusic(@RequestParam String musicTitle) {
		Music music = new Music();
		for (int i = 0; i < sampleMusic.size(); i++) {
			if (sampleMusic.get(i).getTitle().equals(musicTitle)) {
				music = sampleMusic.get(i);
			}
		}
		return music;
	}

	@GetMapping("/searchlist")
	public List<Music> searchlist(@RequestParam Map<String, String> map) {
		HashSet<Music> tempMusics = new HashSet<Music>();
		// key 값이 제목일떄와 가수일떄 구분해주어야한다.

		map.entrySet().forEach(entry -> {
			if (entry.getKey().equals("title")) {
				for (Music music : sampleMusic) {
					if (music.getTitle().contains(entry.getValue().replace(" ",""))) {
						tempMusics.add(music);
					}
				}
			} else if (entry.getKey().equals("singer")) {
				for (Music music : sampleMusic) {
					if (music.getSinger().contains(entry.getValue().replace(" ",""))) {
						tempMusics.add(music);
					}
				}
			}
		});
		List<Music> muscis = new ArrayList<Music>();
		muscis.addAll(tempMusics);
		
		return muscis;

	}

}
