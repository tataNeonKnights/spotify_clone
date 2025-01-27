package com.example.MusicAppTeam.Service;

import com.example.MusicAppTeam.Model.SongModel;
import com.example.MusicAppTeam.Repository.SongsRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongsService {

    private SongsRepository songsRepository;


    public SongsService(SongsRepository songsRepository) {
        super();
        this.songsRepository = songsRepository;
    }

    public SongModel saveSong(SongModel songModel)
    {
        return songsRepository.save(songModel);
    }

    public SongModel updateSong(SongModel songModel)
    {
        return songsRepository.save(songModel);
    }

    public List<SongModel> getAllSongs()
    {
        return songsRepository.findAll();
    }

    public SongModel getSongById(long id){
        return songsRepository.findById(id).orElseThrow(()-> new Error("error not found"));

    }

    public SongModel getSongBysongId(String songId){
        return songsRepository.findBysongId(songId);
    }

    public String deleteSong(SongModel songModel){
        songsRepository.delete(songModel);
        return "success";
    }




}
