import java.util.*;

public class OTPGenerator {

    public static int generateOTP() {
        return (int)(100000 + Math.random() * 900000); // Range: 100000 to 999999
    }

    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        boolean unique = areOTPsUnique(otpArray);
        System.out.println("\nAre all OTPs unique? " + unique);
    }
}
