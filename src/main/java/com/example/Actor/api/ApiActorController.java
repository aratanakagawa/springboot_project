package com.example.Actor.api;

import com.example.Actor.repository.Actor;
import com.example.Actor.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/actor")
public class ApiActorController {
    @Autowired
    ActorService actorService;


    @RequestMapping(method = RequestMethod.GET)
    public List<Actor> getActors(){
        return actorService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Actor createActor(@Validated @RequestBody Actor actor){
        return actorService.save(actor);
    }

}
