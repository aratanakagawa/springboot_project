package com.example.Actor.repository;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Item implements Entity<Item> {

    @Id
    @Column(name = "entityId")
    private String entityId;
    @Column(name = "entityStateClassification")
    private String entityStateClassification;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "tag")
    private String tag;

    private String getEntityId(){return this.entityId;}
    private void setEntityId(String entityId){this.entityId = entityId;}

    private String getEntityStateClassification(){return this.entityStateClassification; }
    private void setEntityStateClassification(String entityStateClassification){this.entityStateClassification = entityStateClassification;}

    private String getCode(){return this.code;}
    private void setCode(String code){}

    private String getName(){return this.name;}
    private void setName(String name){this.name = name;}

    private String getTag(){return this.tag;}
    private void setTag(String tag){this.tag = tag;}

    @Override
    public Item clone(){
        return new Item();
    }




}
