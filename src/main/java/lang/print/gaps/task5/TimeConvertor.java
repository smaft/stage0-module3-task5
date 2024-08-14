package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {
        float secondes = minutes * 60;
        System.out.println(secondes);
    }
    public  static void main (String [] args){
        TimeConvertor T = new TimeConvertor();
        T.convert(10);
    }
}
