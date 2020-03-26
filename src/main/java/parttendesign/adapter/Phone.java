package parttendesign.adapter;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.derecotor.adapter
 * @date 2020/3/10 15:50
 * @Copyright © 2019
 */
public class Phone {
    public void charging(Voltage5V voltage5V){
        if (voltage5V.output5V()==5){
            System.out.println("电压为5V，可以进行充电");
        }else if(voltage5V.output5V()>5){
            System.out.println("电压大于5V，不可以充电");
        }
    }

}
