package org.funix.animal.model;

public class Animal {

    private final int photoID;
    private final int photoBGID;
    private final String path, name, content;
    private boolean isFav;

    public Animal(int photo, int photoBG, String path, String name, String content, boolean isFav) {
        this.photoID = photo;
        this.photoBGID = photoBG;
        this.path = path;
        this.name = name;
        this.content = content;
        this.isFav = isFav;
    }

    public boolean isFav() {
        return isFav;
    }

    public void setIsFav(boolean isFav) {
        this.isFav = isFav;
    }

    public int getPhotoID() {
        return photoID;
    }

    public int getPhotoBGID() {
        return photoBGID;
    }

    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }
}
