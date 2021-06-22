package day_two.Model.filter;

import day_two.Model.Media;

import java.util.ArrayList;

public class DateFilter implements MediaFilter {
    private String date;

    public DateFilter(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public ArrayList<Media> filter(ArrayList<Media> videos) {
        ArrayList<Media> temp = new ArrayList<>();
        for (Media m : videos)
            if (m.getReleaseDate().equalsIgnoreCase(date))
                temp.add(m);
        return temp;
    }
}
