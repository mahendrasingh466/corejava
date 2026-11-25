package com.rays.basic.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GymManagement {

    private int id;
    private String name;
    private String trainerName;
    private String membershipType;
    private String joiningDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public void renewMembership(String joiningDate) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date joinDate = sdf.parse(joiningDate);

        // Joining date 1 year +
        Calendar cal = Calendar.getInstance();
        cal.setTime(joinDate);
        cal.add(Calendar.YEAR, 1);

        Date expiryDate =cal.getTime();

        Date today = new Date();

        if (today.after(expiryDate)) {
            System.out.println("membership is expired Please renew");
        } else {
            System.out.println("membership is active");
            System.out.println("Expiry Date: " + sdf.format(expiryDate));
        }
    }
}