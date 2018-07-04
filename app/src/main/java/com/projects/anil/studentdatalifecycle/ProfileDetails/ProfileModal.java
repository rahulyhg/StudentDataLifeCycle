package com.projects.anil.studentdatalifecycle.ProfileDetails;

/**
 * Created by evolutyz on 13/03/18.
 */

public class ProfileModal {
    String id;
    String name,parent,roll,aadhar,emailS,dob,primaryNum,secondaryNum,parentPrimary;
    String parentsecondary,tempAdd,perAdd,goal,ambition;



    public ProfileModal(String id, String name, String parent, String roll, String aadhar, String emailS, String dob, String primaryNum, String secondaryNum, String parentPrimary, String parentsecondary, String tempAdd, String perAdd, String goal, String ambition) {
        this.id=id;
        this.name = name;
        this.parent = parent;
        this.roll = roll;
        this.aadhar = aadhar;
        this.emailS = emailS;
        this.dob = dob;
        this.primaryNum = primaryNum;
        this.secondaryNum = secondaryNum;
        this.parentPrimary = parentPrimary;
        this.parentsecondary = parentsecondary;
        this.tempAdd = tempAdd;
        this.perAdd = perAdd;
        this.goal = goal;
        this.ambition = ambition;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getEmailS() {
        return emailS;
    }

    public void setEmailS(String emailS) {
        this.emailS = emailS;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPrimaryNum() {
        return primaryNum;
    }

    public void setPrimaryNum(String primaryNum) {
        this.primaryNum = primaryNum;
    }

    public String getSecondaryNum() {
        return secondaryNum;
    }

    public void setSecondaryNum(String secondaryNum) {
        this.secondaryNum = secondaryNum;
    }

    public String getParentPrimary() {
        return parentPrimary;
    }

    public void setParentPrimary(String parentPrimary) {
        this.parentPrimary = parentPrimary;
    }

    public String getParentsecondary() {
        return parentsecondary;
    }

    public void setParentsecondary(String parentsecondary) {
        this.parentsecondary = parentsecondary;
    }

    public String getTempAdd() {
        return tempAdd;
    }

    public void setTempAdd(String tempAdd) {
        this.tempAdd = tempAdd;
    }

    public String getPerAdd() {
        return perAdd;
    }

    public void setPerAdd(String perAdd) {
        this.perAdd = perAdd;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getAmbition() {
        return ambition;
    }

    public void setAmbition(String ambition) {
        this.ambition = ambition;
    }
}
