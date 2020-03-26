package parttendesign.adapter;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.adapter
 * @date 2020/3/10 15:43
 * @Copyright © 2019
 */
public class Voltage220V {
    public int output220V(){
        int src = 220;
        System.out.println("电压："+src+"v");
        return src;
    }

}
