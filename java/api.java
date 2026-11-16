import java.security.SecureRandom;
import java.util.Base64;

public class api {
    public static void main(String[] args) {
        private static final SecureRandom secureRandom = new SecureRandom();
        private static final Base64.Encoder base64Encoder  = Base64.getUrlEncoder().withoutPadding();

        public static String genAPIKey(int byteLength) {

            byte[] randomBytes = new byte[randomByte];
            SecureRandom.nextBytes(randomBytes);
            return base64Encoder.encodeToString(randomBytes);

        


    }
}
