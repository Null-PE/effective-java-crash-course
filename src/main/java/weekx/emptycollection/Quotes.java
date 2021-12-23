package weekx.emptycollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Quotes {

	private List<String> quotes = new ArrayList<String>();

	public List<String> getQuotesOrNull() {
		if (quotes.isEmpty()) {
			return null;
		} else {
			return quotes;
		}
	}

	public List<String> getQuotesOrThrowException() throws QuotesNotFoundException {
		if (quotes.isEmpty()) {
			throw new QuotesNotFoundException();
		} else {
			return quotes;
		}
	}

	public Optional<List<String>> getQuotesAsOptional() {
		if (quotes.isEmpty()) {
			return Optional.empty();
		} else {
			return Optional.of(quotes);
		}
	}

	public List<String> getQuotes() {
		return quotes;
	}

}
