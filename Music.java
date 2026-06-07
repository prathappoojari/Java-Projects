package com;

import java.io.IOException;

class Play {
    public void play() {
        System.out.println("Music is playing...!");
    }

    public int MusicCout() {
        return 1;
    }
}

public class Music {
    public static void main(String[] args) throws IOException {
        Play obj = new Play(); // new is used to create object.
        obj.play();
        int res = obj.MusicCout();
        System.out.println(res);
    }
}
