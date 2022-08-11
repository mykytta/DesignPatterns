package com.mykyta.models.proxy;

public class ProxyMovie implements Movie{

    String file;
    RealMovie realMovie;
    public ProxyMovie(String file) {
        this.file = file;
    }

    @Override
    public void show() {
        if(realMovie == null)
            realMovie = new RealMovie(file);

        realMovie.show();
    }
}
