package br.com.devfest.ne.service;

import br.com.devfest.ne.model.Tweet;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import java.util.List;

@RemoteServiceRelativePath("tweet")
public interface TweetService extends RemoteService {

    public String tweet(Tweet tweet);

    public String delete(Tweet tweet);

    public List<Tweet> getAll();
}
