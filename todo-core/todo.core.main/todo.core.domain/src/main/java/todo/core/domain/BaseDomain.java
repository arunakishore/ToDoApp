package todo.core.domain;

public interface BaseDomain {

	Long getPK();

	void setPK(Long pk);

	String getStatus();

	void setStatus(String status);

}
