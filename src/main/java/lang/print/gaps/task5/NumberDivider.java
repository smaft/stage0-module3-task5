package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
       int result = toBeDivided /5;
        System.out.println(result);
    }
    public static void main (String [] args){
        NumberDivider Dev = new NumberDivider();
        Dev.divide(35);

    }
}
