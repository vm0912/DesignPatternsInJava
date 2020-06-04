package BehavioralDesignPatterns.Observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *A class that represents an observable entity. The preferred implementation is using PropertyChangeSupport class
 * which handles the property changes and the PropertyChangeListeners/observers
 * (in this scenario the ChannelSubscriber objects).
 * @author Vitomir M
 */
public class YouTubeChannel {

    private String videoTitle;
    private PropertyChangeSupport support;

    

    public void addPropertyChangeListener(PropertyChangeListener pcl){
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl){
        support.removePropertyChangeListener(pcl);
    }

    public void uploadVideo(String uploadedVideoTitle){
        support.firePropertyChange("videoTitle", this.videoTitle, uploadedVideoTitle );
        this.videoTitle = uploadedVideoTitle;
    }


}
