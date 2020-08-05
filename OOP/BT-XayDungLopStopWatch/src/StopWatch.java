import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime ;

    public long getStartTime(long startTime) {
        return startTime;
    }

    public long getEndTime (long endTime ) {
        return  endTime ;
    }

    StopWatch(){
        Date date=new Date();
        startTime=date.getTime();
    }

    public void start(){
        Date date = new Date();
        this.startTime= date.getTime();
        getStartTime(startTime);
    }

    public void stop(){
        Date date = new Date();
        this.endTime = date.getTime();
        getEndTime(endTime );
    }

    public void getElapsedTime() {
        long elapsedTime =endTime-startTime;
        System.out.printf("Thoi gian thuc thi bai toan la %d",elapsedTime);
    }

}
