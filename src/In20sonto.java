public class In20sonto {
    static boolean checkPrime (int x){ // Phương thức check Số nguyên tố
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
        for (int j = 0;;j++){
            if (checkPrime(j)){
                System.out.print(j + ",");
                count++;
                if (count==20){
                    break;
                }
            }
        }
    }
}
