package com.example.song.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.song.model.Song;
import com.example.song.service.SongJpaService;

@RestController
public class SongController {
   @Autowired
   public SongJpaService apiService;

   @GetMapping("/songs")
   public ArrayList<Song> getAllSongs() {
      return apiService.getAllSongs();
   }

   @PostMapping("/songs")
   public Song addSong(@RequestBody Song song) {
      return apiService.addSong(song);
   }

   @GetMapping("songs/{songId}")
   public Song getSongById(@PathVariable("songId") int songId) {
      return apiService.getSongById(songId);
   }

   @PutMapping("songs/{songId}")
   public Song updateSong(@PathVariable("songId") int songId, @RequestBody Song song) {
      return apiService.updateSong(songId, song);
   }

   @DeleteMapping("songs/{songId}")
   public void deleteSong(@PathVariable("songId") int songId) {
      apiService.deleteSong(songId);
   }

}