public class E0403C {  
    public static void main(String[] args) {  
        final double RADIUS = 6371.01;
        double AtlantaLatitude = Math.toRadians(33.753746);
        double AtlantaLongitude = Math.toRadians(-84.386330);
        double OrlandoLatitude = Math.toRadians(28.5383355);
        double OrlandoLongitude = Math.toRadians(-81.3792365);
        double SavannahLatitude = Math.toRadians(32.0835407);
        double SavannahLongitude = Math.toRadians(-81.0998342);
        double CharlotteLatitude = Math.toRadians(35.2270869);
        double CharlotteLongitude = Math.toRadians(-80.8431267);

        double distanceAtlantaOrlando =
                RADIUS * Math.acos(Math.sin(AtlantaLatitude)
                                * Math.sin(OrlandoLatitude)
                        + Math.cos(AtlantaLatitude)
                                * Math.cos(OrlandoLatitude) 
                                * Math.cos(AtlantaLongitude - OrlandoLongitude)
                );

        double distanceOrlandoSavannah = 
                RADIUS * Math.acos(Math.sin(OrlandoLatitude)
                                * Math.sin(SavannahLatitude)
                        + Math.cos(OrlandoLatitude)
                                * Math.cos(SavannahLatitude) 
                                * Math.cos(OrlandoLongitude - SavannahLongitude)
                );

        double distanceSavannahCharlotte =
                RADIUS * Math.acos(Math.sin(SavannahLatitude)
                                * Math.sin(CharlotteLatitude)
                        + Math.cos(SavannahLatitude)
                                * Math.cos(CharlotteLatitude) 
                                * Math.cos(SavannahLongitude - CharlotteLongitude)
                );

        double distanceAtlantaCharlotte =
                RADIUS * Math.acos(Math.sin(AtlantaLatitude)
                                * Math.sin(CharlotteLatitude)
                        + Math.cos(AtlantaLatitude)
                                * Math.cos(CharlotteLatitude) 
                                * Math.cos(AtlantaLongitude - CharlotteLongitude)
                );

        double distanceAtlantaSavannah =
                RADIUS * Math.acos(Math.sin(AtlantaLatitude)
                                * Math.sin(SavannahLatitude)
                        + Math.cos(AtlantaLatitude)
                                * Math.cos(SavannahLatitude) 
                                * Math.cos(AtlantaLongitude - SavannahLongitude)
                );

        double s1 = (distanceAtlantaCharlotte
                + distanceSavannahCharlotte + distanceAtlantaSavannah) / 2;
        double area1 =
                Math.pow(s1 * (s1
                        - distanceAtlantaCharlotte) * (s1
                                - distanceSavannahCharlotte) * (s1
                                        - distanceAtlantaSavannah), 0.5);

        double s2 = (distanceOrlandoSavannah 
                + distanceAtlantaOrlando + distanceAtlantaSavannah) / 2;
        double area2 =
                Math.pow(s2 * (s2 
                        - distanceOrlandoSavannah) * (s2 
                                - distanceAtlantaOrlando) * (s2 
                                        - distanceAtlantaSavannah), 0.5);

        System.out.println("Using the Great Circle calculation, the estimated area = "
                + Math.round((area1 + area2) * 100) / 100. + " km^2");
    }  
}