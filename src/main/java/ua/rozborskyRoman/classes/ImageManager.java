package ua.rozborskyRoman.classes;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by roman on 03.08.2016.
 */
@Component
public class ImageManager {

    final String DIR_WITH_IMAGES = "C:/Users/roman/IdeaProjects/landingPage/src/main/java/ua/rozborskyRoman/classes";

    public void validateImage(MultipartFile image) {
        if (!image.getContentType().equals("image/jpeg")) {
            throw new RuntimeException();
        }
    }

    public void saveImage(String fileName, MultipartFile image)
            throws RuntimeException{
        try{
            File file = new File(DIR_WITH_IMAGES + "/" + fileName);
            FileUtils.writeByteArrayToFile(file, image.getBytes());
        } catch (IOException exception) {
            throw new RuntimeException();
        }
    }
}
