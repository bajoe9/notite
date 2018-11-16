import stanford.karel.Karel;

public class robot extends Karel {
    public void run(){
turnLeft();
while (frontIsClear()){
    if (noBeepersPresent()){
        putBeeper();
    }
       move();
         }  if (noBeepersPresent()){
            putBeeper();


      }

 }}
