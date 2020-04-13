package datastructure;

public class User {
    String cityLandmark;
    String stateLandmark;
   // String stDOB;

    public User(){}
    public User(String cityLandmark, String stateLandmark){
        this.cityLandmark = cityLandmark;
        this.stateLandmark = stateLandmark;
    }
//    public User(String stName, String stID, String stDOB){
//        this.cityLandmark = ci;
//        this.StateLandmark = stID;
//        //this.stDOB = stDOB;


    public String getCityLandmark() {
        return cityLandmark;
    }

    public void setCityLandmark(String CityLandMark) {
        this.cityLandmark = CityLandMark;
    }

    public String getStateLandmark() {
        return stateLandmark;
    }

    public void setStateLandmark(String StateLandmark) {
        this.stateLandmark = StateLandmark;
    }

//    public String getStDOB() {
//        return stDOB;
//    }
//
//   public void setStDOB(String stDOB) {
//        this.stDOB = stDOB;
    }

