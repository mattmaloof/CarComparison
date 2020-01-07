public class Car implements Comparable<Car>{
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String toString(){
        return year + " " + make + " " + model;
    }

    public int compareTo(Car o){
        int compare = this.make.compareToIgnoreCase(o.make);
        if (compare == 0) {
            compare = this.model.compareToIgnoreCase(o.model);
        }
        if (compare == 0) {
            if (this.year > o.year) {
                compare = 1;
            } else if (this.year < o.year) {
                compare = -1;
            }
            else {
                compare = 0;
            }
        }
        return compare;
    }
}
