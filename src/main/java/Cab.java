import java.util.Scanner;

import java.util.List;
import java.util.Scanner;
public class Cab {
    public static final int Fare_Per_KM = 10;
    public static final int Fare_Per_Min_Wait = 2;
    public static final int Base_Fare = 40;
    public int calculateFare(int distance, int waitTime){
        int cost = Fare_Per_KM * distance + Fare_Per_Min_Wait * waitTime;
        if (cost> Base_Fare)
            return cost;
        else
            return Base_Fare;
    }
    public int aggregateFare(int [][] Rides) {
        int numberOfRides= Rides.length;
        int totalFare = 0;
        for(int i=0;i<Rides.length;i++){
            int distance = Rides[i][0];
            int waitTime = Rides[i][1];
            totalFare += calculateFare(distance, waitTime);
        }
        System.out.println("Number of Rides : "+numberOfRides);
        System.out.println("Total Fare : "+totalFare);
        System.out.println("Average Fare : "+(totalFare/numberOfRides));
        return totalFare;
    }
}
