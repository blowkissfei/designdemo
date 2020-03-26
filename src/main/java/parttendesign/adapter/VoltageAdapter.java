package parttendesign.adapter;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.adapter
 * @date 2020/3/10 15:47
 * @Copyright © 2019
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int output5V() {
        int src = output220V();
        int dstV = src/44;
        return dstV;
    }
}
