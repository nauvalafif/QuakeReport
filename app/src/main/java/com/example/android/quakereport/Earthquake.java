/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;


public class Earthquake {

    // Magnitud gempa
    private double mmag;

    // tempat terjadi gempa
    private String mplace;

    // tanggal terjadi gempa
    private int mtgl;

    /*
    * Create a new Earthquake object.
    *
    * @param mag
    * @param place
    * @param tgl
    * */
    public Earthquake(double mag, String place, int tgl)
    {
        mmag = mag;
        mplace = place;
        mtgl = tgl;
    }

    /**
     * Get the magnitude
     */
    public String getMagnitude() {

        String strmag = String.valueOf(mmag);
        return strmag;
    }

    /**
     * Get the Android version number
     */
    public String getPlace() {
        return mplace;
    }

    /**
     * Get the image resource ID
     */
    public String getDate() {
        String strtgl = String.valueOf(mtgl);
        return strtgl;
    }


}
