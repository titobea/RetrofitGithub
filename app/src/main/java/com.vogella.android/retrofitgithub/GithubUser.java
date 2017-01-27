package com.vogella.android.retrofitgithub;

/**
 * Created by tito_ on 27/01/2017.
 */

public class GithubUser {
    String login;
    String name;
    String email;

    @Override
    public String toString() {
        return(login);
    }
}
