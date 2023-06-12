namespace java forest.banyan

struct Query {
  1: required string text,
  2: optional i64 resultsNewerThan
}

struct SearchResult {
  1: required string url,
  2: required list<string> keywords = [], // A list of keywords related to the result
  3: required i64 lastUpdatedMillis // The time at which the result was last checked, in unix millis
}

service Google {
  list<SearchResult> search(1: Query query)
}