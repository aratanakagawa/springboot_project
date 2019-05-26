package com.example.Actor.service;

import com.example.Actor.repository.Actor;
import com.example.Actor.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ActorService {
    @Autowired
    ActorRepository actorRepository;

    public List<Actor> findAll(){
        return actorRepository.findAll();
    }

    public Actor save(Actor actor){
        return actorRepository.save(actor);
    }
}

