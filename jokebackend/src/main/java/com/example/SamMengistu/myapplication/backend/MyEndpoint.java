/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.SamMengistu.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
  name = "myApi",
  version = "v1",
  namespace = @ApiNamespace(
    ownerDomain = "backend.myapplication.SamMengistu.example.com",
    ownerName = "backend.myapplication.SamMengistu.example.com",
    packagePath=""
  )
)
public class MyEndpoint {

    public static List<Joke> mJokes = new ArrayList<>();

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        response.setData("Hi, " + name);

        return response;
    }

//    @ApiMethod(name = "saySup")
//    public MyBean saySup(@Named("name") String name) {
//        MyBean response = new MyBean();
//        response.setData("Sup, " + name);
//
//        return response;
//    }
//
//    @ApiMethod(name = "addJoke")
//    public Joke addJoke(@Named("id") int id, @Named("joke") String joke) throws NotFoundException{
//
//        //Check for already exists
//        if (mJokes.contains(new Joke(id, joke))) {
//            throw new NotFoundException("Joke Record already exists");
//        }
//
//        Joke q = new Joke(id, joke);
//        mJokes.add(q);
//        return q;
//    }
//
////    @ApiMethod(name = "getJoke")
////    public Joke getJoke(@Named("id") int id, @Named("joke") String joke) throws NotFoundException{
////
////        int index = mJokes.indexOf(new Joke(id, joke));
////        if (index == -1) {
////            throw new NotFoundException("Joke Record already exists");
////        }
////        return mJokes.get(index);
////    }l
//
//    @ApiMethod(name = "getRandomJoke")
//    public Joke getRandomJoke(){
//
//        return mJokes.get(new Random().nextInt(mJokes.size()));
//    }
//
//    @ApiMethod(name = "removeJoke")
//    public void removeJoke(@Named("id") int id, @Named("joke") String joke) throws NotFoundException{
//
//        int index = mJokes.indexOf(new Joke(id, joke));
//
//        if (index == -1){
//            throw new NotFoundException("Joke Record already exists");
//        }
//
//        mJokes.remove(index);
//    }
}
