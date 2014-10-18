package br.com.devfest.ne.activity;

import br.com.devfest.ne.place.HomePlace;
import br.com.devfest.ne.ui.About;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class AboutActivity extends AbstractActivity implements About.Handler {

    private final About about;
    private final PlaceController placeController;

    public AboutActivity(About about, PlaceController placeController) {
        this.about = about;
        this.placeController = placeController;
    }

    @Override
    public void onHomeClick() {
        placeController.goTo(new HomePlace());
    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        about.setHandler(this); // Bind listener
        panel.setWidget(about);
    }

    @Override
    public void onStop() {
        about.setHandler(null); // Unbind listener
    }
}
