public class Main {

    public static double a, c, distance, totalDistance;

    public static void main(String[] args) {
        // write your code here
        totalDistance=0;

        totalDistance+=calcDistance(25,-15,23,-20);
        totalDistance+=calcDistance(23,-20,21,-24);
        totalDistance+=calcDistance(21,-24,20,-27);
        totalDistance+=calcDistance(20,-27,19,-35);
        totalDistance+=calcDistance(19,-35,21,-46);
        totalDistance+=calcDistance(21,-46,23,-56);
        totalDistance+=calcDistance(23,-56,25,-65);
        totalDistance+=calcDistance(25,-65,28,-70);
        totalDistance+=calcDistance(28,-70,32,-73);
        totalDistance+=calcDistance(32,-73,34,-74);
        totalDistance+=calcDistance(34,-74,36,-74);
        totalDistance+=calcDistance(36,-74,39,-74);

        System.out.println("Hurricane Gloria traveled "+totalDistance+" kilometers over the course of 13 days.");
    }

    public static double calcDistance(double latitude1,double longitude1,double latitude2,double longitude2) {
        double latitudeChange=Math.toRadians(latitude2-latitude1);
        double longitudeChange=Math.toRadians(longitude2-longitude1);
        double radianLatitude1=Math.toRadians(latitude1);
        double radianLatitude2=Math.toRadians(latitude2);
        a=Math.sin(latitudeChange/2)*Math.sin(latitudeChange/2)+Math.cos(radianLatitude1)*Math.cos(radianLatitude2)*Math.sin(longitudeChange/2)*Math.sin(longitudeChange/2);
        c=2*Math.atan2(Math.sqrt(a),Math.sqrt(1-a));
        distance=6371*c;
        return distance;
    }
}
