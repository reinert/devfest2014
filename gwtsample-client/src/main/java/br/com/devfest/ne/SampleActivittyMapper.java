package br.com.devfest.ne;

import br.com.devfest.ne.activity.AboutActivity;
import br.com.devfest.ne.activity.HomeActivity;
import br.com.devfest.ne.place.AboutPlace;
import br.com.devfest.ne.place.HomePlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class SampleActivittyMapper implements ActivityMapper {

    private final SampleClientFactory clientFactory;

    public SampleActivittyMapper(SampleClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public Activity getActivity(Place place) {
        if (place instanceof HomePlace)
            return new HomeActivity(clientFactory.getHome(), clientFactory.getUserName());
        else if (place instanceof AboutPlace)
            return new AboutActivity(clientFactory.getAbout(), clientFactory.getPlaceController());

        return null;
    }
}
