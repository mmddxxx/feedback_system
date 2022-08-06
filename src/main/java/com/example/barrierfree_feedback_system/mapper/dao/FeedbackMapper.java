

package com.example.barrierfree_feedback_system.mapper.dao;

import com.example.barrierfree_feedback_system.bean.FeedbackInfo;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Repository
@Mapper
public interface FeedbackMapper {

    void saveFeedbackInfo(FeedbackInfo feedbackInfo);
    List<FeedbackInfo> getFeedbackInfo();
}