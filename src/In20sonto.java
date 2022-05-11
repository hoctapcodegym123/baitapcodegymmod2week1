public class In20sonto {
    static boolean checkPrime (int x){ // PhươngSố nguyên tố
        if (x < 2){
            return false;
        }else {
            for (int i = 2; i <=Math.sqrt(x); i++){
                if (x%i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print(" 20 số nguyên tố đầu tiên là: ");
        int count = 0;
        for (int i = 0;;i++){
            if (checkPrime(i)){
                System.out.print(i + ",");
                count++;
                if (count==20){
                    break;
                }
            }
        }
    }
}
