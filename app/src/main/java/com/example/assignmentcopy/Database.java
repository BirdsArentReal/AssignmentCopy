package com.example.assignmentcopy;


import java.util.Random;

public final class Database {
    private static String[] toasts =
            {"The second is defined using a Ceasium-133 atom!",
                    "The speed of light in vacuum is exactly 299,792,458 m/s!",
                    "The kilogram is no longer defined using a physical object!",
                    "The elementary charge is exactly 1.602176634×10^−19 Coulombs!",
                    "One mole contains exactly 6.022 140 76 × 10^23 particles!",
                    "The Boltzmann constant is exactly be 1.380649×10^−23 J/K!",
                    "The observable universe has a radius of much more than 13.7 billion lightyears!",
                    "Astronomers think that the universe is mostly made of things we can't observe yet"
            };

    public static String showToast(){
        String s = rng();
        return "Did you know?\n" + s;
    }

    private static String rng(){
        //randomizes which toast to show on screen
        Random r = new Random();
        int i = r.nextInt(toasts.length);
        return toasts[i];
    }

}
