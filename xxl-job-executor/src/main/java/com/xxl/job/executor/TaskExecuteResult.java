package com.xxl.job.executor;

/**
 * Created by Doaim on 16/6/8.
 * 任务执行结果
 */
public class TaskExecuteResult {
    /**
     * 是否执行成功
     */
    private boolean isSucceed;
    /**
     * 执行结果消息
     */
    private String resutlMsg;
    /**
     * 执行持续时间
     */
    private String  duration;
    /**
     * 执行结束时间
     */
    private String finishTime;

    public boolean isSucceed() {
        return isSucceed;
    }

    public void setSucceed(boolean succeed) {
        isSucceed = succeed;
    }

    public String getResutlMsg() {
        return resutlMsg;
    }

    public void setResutlMsg(String resutlMsg) {
        this.resutlMsg = resutlMsg;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }
}
