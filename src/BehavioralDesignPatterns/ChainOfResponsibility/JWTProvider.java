package BehavioralDesignPatterns.ChainOfResponsibility;

/**
 * A type of authentication provider.
 * @author Vitomir M
 */
public class JWTProvider implements AuthenticationProvider {
    @Override
    public void provideAuthentication() {
        System.out.println("JWTAuthentication provided.");
    }
}
