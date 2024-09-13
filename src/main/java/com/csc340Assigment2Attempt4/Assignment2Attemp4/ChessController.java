package com.csc340Assigment2Attempt4.Assignment2Attemp4;

import com.csc340Assigment2Attempt4.Assignment2Attemp4.ChessProfile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

@RestController
public class ChessController {

    // Controller to create the object projile and then return it from the url

    @GetMapping("/player/{username}")
    public ChessProfile getChessProfile(@PathVariable String username) {
        String url = "https://api.chess.com/pub/player/" + username;
        RestTemplate restTemplate = new RestTemplate();
        ChessProfile chessProfile = restTemplate.getForObject(url, ChessProfile.class);
        return chessProfile;
    }

}
