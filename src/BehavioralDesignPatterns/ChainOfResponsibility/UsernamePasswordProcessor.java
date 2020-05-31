package BehavioralDesignPatterns.ChainOfResponsibility;

/**
 * A implementation of the concrete Authentication processor .
 * The method isAuthorised() processes the Authentication provider and if needed,
 * delegates it through the chain.
 * @author Vitomir M
 */
public class UsernamePasswordProcessor extends AuthenticationProcessor {
    public UsernamePasswordProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authProvider) {
        if (authProvider instanceof UsernamePasswordProvider) {
            return true;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(authProvider);
        }
        return false;
    }
}
