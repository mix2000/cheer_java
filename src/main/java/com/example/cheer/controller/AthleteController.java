package com.example.cheer.controller;
/*
import com.example.cheer.entity.AthleteEntity;
import com.example.cheer.repository.AthleteRepository;
import org.springframework.beans.factory.annotation.Autowired;*/
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/athlete")
public class AthleteController {

/*    @Autowired
    private AthleteRepository athleteRepository;

    @PostMapping
    public ResponseEntity save(@RequestBody AthleteEntity athlete) {
        try {
            athleteRepository.save(athlete);
            return ResponseEntity.ok("all fine");
        } catch (Exception error) {
            return ResponseEntity.badRequest().body("Проиозошла ошибка.");
        }
    }*/

    @GetMapping
    public ResponseEntity getAthletes() {
        try {
            return ResponseEntity.ok("all fine");
        } catch (Exception error) {
            return ResponseEntity.badRequest().body("Проиозошла ошибка.");
        }
    }

}
