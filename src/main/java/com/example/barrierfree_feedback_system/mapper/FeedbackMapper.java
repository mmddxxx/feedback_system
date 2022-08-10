

package com.example.barrierfree_feedback_system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.barrierfree_feedback_system.bean.FeedbackInfo;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Repository
@Mapper
public interface FeedbackMapper extends BaseMapper<FeedbackInfo> {

//    void saveFeedbackInfo(FeedbackInfo feedbackInfo);
//    List<FeedbackInfo> getFeedbackInfo();
//    FeedbackInfo getFeedbackInfoById(int id);
}