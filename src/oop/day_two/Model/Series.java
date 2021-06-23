package oop.day_two.Model;

import oop.day_two.Model.enums.MediaType;

public class Series extends Media {
    private Series() {
        super();
        super.setType(MediaType.Series);
        seasons = 0;
    }

    private int seasons;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    @Override
    public String toString() {
        return "\n***\nSeries : \n" + super.toString() +
                "\nseasons : " + seasons;
    }

    public static class SeriesBuilder extends MediaBuilder<SeriesBuilder, Series> {

        public SeriesBuilder() {
            super();
            tInstance = this;
            instance = new Series();
        }

        public SeriesBuilder setSeasons(int seasons) {
            instance.setSeasons(seasons);
            return this;
        }

        public Series build() {
            return instance;
        }
    }
}