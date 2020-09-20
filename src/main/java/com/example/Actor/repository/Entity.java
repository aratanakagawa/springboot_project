package com.example.Actor.repository;

public interface Entity<T extends Entity<T> extends Cloneable {

    /**
     * クローンを生成する。
     *
     * @return クローン
     */
    T clone();


}
