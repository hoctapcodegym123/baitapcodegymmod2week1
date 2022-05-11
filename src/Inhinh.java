public class Inhinh {
    public static void main(String[] args) {
        inhinhchunhat();
        intamgiac();
        intamgiacnguoc();
    }
    static void inhinhchunhat () {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void intamgiac () {
        for (int i = 1; i <= 6; i++){
            for (int j = 1; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void intamgiacnguoc(){
        for (int i=7;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
