package br.com.devfest.ne;

import br.com.devfest.ne.event.UserChangeEvent;
import br.com.devfest.ne.ui.About;
import br.com.devfest.ne.ui.Home;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;

public class SampleClientFactoryImpl implements SampleClientFactory {

    private final EventBus eventBus = new SimpleEventBus();
    private final PlaceController placeController = new PlaceController(eventBus);
    private String userName = "anonymous";
    private Home home;
    private About about;

    public SampleClientFactoryImpl() {
        eventBus.addHandler(UserChangeEvent.TYPE, new UserChangeEvent.Handler() {
            @Override
            public void onUserChange(UserChangeEvent event) {
                userName = event.getNewUserName();
            }
        });
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public EventBus getEventBus() {
        return eventBus;
    }

    @Override
    public PlaceController getPlaceController() {
        return placeController;
    }

    @Override
    public Home getHome() {
        if (home == null)
            home = new Home();
        return home;
    }

    @Override
    public About getAbout() {
        if (about == null)
            about = new About();
        return about;
    }
}
