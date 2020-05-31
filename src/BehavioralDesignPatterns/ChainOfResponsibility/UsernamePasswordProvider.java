package BehavioralDesignPatterns.ChainOfResponsibility;

/**
 * A type of authentication provider.
 *The true method of providing authentication is not implemented due to simplification of the example.
 * @author Vitomir M
 */
public class UsernamePasswordProvider implements AuthenticationProvider{

    private String username;
    private String password;

    @Override
    public void provideAuthentication() {
        System.out.println("Username and password authentification provided.");
    }
}
