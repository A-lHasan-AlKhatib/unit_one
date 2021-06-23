package oop.day_two.Model.filter;

import oop.day_two.Model.Media;

import java.util.ArrayList;

public interface MediaFilter {
    public ArrayList<Media> filter(ArrayList<Media> videos);
}
