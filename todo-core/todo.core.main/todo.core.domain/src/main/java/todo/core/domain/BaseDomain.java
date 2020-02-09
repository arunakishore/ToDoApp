package todo.core.domain;

public interface BaseDomain {

	default Long getPK() {
		return null;
	}

	default void setPK(Long pk) {
	}

	default String getStatus() {
		return null;
	}

	default void setStatus(String status) {
	}

}
