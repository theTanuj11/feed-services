package com.khattar.tanuj.feedservices.service;

import com.khattar.tanuj.feedservices.dao.FeedDao;
import com.khattar.tanuj.feedservices.models.Feed;
import com.khattar.tanuj.feedservices.models.FeedRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedServiceImpl implements FeedService{

    @Autowired
    private FeedDao feedDao;
    @Override
    public String createFeed(FeedRequest request) {
        return feedDao.createFeed(request);
    }

    @Override
    public boolean editFeed(Feed editfeed) {
        return feedDao.editFeed(editfeed);
    }

    @Override
    public Feed getFeedById(String id) {
        return feedDao.getFeedById(id);
    }

    @Override
    public List<Feed> getAllFeed() {
        return feedDao.getAllFeed();
    }
}
