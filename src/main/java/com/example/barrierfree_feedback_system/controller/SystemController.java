package com.example.barrierfree_feedback_system.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.barrierfree_feedback_system.bean.FeedbackInfo;
import com.example.barrierfree_feedback_system.common.Result;
import com.example.barrierfree_feedback_system.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feedbackSystem")
public class SystemController {

    @Autowired
    FeedbackService feedbackService;


//    /**
//     * 保存反馈
//     * @param jsonObject
//     * @return
//     */
//    @RequestMapping(value = "saveFeedbackInfo", method = RequestMethod.POST)
//    public Result<?> saveFeedbackSystem(@RequestBody JSONObject jsonObject) {
//        FeedbackInfo feedbackInfo = new FeedbackInfo();
//        feedbackInfo.setLocation(jsonObject.getString("location"));
//        feedbackInfo.setContent(jsonObject.getString("content"));
//        feedbackInfo.setTime(jsonObject.getString("time"));
//        feedbackInfo.setState(0);
//        feedbackService.saveFeedbackInfo(feedbackInfo);
//        return Result.success();
//    }

    /**
     * 保存反馈
     * @param
     * @return
//     */
    @RequestMapping(value = "saveFeedbackInfo", method = RequestMethod.POST)
    public Result<?> saveFeedbackSystem(@RequestBody FeedbackInfo feedbackInfo) {
        feedbackService.saveFeedbackInfo(feedbackInfo);
        return Result.success();
    }

    /**
     * 获取反馈
     * @return
     */
    @RequestMapping(value = "getFeedbackInfo", method = RequestMethod.POST)
    public Result<?> getFeedbackSystem() {
        List<FeedbackInfo> feedbackInfoList = feedbackService.getFeedbackInfo();
        return Result.success(feedbackInfoList);
    }

    /**
     * 获取反馈byId
     * @return
     */
    @RequestMapping(value = "getFeedbackInfoById", method = RequestMethod.POST)
    public Result<?> getFeedbackInfoById(@RequestBody JSONObject jsonObject) {
        FeedbackInfo feedbackInfo = feedbackService.getFeedbackInfoById(jsonObject.getInteger("id"));
        return Result.success(feedbackInfo);
    }
}
