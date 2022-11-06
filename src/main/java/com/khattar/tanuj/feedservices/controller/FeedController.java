package com.khattar.tanuj.feedservices.controller;

import com.khattar.tanuj.feedservices.models.Feed;
import com.khattar.tanuj.feedservices.models.FeedRequest;
import com.khattar.tanuj.feedservices.models.response.BaseResponse;
import com.khattar.tanuj.feedservices.models.response.ErrorResponse;
import com.khattar.tanuj.feedservices.models.response.SuccessResponse;
import com.khattar.tanuj.feedservices.service.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/feed")
public class FeedController {
    @Autowired
    private FeedService feedService;

    @GetMapping("/home")
    public String restApi(){
        return "firstApi";
    }

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public BaseResponse createFeed(@RequestBody FeedRequest request){
        String id = feedService.createFeed(request);
        return new SuccessResponse("Feed Created with Id: "+id);
    }

    @PatchMapping("/editfeed")
    public BaseResponse editFeed(@RequestBody Feed editfeed){
        if(feedService.editFeed(editfeed) ){
            return new SuccessResponse("Feed Updated with id: " + editfeed.getFeedId());
        }else{
            return new ErrorResponse("No Feed Exist ");
        }
    }
//
//    @DeleteMapping("/deletefeed")
//    public String deleteFeed(@PathVariable String id){
//        return "";
//    }
//
    @GetMapping("/getallfeed")
    public BaseResponse getAllFeed(){
       return new SuccessResponse(feedService.getAllFeed());
    }

    @GetMapping("/getfeedbyid")
    public Feed getFeedById(@PathVariable String id){
        return feedService.getFeedById(id);
    }
}
