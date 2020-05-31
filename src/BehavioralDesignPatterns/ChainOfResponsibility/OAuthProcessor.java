package BehavioralDesignPatterns.ChainOfResponsibility;

/**
 * A implementation of the concrete Authentication processor .
 * The method isAuthorised() processes the Authentication provider and if needed,
 * delegates it through the chain.
 * @author Vitomir M
 */
public class OAuthProcessor extends AuthenticationProcessor{
    public OAuthProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authProvider) {
        if (authProvider instanceof OAuthTokenProvider) {
            return true;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(authProvider);
        }

        return false;
    }
}
