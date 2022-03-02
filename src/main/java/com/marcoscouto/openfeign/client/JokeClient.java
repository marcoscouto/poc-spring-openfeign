package com.marcoscouto.openfeign.client;

import com.marcoscouto.openfeign.data.Joke;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "jokeClient", url = "https://api.chucknorris.io/jokes")
public interface JokeClient {

    @GetMapping("/random")
    Joke getJoke();

}
