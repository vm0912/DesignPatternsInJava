package BehavioralDesignPatterns.ChainOfResponsibility;

/**
 * Chain of Responsibility pattern is implemented as a chain of components who all
 * get a chance to process a command or a query, optional having a default processing
 * implementation and an ability to terminate  the processing chain.
 * Different authentication processor process the authentication data through the chain,
 * and if one of the processors figures out that the user authentication corresponds with its native
 * authentication it stops the chain execution and returns true.
 * @author Vitomir M
 */
public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        AuthenticationProcessor oAuthProcessor = new OAuthProcessor(null);
        AuthenticationProcessor nextInChainProcessor = new UsernamePasswordProcessor(oAuthProcessor);

        System.out.println("OAuthProvider passes through the authentication chain and is authenticated: "
                + nextInChainProcessor.isAuthorized(new OAuthTokenProvider()));

        System.out.println("UsernamePasswordProvider passes through the authentication chain and is authenticated: "
                + nextInChainProcessor.isAuthorized(new UsernamePasswordProvider()));

        System.out.println("JWTProvider passes through the authentication chain and is authenticated: "
                + nextInChainProcessor.isAuthorized(new JWTProvider()));
    }
}
