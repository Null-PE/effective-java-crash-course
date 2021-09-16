package week1;

import java.time.LocalDate;

import week1.domain.value.Track;

public class ToStringExperiment {

	public static void main(String[] args) {

		// TODO3 override toString() of Track
		Track track1 = new Track(1, "Hello, Goodbye", "The Beatles", LocalDate.of(1967, 11, 24));
		System.out.println(track1.toString());

	}

}
