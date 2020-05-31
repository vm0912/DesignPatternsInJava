package BehavioralDesignPatterns.ChainOfResponsibility;

/**
 * A type of authentication provider.
 * The true method of providing authentication is not implemented due to simplification of the example.
 * @author Vitomir M
 */
public class OAuthTokenProvider implements AuthenticationProvider {

    private String token;

    @Override
    public void provideAuthentication() {
        System.out.println("OAuth authentication provided.");
    }
}
