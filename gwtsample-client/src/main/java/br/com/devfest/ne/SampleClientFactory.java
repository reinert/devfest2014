package br.com.devfest.ne;

import br.com.devfest.ne.ui.About;
import br.com.devfest.ne.ui.Home;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;

public interface SampleClientFactory {
    String getUserName();
    EventBus getEventBus();
    PlaceController getPlaceController();
    Home getHome();
    About getAbout();
}
