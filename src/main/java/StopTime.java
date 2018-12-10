

public class StopTime {

    private long startTime;
    private long stopTime;

    public StopTime(){

    }

    public void start(){
     this.startTime = System.nanoTime();
    }

    public void stop(){
        this.stopTime =  System.nanoTime();
    }

    public long getElapsedTime(){
        return stopTime - startTime;
    }





}
