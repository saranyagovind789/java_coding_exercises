package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {

        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {

        return firstName.charAt(0)+ "." +lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {

        double newPrice = ((vatRate/100)* originalPrice) + originalPrice;
        return Double.parseDouble(String.format("%.2f", newPrice));
    }

    public String reverse(String sentence) {

        StringBuilder sb = new StringBuilder(sentence);
        sb.reverse();
        return sb.toString();
    }

    public int countLinuxUsers(List<User> users) {

        long linuxUser =users.stream().filter(user -> user.getType().equals("Linux")).count();

        return (int)linuxUser;
    }
}
