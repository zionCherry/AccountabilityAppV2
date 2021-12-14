package com.example.androidappv2;

public class GroupInfo {

    String groupName;   //name of the created group
    int memNum;         //number of members in the group
    String groupObj;     //GroupObj;

    public GroupInfo(String groupName, int memNum, String groupObj) {
        this.groupName = groupName;
        this.memNum = memNum;
        this.groupObj = groupObj;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getMemNum() {
        return memNum;
    }

    public void setMemNum(int memNum) {
        this.memNum = memNum;
    }

    public String getGroupObj() {
        return groupObj;
    }

    public void setGroupObj(String groupObj) {
        this.groupObj = groupObj;
    }
}

