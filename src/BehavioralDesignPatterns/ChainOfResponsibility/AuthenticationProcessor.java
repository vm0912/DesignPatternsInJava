package BehavioralDesignPatterns.ChainOfResponsibility;

/**
 * An abstract AuthenticationProcessor class which provides the constructor used by the inheriting classes.
 * The method isAuthorised() processes the Authentication provider and if needed,
 * delegates it through the chain.
 * @author Vitomir M
 */
public abstract class AuthenticationProcessor {

    public AuthenticationProcessor nextProcessor;

    public AuthenticationProcessor(AuthenticationProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract boolean isAuthorized(AuthenticationProvider authProvider);
}
