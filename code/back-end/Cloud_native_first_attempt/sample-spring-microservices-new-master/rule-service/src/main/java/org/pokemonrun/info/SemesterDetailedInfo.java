package org.pokemonrun.info;

// for front-end reader
public class SemesterDetailedInfo {
    private String mileageGoal;
    private String endTime;
    private String startTime;
    private String endTimeLong;
    private String startTimeLong;
    private String minSpeed;
    private String maxSpeed;
    public SemesterDetailedInfo(String mileageGoal, String endTime, String startTime,
                                String endTimeLong, String startTimeLong,
                                String minSpeed, String maxSpeed){
        this.mileageGoal = mileageGoal;
        this.endTime = endTime;
        this.startTime = startTime;
        this.endTimeLong = endTimeLong;
        this.startTimeLong = startTimeLong;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
    }

    public String getMileageGoal() {
        return mileageGoal;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTimeLong() {
        return endTimeLong;
    }

    public String getStartTimeLong() {
        return startTimeLong;
    }

    public String getMinSpeed() {
        return minSpeed;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }
}
