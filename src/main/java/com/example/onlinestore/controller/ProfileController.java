package com.example.onlinestore.controller;

import com.example.onlinestore.dto.ProfileDto;
import com.example.onlinestore.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/{id}")
    public ProfileDto getOneById(@PathVariable Long id) {
        return profileService.getProfileById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateById(@RequestBody ProfileDto profileDto) {
        profileService.saveProfile(profileDto);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PostMapping("/registration")
    public ResponseEntity register(@RequestBody ProfileDto profileDto) {
        profileService.saveProfile(profileDto);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
