package Inheritance;

public class Instructor extends User{
     String batchName;
     double  avgRating;

     public String getBatchName() {
          return batchName;
     }

     public void setBatchName(String batchName) {
          this.batchName = batchName;
     }

     public double getAvgRating() {
          return avgRating;
     }

     public void setAvgRating(double avgRating) {
          this.avgRating = avgRating;
     }

     void scheduleClass()
     {
         System.out.println("Scheduling a new clss for your batch");
     }
}
