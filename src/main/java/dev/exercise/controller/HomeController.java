package dev.exercise.controller;

import dev.exercise.views.HomeView;

public class HomeController {

    public HomeController(){
        index();
    }

    public void index() {
        HomeView.index();
    }
}
