import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        do {
            System.out.println("\n"+"Chon mot trong cac lua chon sau : ");
            System.out.println("Chon 1 de in hinh chu nhat");
            System.out.println("Chon 2 de in 1 trong 4 loai tam giac");
            System.out.println("Chon 3 de in hinh tam giac can");
            System.out.println("Chon 4 de Thoat chuong trinh");
            System.out.print("Xin moi chon so (1/2/3/4) : ");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Hình chữ nhật");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    System.out.println("\n"+"Chon : a ve tam giac vuong Top-left ;"+
                           "\n"+ "Chon : b ve tam giac vuong Top-right ;" +
                            "\n"+"Chon : c ve tam giac vuong Bottom-left ;"
                            +"\n"+"Chon : d ve tam giac vuong Bottom-right ");
                    System.out.println("Moi chon (a/b/c/d) :");
                    String type = scanner.next();
                    if (type.equals("a")) {
                        System.out.println("Tam giac vuong Top-left");
                        for (int i = 1; i <= 8; i++) {
                            for (int j = 8; j > i; j--) {
                                System.out.print(" * ");
                            }
                            System.out.println("");
                        }
                    }
                    if (type.equals("b")) {
                        System.out.println("Tam giac vuong Top-right");
                        for (int i = 1; i <= 8; i++) {
                            for (int j = 0; j < i; j++) {
                                System.out.print("   ");
                            }
                            for (int k = 8; k > i; k--) {
                                System.out.print(" * ");
                            }
                            System.out.println(" ");
                        }
                    }
                    if (type.equals("c")) {
                        System.out.println("Tam giac vuong Bottom-left ");
                        for (int i = 1; i <= 8; i++) {
                            for (int j = 1; j < i; j++) {
                                System.out.print(" * ");
                            }
                            System.out.println("");
                        }
                    }
                    if (type.equals("d")) {
                        System.out.println("Tam giac vuong Bottom-right  ");
                        for (int i = 8; i >= 1; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("   ");
                            }
                            for (int k = 8; k > i; k--) {
                                System.out.print(" * ");
                            }
                            System.out.println("");
                        }
                    } break;
                case 3:
                    System.out.println("Tam giac can");
                    for (int i = 1; i <=5 ; i++) {
                        for (int j = 5; j >i ; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <=(i*2-1); k++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
            }
        }
        while (number != 4);
    }
}

