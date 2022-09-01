package sasa.springframework.chucknorrisjokes.services;

import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    @Override
    public String getJoke() {
        return "Chuck Norris counted to infinity... twice!";
    }
}
