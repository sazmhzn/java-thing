
public class Virinchi extends Car implements CarInterface {

    /**
     *This is developed by ...
     */
    @Override  //annotation 
             public void brake() {
                System.out.println("I am a brake.");
            }
             
    /**
     *This is for the brake ...
     */
    @Override
             public void numOfWheel() {
                 System.out.println("I have four wheels");
             }
             
    public static void main(String[] args) {
        //object initialization from constructor
        Virinchi v = new Virinchi();

        v.start();
        v.stop();
        v.brake();
        v.numOfWheel();
        
    }
}
