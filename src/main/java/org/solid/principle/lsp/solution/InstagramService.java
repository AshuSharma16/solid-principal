package org.solid.principle.lsp.solution;

import org.solid.principle.lsp.problem.SocialMedia;

public class InstagramService implements SocialMedia, PublishPostMediaManager {

    /*
    Here InstagramService is the replacement of SocialMedia and PublishPostMediaManager
     */
    @Override
    public void groupVideoCall(String... friends) {

    }

    @Override
    public void sendPhotoAndVideos(String friends) {

    }

    @Override
    public void chatWithFriends(String friend) {

    }

    @Override
    public void publishPost(Object obj) {

    }
}
