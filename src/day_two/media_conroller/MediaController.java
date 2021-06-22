package day_two.media_conroller;

import day_two.Model.Media;
import day_two.Model.Movie;
import day_two.Model.enums.MediaType;

import java.io.*;
import java.util.ArrayList;

public class MediaController {
    private final ArrayList<Media> mediaList;
    private final File dataFile;
    private static MediaController instance;

    private MediaController() {
        mediaList = new ArrayList<>();
        dataFile = new File("C:\\Users\\playh\\IdeaProjects\\unit_one\\src\\day_two\\media_conroller\\mediaData");
        readData();
    }

    public ArrayList<Media> getMediaList() {
        return mediaList;
    }

    public static MediaController getInstance() {
        if (instance == null)
            instance = new MediaController();
        return instance;
    }


    private void readData() {
        try {
            File[] files = dataFile.listFiles();
            if (files != null) {
                for (File media : files) {
                    FileInputStream fis = new FileInputStream(media);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    mediaList.add((Media) ois.readObject());
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Media getMedia(int mediaId) {
        for (Media m : mediaList)
            if (m.getId() == mediaId)
                return m;
        return null;
    }

    public void writeMedia(Media media) {

        if (!dataFile.exists()) {
            try {
                dataFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File file = new File(dataFile, media.getId() + ".dat");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(media);
            oos.close();
            fos.close();
            mediaList.add(media);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listMedia() {
        for (Media m : mediaList) {
            System.out.println("**************************");
            System.out.println(m);
            System.out.println("**************************");
        }
    }

    public void addToFavorites(int mediaId) {
        mediaList.get(mediaId).setFavorite(true);
    }

    public void watchMedia(int mediaId) {
        Media m = mediaList.get(mediaId);
        if (m.getType().equals(MediaType.Movie))
            ((Movie) m).setWatched(true);
    }

}
