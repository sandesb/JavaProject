/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author home
 */
public class video {
    private int movie_id;
    private String movie_desc;
    private String thumbnail;
    private String video;

    public video() {
       }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovie_desc() {
        return movie_desc;
    }

    public void setMovie_desc(String movie_desc) {
        this.movie_desc = movie_desc;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public video(int movie_id, String movie_desc, String thumbnail, String video) {
        this.movie_id = movie_id;
        this.movie_desc = movie_desc;
        this.thumbnail = thumbnail;
        this.video = video;
    }
    
}
