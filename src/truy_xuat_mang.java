import java.util.Scanner;

public class truy_xuat_mang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] student = {"dai", "nguyen", "huy","cong","quy","linh","hieu","sang","phong"} ;
        System.out.print("nhap ten can tim: ");
        String name = input.nextLine();
        boolean isExit = false;
        for (int i =0; i<student.length;i++){
            if (student[i].equals(name)){
                System.out.println("sinh vien " + name+ " o vi tri " + (i+1));
                isExit = true;
                break;
            }
        }
        if (!isExit){
            System.out.println("khong co");
        }


    }
}
