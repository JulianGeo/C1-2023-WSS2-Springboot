package co.com.chartsofka.music.controller;

import co.com.chartsofka.music.dto.ArtistDTO;
import co.com.chartsofka.music.dto.SongDTO;
import co.com.chartsofka.music.service.impl.ArtistServiceImpl;
import co.com.chartsofka.music.service.impl.SongServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chart")
public class SongController {
    @Autowired
    SongServiceImpl service;

    @GetMapping("/song")
    private List<SongDTO> getSongs(){
        return service.getSongs();
    }

}
