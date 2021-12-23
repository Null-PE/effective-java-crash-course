package weekx.emptycollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Client {

	public static void main(String[] args) {

		Quotes quotesOfJohn = new Quotes();
		List<String> quotes1 = quotesOfJohn.getQuotesOrNull();
		if (quotes1 != null) {
			quotes1.stream().forEach(System.out::println);
		}

		try {
			List<String> quotes2 = quotesOfJohn.getQuotesOrThrowException();
		} catch (QuotesNotFoundException e) {
			e.printStackTrace();
		}

		Optional<List<String>> optional = quotesOfJohn.getQuotesAsOptional();
		List<String> quotes3 = optional.orElse(new ArrayList<String>());
		quotes3.stream().forEach(System.out::println);
		
		List<String> quotes4 = quotesOfJohn.getQuotes();
		quotes4.stream().forEach(System.out::println);

	}

}
