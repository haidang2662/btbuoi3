import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap vao so a : ");
        float a = Float.parseFloat(scanner.nextLine());
        System.out.println("moi ban nhap vao so b : ");
        float b = Float.parseFloat(scanner.nextLine());
        System.out.println("moi ban nhap vao phep tinh muon thuc hien bang ky tu :");
        String pheptinh = scanner.nextLine();
        final String CONG = "+";
        final String TRU = "-";
        final String NHAN = "*";
        final String CHIA = "/";
        final String LAYDU = "%";
        if(pheptinh.equals(CONG)){
            float c=a+b;
            System.out.println(+c);
        } else if (pheptinh.equals(TRU)){
            float d=a-b;
            System.out.println(+d);
        } else if (pheptinh.equals(NHAN)) {
            float e=a*b;
            System.out.println(+e);
        } else if (pheptinh.equals(CHIA)) {
            float f=a/b;
            System.out.println(+f);
        } else if (pheptinh.equals(LAYDU)) {
            float g=a%b;
            System.out.println(+g);
        }


    }

}