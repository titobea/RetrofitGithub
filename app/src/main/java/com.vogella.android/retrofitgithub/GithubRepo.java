package com.vogella.android.retrofitgithub;

/**
 * Created by tito_ on 27/01/2017.
 */

public class GithubRepo {
    String name;
    String url;

    @Override
    public String toString() {
        return(name + " " +  url);
    }
}
