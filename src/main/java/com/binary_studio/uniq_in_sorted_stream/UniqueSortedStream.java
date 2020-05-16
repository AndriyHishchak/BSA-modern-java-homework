package com.binary_studio.uniq_in_sorted_stream;

import java.util.stream.Stream;

public final class UniqueSortedStream {

	private UniqueSortedStream() {
	}

	public static <T> Stream<Row<T>> uniqueRowsSortedByPK(Stream<Row<T>> stream) {
		return stream.distinct();
	}

}
