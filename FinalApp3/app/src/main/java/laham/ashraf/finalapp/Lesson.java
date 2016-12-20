package laham.ashraf.finalapp;

/**
 * Created by Ashraf on 12/16/2016.
 */

public class Lesson {

    private String title;
    private String disc;
    private String lsnDate;
    private String img;
    private String details;


    // --- Ctor ----------

    public Lesson(String title, String disc, String lsnDate, String img) {
        this.title = title;
        this.disc=disc;
        this.lsnDate=lsnDate;
        this.img=img;
    }

    // --- Seter and Geter Method
    //---------------------

    public String getDisc() {
        return disc;
    }

    public String getlsnDate() {
        return lsnDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDisc(String disc) {
        disc = disc;
    }

    public void setlsnDate(String lDate) {
        this.lsnDate = lDate;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    //---------------------




}
