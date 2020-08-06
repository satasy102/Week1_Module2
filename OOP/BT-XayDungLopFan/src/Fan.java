public class Fan {
    public final byte SLOW = 1;
    public final byte MEDIUM = 2;
    public final byte FAST= 3;

    private int speed =SLOW;
    private boolean on =false;
    private double radius =5;
    private String color="blue";

    public int getSpeed (){
        return speed;
    }

    public boolean isOn(){
        return on;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public void setSpeed (int speed){
        this.speed =speed;
    }

    public void setOn (boolean on){
        this.on = on;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    Fan(){
    }

    public String toString(){
        if (this.isOn()) return "Fan is On. \nSpeed: " + this.getSpeed () + "\nColor: " + this.getColor() + "\nradius: " + this.getRadius();
        else return  "Fan is Off";

    }
}

