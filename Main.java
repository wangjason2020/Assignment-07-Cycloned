public class Main {

    public static double latitude1,longitude1, latitude2, longitude2, a, c, distance;

    public static void main(String[] args) {
        // write your code here
        latitude1 = Math.toRadians(25);
        longitude1 = Math.toRadians(15);
        latitude2 = Math.toRadians(23);
        longitude2 = Math.toRadians(20);
        calcDistance();
        double distance1=distance;
        latitude1=Math.toRadians(23);
        longitude1=Math.toRadians(20);
        latitude2=Math.toRadians(21);
        longitude2=Math.toRadians(24);
        calcDistance();
        double distance2=distance;
        latitude1=Math.toRadians(21);
        longitude1=Math.toRadians(24);
        latitude2=Math.toRadians(20);
        longitude2=Math.toRadians(27);
        double distance3=distance;
        calcDistance();
        latitude1=Math.toRadians(20);
        longitude1=Math.toRadians(27);
        latitude2=Math.toRadians(19);
        longitude2=Math.toRadians(35);
        double distance4=distance;
        calcDistance();
        latitude1=Math.toRadians(19);
        longitude1=Math.toRadians(35);
        latitude2=Math.toRadians(21);
        longitude2=Math.toRadians(46);
        double distance5=distance;
        calcDistance();
        latitude1=Math.toRadians(21);
        longitude1=Math.toRadians(46);
        latitude2=Math.toRadians(23);
        longitude2=Math.toRadians(56);
        double distance6=distance;
        calcDistance();
        latitude1=Math.toRadians(23);
        longitude1=Math.toRadians(56);
        latitude2=Math.toRadians(25);
        longitude2=Math.toRadians(65);
        double distance7=distance;
        calcDistance();
        latitude1=Math.toRadians(25);
        longitude1=Math.toRadians(65);
        latitude2=Math.toRadians(28);
        longitude2=Math.toRadians(70);
        double distance8=distance;
        calcDistance();
        latitude1=Math.toRadians(28);
        longitude1=Math.toRadians(70);
        latitude2=Math.toRadians(32);
        longitude2=Math.toRadians(73);
        double distance9=distance;
        calcDistance();
        latitude1=Math.toRadians(32);
        longitude1=Math.toRadians(73);
        latitude2=Math.toRadians(34);
        longitude2=Math.toRadians(74);
        double distance10=distance;
        calcDistance();
        latitude1=Math.toRadians(34);
        longitude1=Math.toRadians(74);
        latitude2=Math.toRadians(36);
        longitude2=Math.toRadians(74);
        double distance11=distance;
        calcDistance();
        latitude1=Math.toRadians(36);
        longitude1=Math.toRadians(74);
        latitude2=Math.toRadians(39);
        longitude2=Math.toRadians(74);
        double distance12=distance;

        double totaldistance=distance1+distance2+distance3+distance4+distance5+distance6+distance7+distance8+distance9+distance10+distance11+distance12;
        System.out.println("Hurricane Gloria traveled "+totaldistance+" kilometers.");
    }

    public static double calcDistance() {
        a=Math.pow(Math.sin((latitude1-latitude2)/2),2)+Math.cos(latitude1)*Math.cos(latitude2)*Math.pow(Math.sin((longitude1-longitude2)/2),2);
        c=2*Math.atan2(Math.sqrt(a),Math.sqrt(1-a));
        distance=6371*c;
        return distance;
    }
}
