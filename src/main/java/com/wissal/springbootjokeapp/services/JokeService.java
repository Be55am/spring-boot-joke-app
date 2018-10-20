package com.wissal.springbootjokeapp.services;

import guru.springframework.norris.chuck.*;
import org.springframework.stereotype.Service;

@Service
public class JokeService {
private ChuckNorrisQuotes chuckNorrisQuotes;



    public JokeService(ChuckNorrisQuotes chuckNorrisQuotes){
        this.chuckNorrisQuotes=chuckNorrisQuotes;
    }

    public String getRandomQuote(){
        return chuckNorrisQuotes.getRandomQuote();
    }



}
