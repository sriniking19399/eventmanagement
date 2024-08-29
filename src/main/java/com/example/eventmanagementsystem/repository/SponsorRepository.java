/*
 * You can use the following import statements
 *
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.eventmanagementsystem.repository;

import com.example.eventmanagementsystem.model.*;

import java.util.*;

public interface SponsorRepository {
    ArrayList<Sponsor> getAllSponsors();

    Sponsor getSponsorById(int sponsorId);

     Sponsor addSponsor(Sponsor sponsor);

    Sponsor updateSponsor(int sponsorId, Sponsor sponsor);

    void deleteSponsor(int sponsorId);

    List<Event> getAllEventBySponsorId(int sponsorId);

}