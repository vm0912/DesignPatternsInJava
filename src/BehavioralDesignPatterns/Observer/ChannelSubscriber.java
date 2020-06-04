package BehavioralDesignPatterns.Observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * A representation of an observer entity, which implements the PropertyChangeListener interface
 * to handle property changes.
 * @author Vitomir M
 */
public class ChannelSubscriber implements PropertyChangeListener {

    private String newVideoTitle;

    public void setNewVideoTitle(String newVideoTitle) {
        this.newVideoTitle = newVideoTitle;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setNewVideoTitle((String) evt.getNewValue());
        System.out.println("The new video titled '" + newVideoTitle + "' has been uploaded!" );
    }


}
