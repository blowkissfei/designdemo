package parttendesign.guanchazhe;


/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.ObserverFei
 * @date 2020/3/9 17:22
 * @Copyright © 2019
 */
public interface Subject {
    public void registerObserver(ObserverFei observer);
    public void removeObserver(ObserverFei observer);
    public void notifyObserver();

}
