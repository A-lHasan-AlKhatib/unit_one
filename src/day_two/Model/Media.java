package day_two.Model;


import day_two.Model.enums.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;


public abstract class Media implements Serializable {

    private static int idCounter = 0;

    public static void setIdCounter(int idCounter) {
        Media.idCounter = idCounter;
    }

    private final int id;
    private String title, releaseDate, language, poster;
    private double duration, rating, IMDBRating;
    private final ArrayList<Category> categories;
    private final ArrayList<Member> staff;
    private MediaType type;
    private boolean isFavorite;

    protected Media() {
        id = idCounter++;
        title = "No Title";
        releaseDate = "No Date";
        language = "No Language";
        poster = "No Poster";
        duration = 0;
        rating = 0;
        IMDBRating = 0;
        categories = new ArrayList<>();
        categories.add(Category.NONE);
        staff = new ArrayList<>();
        type = MediaType.NONE;
        isFavorite = false;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getIMDBRating() {
        return IMDBRating;
    }

    public void setIMDBRating(double IMDBRating) {
        this.IMDBRating = IMDBRating;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void addCategories(Category... categories) {
        this.categories.remove(Category.NONE);
        this.categories.addAll(Arrays.asList(categories));
    }

    public ArrayList<Member> getStaff() {
        return staff;
    }

    public void addStaff(Member... members) {
        this.staff.addAll(Arrays.asList(members));
    }

    public MediaType getType() {
        return type;
    }

    protected void setType(MediaType type) {
        this.type = type;
    }


    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    @Override
    public String toString() {
        return
                "id : " + id +
                        "\ntitle : " + title +
                        "\nreleaseDate : " + releaseDate +
                        "\nlanguage : " + language +
                        "\nposter : " + poster +
                        "\nduration : " + duration +
                        "\nrating : " + rating +
                        "\nIMDBRating : " + IMDBRating +
                        "\ncategories : " + Arrays.toString(categories.toArray()) +
                        "\nstaff : " + Arrays.toString(staff.toArray()) +
                        "\ntype : " + type +
                        "\nisFavorite : " + isFavorite;
    }


    public abstract static class MediaBuilder<T extends MediaBuilder, M extends Media> {

        protected T tInstance;
        protected M instance;

        //Must initialize the instances in the sub constructor.

        public T setTitle(String title) {
            instance.setTitle(title);
            return tInstance;
        }

        public T setReleaseDate(String releaseDate) {
            instance.setReleaseDate(releaseDate);
            return tInstance;
        }


        public T setLanguage(String language) {
            instance.setLanguage(language);
            return tInstance;
        }

        public T setPoster(String poster) {
            instance.setPoster(poster);
            return tInstance;
        }


        public T setDuration(double duration) {
            instance.setDuration(duration);
            return tInstance;
        }


        public T setRating(double rating) {
            instance.setRating(rating);
            return tInstance;
        }


        public T setIMDBRating(double IMDBRating) {
            instance.setIMDBRating(IMDBRating);
            return tInstance;
        }


        public T addCategories(Category... categories) {
            instance.addCategories(categories);
            return tInstance;
        }


        public T addStaff(Member... members) {
            instance.addStaff(members);
            return tInstance;
        }


        public T setType(MediaType type) {
            instance.setType(type);
            return tInstance;
        }


        public T isFavourite(boolean isFavourite) {
            instance.setFavorite(isFavourite);
            return tInstance;
        }


        public abstract M build();
    }
}