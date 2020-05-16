package com.binary_studio.uniq_in_sorted_stream;

//You CAN modify this class
public final class Row<RowData> {

	private final Long id;

	public Row(Long id) {
		this.id = id;
	}

	public Long getPrimaryId() {
		return this.id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Row)) return false;

		Row<?> row = (Row<?>) o;

		return id != null ? id.equals(row.id) : row.id == null;
	}

	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}
}
