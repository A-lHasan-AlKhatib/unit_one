package day_two.Model;

import day_two.Model.enums.MediaType;

public class Movie extends Media {

    private boolean isWatched;
    private double watchTime;

    private Movie() {
        super();
        super.setType(MediaType.Movie);
        isWatched = false;
        watchTime = 0;
    }

    public boolean isWatched() {
        return isWatched;
    }

    public void setWatched(boolean watched) {
        isWatched = watched;
    }

    public double getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(double watchTime) {
        this.watchTime = watchTime;
    }

    public static class MovieBuilder extends MediaBuilder<MovieBuilder,Movie> {

        public MovieBuilder() {
            super();
            tInstance = this;
            instance = new Movie();

        }

        @Override
        public Movie build() {
            return instance;
        }

        public MovieBuilder setWatched(boolean isWatched) {
            instance.setWatched(isWatched);
            return this;
        }


        public MovieBuilder setWatchTime(double watchTime) {
            instance.setWatchTime(watchTime);
            return this;
        }


    }

    @Override
    public String toString() {
        return "\n***\nMovie : \n" + super.toString() +
                "\nisWatched : " + isWatched +
                "\nwatchTime : " + watchTime;
    }
}
