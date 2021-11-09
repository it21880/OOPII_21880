import java.util.ArrayList;

public class City{

    double[] features = new double[10];
    double longitude = getLong();
    double latitude = getLat();

    public void city() {

        features[1] = getCafe();
        features[2] = getSea();
        features[3] = getMuseums();
        features[4] = getRestaurant();
        features[5] = getStadium();
        features[6] = getBars();
        features[7] = getClubs();
        features[8] = getTemperature();
        features[9] = getClouds();
        features[10] = getGeodesicDist();

    }

    public double normalizer(double term1) {
        return term1 /10;
    }

    //placeholder getters-setters below

    private void setCafe(int cafe) {
        features[1] = normalizer(cafe);
    }

    public double getCafe() {
        return features[1];
    }

    private void setSea(int sea) {
        features[2] = normalizer(sea);
    }

    public double getSea() {
        return features[2];
    }

    private void setMuseums(int museums) {
        features[3] = normalizer(museums);
    }

    public double getMuseums() {
        return features[3];
    }

    private void setRestaurant(int restaurant) {
        features[4] = normalizer(restaurant);
    }

    public double getRestaurant() {
        return features[4];
    }

    private void setStadium(int stadium) {
        features[5] = normalizer(stadium);
    }

    public double getStadium() {
        return features[5];
    }

    private void setBars(int bars) {
        features[6] = normalizer(bars);
    }

    public double getBars() {

        return features[6];
    }

    private void setClubs(int club) {
        features[7] = normalizer(club);
    }

    public double getClubs() {

        return features[7];
    }

    private void setTemperature(int temperature) {
        features[8] = (temperature - 184)/(147);
    }

    public double getTemperature() {
        return features[8];
    }

    private void setClouds(int clouds) {
        features[9] = clouds/100    ;
    }

    public double getClouds() {
        return features[9];
    }

    private void setLong(double cityLong){
        longitude = cityLong;
    }

    public double getLong(){
        return longitude;
    }

    private void setLat(double cityLat){
        latitude = cityLat;
    }

    public double getLat(){
        return latitude;
    }

    private void setGeodesicDist() {
        features[10] = (DistanceCalculator.distance(37.983810, 23.727539, latitude, longitude, "K"))/15325.70863500677;
    }//15325.70863500677 geodasic distance of athens-sydney

    public double getGeodesicDist() {
        return features[10];
    }
}