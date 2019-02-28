package com.detroitlabs.photoAlbum.data;

import com.detroitlabs.photoAlbum.model.Photo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PhotoRepository {
    private static final List<Photo> ALL_PHOTOS = Arrays.asList(
            new Photo("black", LocalDate.of(2019, 2,28),"fresh"),
            new Photo("blackeye", LocalDate.of(2019, 2, 22), "fresh"),
            new Photo("canned", LocalDate.of(1967,7,4),"canned"),
            new Photo("coffee", LocalDate.of(2019, 2,27),"roasted"),
            new Photo("green", LocalDate.of(2019, 2,15),"fresh"),
            new Photo("kidney", LocalDate.of(2019, 2,20),"fresh"),
            new Photo("pinto", LocalDate.of(2019, 2, 23),"fresh"),
            new Photo("refried", LocalDate.of(2019,2,28),"cooked"),
            new Photo("spilled", LocalDate.of(2019, 2, 2),"oops"),
            new Photo("white", LocalDate.of(2019, 2, 15),"fresh")
            );

    public List<Photo> displayFiveRandomPhotos(){
        List<Photo> fiveRandomPhotos = new ArrayList<>();

        Collections.shuffle(ALL_PHOTOS);

        for(int index = 0; index < 4; index++){
            fiveRandomPhotos.add(ALL_PHOTOS.get(index));
        }

        return fiveRandomPhotos;
    }

    public List<Photo> getAllPhotos() {
        return ALL_PHOTOS;
    }
}
