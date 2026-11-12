
public class Main {

    public static void main(String[] args) {
        int diamond_size = 5;
        for (int i = 1; i<=diamond_size;i++){
            print_row(i, diamond_size);
            
        }
        for (int i = diamond_size -1; i > 0;i--){
            print_row(i, diamond_size);
            
        }
    }

    public static void print_row(int row_len, int total_size) {

        for(int i = 0; i<total_size - row_len;i++){
            System.out.print("  ");
        }

        for (int i = 1; i <= row_len; i++) {

            System.out.print(i + " ");
        }
        for (int i = row_len - 1; i >= 1; i--) {

            System.out.print(i + " ");

        }
        System.out.println(" ");
    }
}