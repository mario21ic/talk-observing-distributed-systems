package io.github.jeqo.demo.rest;

import io.github.jeqo.demo.domain.TweetRepository;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 */
@Path("v2/tweets")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TweetsResource {

  private final TweetRepository tweetRepository;

  public TweetsResource(TweetRepository tweetRepository) {
    this.tweetRepository = tweetRepository;
  }

  @GET
  public Response findTweets() {
    final String tweetsRepresentation = tweetRepository.find();
    return Response.ok(tweetsRepresentation).build();
  }
}
