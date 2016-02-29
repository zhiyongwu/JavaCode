package Cralwer.bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/2/2.
 */
public class Topic {
    private DateFormat format = new SimpleDateFormat("yyyy:MM:dd HH:mm:SS");
    private String date = format.format(new Date());
    private String title;
    private String author;
    private String descr;
    private int acount;
    private String link;
    private String authorlink;
    private String baselink;

    public String getBaselink() {
        return baselink;
    }

    public void setBaselink(String baselink) {
        this.baselink = baselink;
    }

    public String getAuthorlink() {
        return authorlink;
    }

    public void setAuthorlink(String authorlink) {
        this.authorlink = authorlink;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public void setAcount(int acount) {
        this.acount = acount;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAcount() {
        return acount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;


    }

    @Override
    public String toString() {
        return "Topic{" +
                "date='" + date + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", descr='" + descr + '\'' +
                ", acount=" + acount +
                ", link='" + link + '\'' +
                ", authorlink='" + authorlink + '\'' +
                ", baselink='" + baselink + '\'' +
                '}';
    }
}
