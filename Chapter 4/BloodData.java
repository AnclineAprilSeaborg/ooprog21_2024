public class BloodData {
     String bloodType;
     String rhFactor;

   
  
    public BloodData() {
        this.bloodType = "";
        this.rhFactor = "";
    }

       public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

      public String getBlood() {
        return bloodType;
    }

       public void setBlood(String bloodType) {
        this.bloodType = bloodType;
    }
        public String getRh() {
        return rhFactor;
    }

  
    public void setRh(String rhFactor) {
        this.rhFactor = rhFactor;
    }
    public void defaultPatient() {
        this.bloodType = "A";
        this.rhFactor = "-";
    }

    
    public void displayBloodInfo() {
        System.out.println("Your blood type is: " + bloodType);
        System.out.println("Your Rh Factor is: " + rhFactor);
    }
}
