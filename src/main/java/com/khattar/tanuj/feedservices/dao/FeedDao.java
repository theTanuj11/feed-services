package com.khattar.tanuj.feedservices.dao;

import com.khattar.tanuj.feedservices.models.Feed;
import com.khattar.tanuj.feedservices.models.FeedRequest;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface FeedDao {


      String createFeed(FeedRequest request);

    boolean editFeed(Feed editfeed);

      Feed getFeedById(String id);

      List<Feed> getAllFeed();
}
