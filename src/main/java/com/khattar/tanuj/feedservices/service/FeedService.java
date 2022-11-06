package com.khattar.tanuj.feedservices.service;

import com.khattar.tanuj.feedservices.models.Feed;
import com.khattar.tanuj.feedservices.models.FeedRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FeedService {
    String createFeed(FeedRequest request);

    boolean editFeed(Feed editfeed);

    Feed getFeedById(String id);

    List<Feed> getAllFeed();
}
