package com.mykyta.models.proxy;

public class ProxyApp {
    public static void main(String[] args) {
        Movie movie = new ProxyMovie("user/movies/myrealmovie.mp4");
        movie.show();
    }
}
