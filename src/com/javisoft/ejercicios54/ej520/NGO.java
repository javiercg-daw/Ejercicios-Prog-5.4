package com.javisoft.ejercicios54.ej520;

import java.util.HashSet;
import java.util.Optional;

public class NGO {
    private final HashSet<Volunteer> volunteers;
    private int nextCount;

    public NGO() {
        this.volunteers = new HashSet<>();
        this.nextCount = 0;
    }

    public boolean addVolunteer(Volunteer volunteer) {
        return volunteers.add(volunteer);
    }

    public void removeVolunteer(Volunteer volunteer) {
        volunteers.remove(volunteer);
    }

    public Optional<Volunteer> next() {
        if (volunteers.isEmpty()) {
            return Optional.empty();
        }

        Optional<Volunteer> volunteer;
        int maxOrMinAge;

        if (nextCount % 2 == 0) {
            maxOrMinAge = volunteers.stream().mapToInt(Volunteer::getAge).max().getAsInt();
        } else {
            maxOrMinAge = volunteers.stream().mapToInt(Volunteer::getAge).min().getAsInt();
        }
        volunteer = volunteers.stream().filter(v -> v.getAge() == maxOrMinAge).findFirst();
        volunteer.ifPresent(this::removeVolunteer);
        nextCount++;

        return volunteer;
    }
}
