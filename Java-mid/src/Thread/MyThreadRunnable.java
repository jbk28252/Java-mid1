package Thread;

public class MyThreadRunnable implements Runnable{
    int loopCount;

    public MyThreadRunnable() {
        loopCount = 0;
    }

    @Override //Thread에 있는 run 오버라이드
    public void run() {

        for(int i = 0; i < 5; i++){
            System.out.println("Thread getName() : " + Thread.currentThread().getName() + " loopCount : " + loopCount);
            loopCount++;
            try{ //예외설정
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

