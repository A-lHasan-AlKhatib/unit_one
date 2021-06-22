package day_two.media_conroller;

import day_two.Model.Media;
import day_two.Model.Movie;
import day_two.Model.Series;
import day_two.Model.enums.Category;

public class MediaControllerEditor {
    static {
        MediaController mediaController = MediaController.getInstance();
        //set the media static counter with the last id +1
        Media.setIdCounter((mediaController.getMediaList().get(mediaController.getMediaList().size() - 1).getId()) + 1);
    }

    MediaController mediaController;

    public MediaControllerEditor() {


    }

    public static void main(String[] args) {
        MediaController m = MediaController.getInstance();
        m.writeMedia(new Movie.MovieBuilder().addCategories(new Category[]{Category.Action,Category.Adventure}).build());
        for (Media mm : m.getMediaList())
            System.out.println(mm);


    }
}
