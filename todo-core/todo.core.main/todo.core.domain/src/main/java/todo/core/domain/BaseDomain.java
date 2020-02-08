package todo.core.domain;

public interface BaseDomain {

	default Long getPk() {
		return null;
	}

	default void setPk(Long pk) {
	}

	default String getStatus() {
		return null;
	}

	default void setStatus(String status) {
	}

}
