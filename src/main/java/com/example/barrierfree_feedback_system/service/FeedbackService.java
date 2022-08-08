package com.example.barrierfree_feedback_system.service;

import com.example.barrierfree_feedback_system.bean.FeedbackInfo;
import com.example.barrierfree_feedback_system.mapper.FeedbackMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    /**
     * 保存反馈
     * @param feedbackInfo
     */

    @Autowired
    FeedbackMapper feedbackMapper;

    public void saveFeedbackInfo(FeedbackInfo feedbackInfo) {
        feedbackMapper.saveFeedbackInfo(feedbackInfo);
    }

    public List<FeedbackInfo> getFeedbackInfo() {
        return feedbackMapper.getFeedbackInfo();
    }

    public FeedbackInfo getFeedbackInfoById(int id) {
        return feedbackMapper.getFeedbackInfoById(id);
    }
}
