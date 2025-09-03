public class Homework extends Thread{
    private String studentName;

    Homework(String name){
        this.studentName = name;
    }

    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(studentName + " is solving question " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
}
