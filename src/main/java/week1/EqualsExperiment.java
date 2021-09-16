package week1;

import java.time.LocalDate;

import week1.domain.value.Track;

public class EqualsExperiment {

	public static void main(String[] args) {

		Track track1 = new Track(1, "Hello, Goodbye", "The Beatles", LocalDate.of(1967, 11, 24));
		Track track2 = new Track(1, "Hello, Goodbye", "The Beatles", LocalDate.of(1967, 11, 24));

		// == はオブジェクト型は参照値比較
		System.out.println("track1 == track2:" + (track1 == track2));
		// .equalsはフィールドの値が全て等しいかを
		// TODO4: override equals of Track to make the followings true
		System.out.println("track1 == track2:" + (track1.equals(track2)));

	}
}
