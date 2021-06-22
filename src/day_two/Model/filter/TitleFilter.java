package day_two.Model.filter;

import day_two.Model.Media;

import java.util.ArrayList;

public class TitleFilter implements MediaFilter {

    private String title;

    public TitleFilter(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public ArrayList<Media> filter(ArrayList<Media> videos) {
        ArrayList<Media> temp = new ArrayList<>();
        for (Media m : videos)
            if (m.getTitle().contains(title))
                temp.add(m);
        return temp;
    }
}
