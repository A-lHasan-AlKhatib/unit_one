package day_two;


import day_two.Model.Media;
import day_two.Model.Member;
import day_two.Model.Movie;
import day_two.Model.enums.Category;
import day_two.Model.enums.Role;
import day_two.media_conroller.MediaController;

public class Try {

    public static void main(String[] args) {
//        Media m = new Movie.MovieBuilder().build();
//        MediaController c = MediaController.getInstance();
//        c.writeMedia(m);
        Movie mo = new Movie.MovieBuilder().setWatched(true).addStaff(new Member("Hasan","male","pal","no",new Role[]{Role.Director}))
                .addCategories(new Category[]{Category.Adventure}).build();
        System.out.println(mo);
    }

    //TODO: write dummy media data
}
