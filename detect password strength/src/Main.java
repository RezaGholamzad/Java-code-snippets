public class Main {
    public static void main(String[] args) {
        System.out.println(detectPasswordStrength("456"));
    }
    public static String detectPasswordStrength(String password){
        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasLoverCase = false;
        boolean hasUpperCase = false;
        boolean hasSpecialCase = false;
        String loverChars = "abcdefghijklmnopqrstuvwxyz ";
        String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digitChars = "1234567890";
        String specialChars = "!@#$%^&*()-+";

        for (int i = 0; i < password.length(); i++) {
            char x = password.charAt(i);
            String y = String.valueOf(x);
            if (loverChars.contains(y)) {
                hasLetter = true;
                hasLoverCase = true;
            }
            else if (upperChars.contains(y)){
                hasLetter = true;
                hasUpperCase = true;
            }
            else if (digitChars.contains(y)) {
                hasDigit = true;
            }
            else if (specialChars.contains(y)){
                hasSpecialCase = true;
            }
            if (hasDigit && hasLetter && hasLoverCase && hasUpperCase && hasSpecialCase){
                break;
            }
        }
        if (hasLoverCase && hasUpperCase && hasDigit && hasSpecialCase && password.length() >= 8){
            return "strong";
        }
        else if( (hasLoverCase || hasUpperCase) && hasSpecialCase && password.length() >= 6 ){
            return "moderate";
        }
        return "weak";
    }

}

