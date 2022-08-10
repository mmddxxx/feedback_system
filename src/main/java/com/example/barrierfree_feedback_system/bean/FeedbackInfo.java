package com.example.barrierfree_feedback_system.bean;


import com.baomidou.mybatisplus.annotation.TableName;

@TableName("feedback_info")
public class FeedbackInfo {

    int id; //反馈信息id
    String location;  //反馈地点
    String content;  //反馈内容
    String time; //反馈时间
    int state; //反馈处理状态

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

//    @Override
//    public FeedbackInfo clone() {  //用处：深拷贝一个对象，源码的clone是浅拷贝
//        FeedbackInfo feedbackInfo = new FeedbackInfo();
//        feedbackInfo.setId(id);
//        feedbackInfo.setLocation(location);
//        feedbackInfo.setContent(content);
//        feedbackInfo.setTime(time);
//        feedbackInfo.setState(state);
//        return feedbackInfo;
//    }
}
