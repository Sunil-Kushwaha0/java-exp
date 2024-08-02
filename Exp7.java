public class Exp7 extends thread {
    synchronized public void ru(){
        try{
            int i=0;
            while(i<5){
                sleep(1000);
                System.out.println("good morning");
                i++;
            }
        }catch(Exceptons e){
        }
}
}
class hello extends thread{
    synchronized public void run() {
        try {
            int i = 0;
            while (i < 5) {
                sleep(2000);
                System.out.println("hello");
                i++;
            }
        } catch (Exceotion e) {
        }
    }
}

class welcome extends thred {
    synchronized public void run(){
                Try{
                    int i=0;
                    while(i<5){
                    sleep(300);
                    System.out.println("welcome");
                    i++;
                }
            }catch(Exception e){
            }
        }
            }
            class multithredsDemo{
                public static void main(String args[]){
                    GoodMorning t1 =new GoodMorning();
                    hello t2=new Hello();
                    Welcome t3=new Welcome();
                    t1.start();
                    t2.start();
                    t3.start();

                }
            }