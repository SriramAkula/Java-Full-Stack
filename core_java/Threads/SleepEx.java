
public class SleepEx extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{
                System.out.println(i);
                Thread.sleep(5000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        SleepEx s1=new SleepEx();
        SleepEx s2=new SleepEx();

        s1.start();
        s2.start();
    }
}
