package com.example.paladin.news;

public class RSSItem {

    String _title;
    String _description;
    String _link;
    String _pubdate;
    String _guid;

    public RSSItem(String title, String link, String description, String pubdate, String guid){

        this._title = title;
        this._description = description;
        this._link = link;
        this._guid = guid;
        this._pubdate = pubdate;
    }

    //set method
    public void setTitle(String title){
        this._title = title;
    }

    public void setLink(String link){
        this._link = link;
    }

    public void setDescription(String description){
        this._description = description;
    }

    public void setPubdate(String pubDate){
        this._pubdate = pubDate;
    }

    public void setGuid(String guid){
        this._guid = guid;
    }

    //get method
    public String getTitle(){
        return this._title;
    }

    public String getLink(){
        return this._link;
    }

    public String getDescription(){
        return this._description;
    }

    public String getPubdate(){
        return this._pubdate;
    }

    public String getGuid(){
        return this._guid;
    }
}
