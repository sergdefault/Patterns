package Observer;

import java.util.ArrayList;

/**
 * Created by Цымбалюк Сергей on 28.05.2016.
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new ObserverImpl());
        subject.setParametr(20,20);
    }
}

interface Observer {
    public void handleEvent(int temp, int presser);
}

interface Observed {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}

class Subject implements Observed {
    private int temperature;
    private int presser;
    ArrayList<Observer> list=new ArrayList<>();

    public void setParametr(int temperature, int presser){
        this.temperature=temperature;
        this.presser=presser;
        this.notifyObserver();
    }
    @Override
    public void addObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer ob : list){
            ob.handleEvent(temperature,presser);
        }
    }
}

class ObserverImpl implements Observer{

    @Override
    public void handleEvent(int temp, int presser) {
        System.out.println("temperature = "+temp+" , presser = " + presser);
    }
}
