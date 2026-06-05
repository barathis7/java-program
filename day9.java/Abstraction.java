abstract class Abstraction {
    
    abstract void turnOn();
    abstract void turnOff();
}


class TVRemote extends TV{
    
        void turnOn(){
        
        System.out.println("TV is turned ON.");
    }

    
    void turnOff(){
        
        System.out.println("TV is turned OFF.");
    }
}


public class Geeks{
    
    public static void main(String[] args){
        
        TV remote = new TVRemote();
        remote.turnOn();   
        remote.turnOff();  
    }
}