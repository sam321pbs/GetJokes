package com.example.SamMengistu.myapplication.backend;

/**
 * Created by SamMengistu on 3/8/16.
 */
public class Joke {
    private String mJoke;
    private int mId;

    public Joke (int id, String joke){
        mJoke = joke;
        mId = id;
    }

    public String getJoke() {
        return mJoke;
    }

    public void setJoke(String joke) {
        mJoke = joke;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }
}
