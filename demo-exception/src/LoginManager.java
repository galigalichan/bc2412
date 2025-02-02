public class LoginManager {
    private String username;
    private String password;
    

    public LoginManager(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Approach 2: BusinessRuntimeException
    public static class BusinessRuntimeException extends RuntimeException {
        // Runtime -> spelling mistake
        // "Invalid User Name."
        // "Invalid Password."

        public static BusinessRuntimeException of(SysError sysError) { // similar to localDate of() (new)
            return new BusinessRuntimeException(sysError);
        }

        private BusinessRuntimeException(SysError sysErr) { // Best Design
            super(sysErr.getDesc());

        }

    //    private BusinessRuntimeException(String message) {
    //        super(message);
    //    }
    }

    // Approach 1: InvalidUsernameException + InvalidPasswordException
    public static class InvalidUsernameException extends RuntimeException {
        public InvalidUsernameException(String message) { // You hide a message in the bomb
            super(message);
        }
    }

    public static class InvalidPasswordException extends RuntimeException {
        public InvalidPasswordException(String message) {
            super(message);
        }
    }

    public void validateUsername() {
      if (this.username == null || this.username.isEmpty()) {
      throw new InvalidUsernameException("Username is invalid: " + this.username);
    }
    }

    public void validatePassword() {
      if (this.password == null || this.password.length() < 8
        || (!this.password.contains("@") && !this.password.contains("!")
            && !this.password.contains("$") && !this.password.contains("&")
            && !this.password.contains("_"))) {
      throw new InvalidPasswordException("Password is invalid: " + this.password);
    }
    }

    // Regular Expression
    public void validateUsername2() {
        if (this.username == null || this.username.isEmpty()) {
        throw BusinessRuntimeException.of(SysError.INVALID_USERNAME);
      }
      }

      public void validatePassword2() {
        if (this.password == null || this.password.length() < 8
          || (!this.password.contains("@") && !this.password.contains("!")
              && !this.password.contains("$") && !this.password.contains("&")
              && !this.password.contains("_"))) {
        throw BusinessRuntimeException.of(SysError.INVALID_PASSWORD);
      }
      }

    public static void main(String[] args) {
        LoginManager loginManager = new LoginManager("jackwong", "abcd123!");
        // 1. We can define the program flow by custom exceptions.
        // Approach 1
        try {
        loginManager.validateUsername();
        loginManager.validatePassword();
        System.out.println("Validation is successful.");
        } catch (InvalidUsernameException e) { // e can carry message -> object
            System.out.println(e.getMessage());
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }

        // Approach 2
        LoginManager loginManager2 = new LoginManager("jackwong", "abcd1234");
        try {
        loginManager2.validateUsername2();
        loginManager2.validatePassword2();
        System.out.println("Validation is successful.");
        } catch (BusinessRuntimeException e) {
            System.out.println(e.getMessage());
        }
    } 
    
}
