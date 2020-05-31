package BehavioralDesignPatterns.ChainOfResponsibility;

/**
 * Interface which acts as a contract of providing
 *  authentication when a class implements it.
 * @author Vitomir M
 */
public interface AuthenticationProvider {
    void provideAuthentication();
}
