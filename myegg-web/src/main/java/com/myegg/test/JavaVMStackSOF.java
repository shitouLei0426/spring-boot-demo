package com.myegg.test;

/**
 * Created by Administrator on 2019/3/28 0028.
 */
public class JavaVMStackSOF {
    private int stackLength=1;
    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
         JavaVMStackSOF omm = new JavaVMStackSOF();
         try{
             omm.stackLeak();
         }catch (Throwable e){
             System.out.println("stack length:"+omm.stackLength);
             throw e;
         }
    }
}
