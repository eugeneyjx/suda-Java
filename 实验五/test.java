import javax.swing.*;
import java.util.Date;
public class toDate {
    public static Date strtoDate(String str) {
        try {
            String[] splitdate = str.split("/");
            int[] intdate = new int[3];
            intdate[0] = Integer.parseInt(splitdate[0]);
            intdate[1] = Integer.parseInt(splitdate[1]);
            intdate[2] = Integer.parseInt(splitdate[2]);
            Date d=new Date(intdate[0],intdate[1],intdate[2]);
            return d;
        }
        catch(NumberFormatException e){
            System.out.println("格式错误");
            throw e;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("格式错误");
            throw e;
        }
    }
    public static void main(String args[]) {
        String s = JOptionPane.showInputDialog("请输入日期（格式为yyyy/mm/dd）");
        System.out.println(strtoDate(s));
    }
}
