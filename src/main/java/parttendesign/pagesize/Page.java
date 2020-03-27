package parttendesign.pagesize;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package parttendesign.pagesize
 * @date 2020/3/27 14:40
 * @Copyright © 2019
 */
public class Page {

    public static Num getPage(int page,int rows){
        if (page<=0){
            page=1;
        }
        int start=(page-1)*rows;
        Num num = new Num();
        num.setPage(start);
        num.setRows(rows);
        return num;
    }
    public static void main(String[] args) {
        int page=1000;
        int rows=10;
        Num num = getPage(page, rows);
        if (page<=0){
            page=1;
        }
        System.out.println("开始查找第："+page+"页，"+"每页："+rows+"行");
        System.out.println("start:"+num.getPage());
        System.out.println("rows:"+num.getRows());


    }

    static class Num{
        int page;
        int rows;

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getRows() {
            return rows;
        }

        public void setRows(int rows) {
            this.rows = rows;
        }
    }

}
