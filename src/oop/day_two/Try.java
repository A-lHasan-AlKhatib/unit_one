package oop.day_two;


import oop.day_two.Model.Media;
import oop.day_two.Model.Movie;
import oop.day_two.media_conroller.MediaController;

public class Try {

    public static void main(String[] args) {
        // create and save movie
        Media m = new Movie.MovieBuilder().build();
        MediaController c = MediaController.getInstance();
        c.writeMedia(m);

        }

}