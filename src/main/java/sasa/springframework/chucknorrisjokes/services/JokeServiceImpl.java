package sasa.springframework.chucknorrisjokes.services;

import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class JokeServiceImpl implements JokeService {
    private final String[] jokes = {"Chuck Norris counted to infinity... twice!",
                                    "Did you know aliens exist? They just afraid to invade earth until Chuck Norris lives.",
                                    "Chuck Norris had 3 enemies... may they rest in peace."};

    @Override
    public String getJoke() {
        return jokes[ThreadLocalRandom.current().nextInt(0, 3)];
    }
}
