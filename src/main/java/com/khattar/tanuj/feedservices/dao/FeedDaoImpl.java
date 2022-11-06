package com.khattar.tanuj.feedservices.dao;

import com.khattar.tanuj.feedservices.models.Feed;
import com.khattar.tanuj.feedservices.models.FeedRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class FeedDaoImpl implements FeedDao{

    private Map<String,Feed> feedDatabase;

    public FeedDaoImpl(){
       feedDatabase= new HashMap<>();
    }

    @Override
    public String createFeed(FeedRequest request) {
        String id = UUID.randomUUID().toString();
        Feed feed = createFeed(id,request);
        feedDatabase.put(id,feed);
        return id;
    }

    private Feed createFeed(String id, FeedRequest request) {

        Feed feed = new Feed();
        feed.setFeedId(id);
        feed.setCaptions(request.getCaptions());
        feed.setBgColor(request.getBgColor());
        feed.setFontColor(request.getFontColor());
        feed.setFontStyle(request.getFontStyle());
        feed.setCreatedBy(request.getCreatedBy());
        feed.setTimeOfCreation(request.getTimeOfCreation());
        feed.setLocation(request.getLocation());

        return feed;
    }

    @Override
    public boolean editFeed(Feed editfeed) {

        if(feedDatabase.containsKey(editfeed.getFeedId())){
            for ( Feed value : feedDatabase.values()) {
                System.out.println("Value = " + value);
                value.setCaptions(editfeed.getCaptions());
                value.setBgColor(editfeed.getBgColor());
                value.setFontColor(editfeed.getFontColor());
                value.setFontStyle(editfeed.getFontStyle());
                value.setTimeOfCreation(editfeed.getTimeOfCreation());
                value.setLocation(editfeed.getLocation());
                System.out.println("Update feed Value: "+value);
            }
            return true;
        }
        return false;

    }

    @Override
    public Feed getFeedById(String id) {
       return null;

    }

    @Override
    public List<Feed> getAllFeed() {
        return feedDatabase.values().stream().collect(Collectors.toList());
    }

}
