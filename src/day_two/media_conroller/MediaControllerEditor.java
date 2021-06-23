package day_two.media_conroller;

import day_two.Model.Media;
import day_two.Model.Movie;
import day_two.Model.Series;
import day_two.Model.enums.Category;
import day_two.Model.enums.MediaType;

public class MediaControllerEditor {

    public static final String PASS = "PASS";

    static {
        MediaController mediaController = MediaController.getInstance();
        //set the media static counter with the last id +1
        Media.setIdCounter((mediaController.getMediaList().get(mediaController.getMediaList().size() - 1).getId()) + 1);
    }

    MediaController mediaController;

    public MediaControllerEditor() {
        mediaController = MediaController.getInstance();
    }

    private String validateMedia(Media media) {
        boolean isRight = true;
        StringBuilder builder = new StringBuilder();
        if (media.getTitle().isEmpty()) {
            builder.append("There's no Title.\n");
            isRight = false;
        }
        if (media.getDuration() <= 0) {
            builder.append(("There's no duration.\n"));
            isRight = false;
        }
        if (media.getType().equals(MediaType.NONE)) {
            builder.append("You must define the media type.\n");
            isRight = false;
        }
        if (isRight)
            return PASS;
        else return builder.toString();
    }

    public void listMedia() {
        for (Media m : mediaController.getMediaList()) {
            System.out.println("**************************");
            System.out.println(m);
            System.out.println("**************************");
        }
    }

    public String addNewMedia(Media media) {
        String validMessage = validateMedia(media);
        if (validMessage.equals(PASS))
            mediaController.writeMedia(media);
        return validMessage;
    }
    //write and update use the same method from the MediaController, in update it overwrite the file with the same name.
}
