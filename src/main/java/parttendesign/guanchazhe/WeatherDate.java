package parttendesign.guanchazhe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.guanchazhe
 * @date 2020/3/9 17:37
 * @Copyright © 2019
 */
public class WeatherDate implements Subject{
    private float temp;
    private float preesure;
    private float humlity;
    private List<ObserverFei> observerFeis;

    public WeatherDate(){
        observerFeis=new ArrayList<ObserverFei>();
    }


    public void dataChange(){
        notifyObserver();
    }

    public void setDate(float temp,float preesure,float humlity){
        this.temp=temp;
        this.preesure=preesure;
        this.humlity=humlity;
        dataChange();
    }

    @Override
    public void registerObserver(ObserverFei observer) {
        observerFeis.add(observer);
    }

    @Override
    public void removeObserver(ObserverFei observer) {
        if (observerFeis.contains(observer)){
            observerFeis.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observerFeis.size(); i++) {
            observerFeis.get(i).update(this.temp,this.preesure,this.humlity);
        }

    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getPreesure() {
        return preesure;
    }

    public void setPreesure(float preesure) {
        this.preesure = preesure;
    }

    public float getHumlity() {
        return humlity;
    }

    public void setHumlity(float humlity) {
        this.humlity = humlity;
    }
}
