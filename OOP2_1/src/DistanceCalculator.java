import java.util.*;
import java.lang.*;
import java.io.*;

class DistanceCalculator
{
    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println(distance(37.983810, 23.727539, -33.865143
                , 151.209900, "M") + " Miles\n");
        System.out.println(distance(37.983810, 23.727539, -33.865143
                , 151.209900, "K") + " Kilometers\n");
        System.out.println(distance(37.983810, 23.727539, -33.865143
                , 151.209900, "N") + " Nautical Miles\n");
    }

    public static double distance(double lat1, double lon1, double lat2, double lon2, String unit) {
        if ((lat1 == lat2) && (lon1 == lon2)) {
            return 0;
        }
        else {
            double theta = lon1 - lon2;
            double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
            dist = Math.acos(dist);
            dist = Math.toDegrees(dist);
            dist = dist * 60 * 1.1515;
            if (unit.equals("K")) {
                dist = dist * 1.609344;
            } else if (unit.equals("N")) {
                dist = dist * 0.8684;
            }
            return (dist);
        }
    }
}