package com.example.paladin.news;

import java.util.List;

/**
 * Created by Paladin on 09.02.2016.
 */
public class RSSFeed {

    List<RSSItem> _items;
    String _title;
    String _description;
    String _link;
    String _rss_link;
    String _language;

    public RSSFeed(String title, String description, String link, String rss_link, String language){
        this._title = title;
        this._description = description;
        this._link = link;
        this._language = language;
        this._rss_link = rss_link;
    }

    public void setItems(List<RSSItem> items){
        this._items = items;
    }

    public List<RSSItem> getItems(){
        return this._items;
    }
    public String getTitle(){
        return this._title;
    }
    public String getLink(){
        return this._link;
    }
    public String getDescription(){
        return this._description;
    }
    public String getRssLink(){
        return this._rss_link;
    }
    public String getLanguage(){
        return this._language;
    }
}