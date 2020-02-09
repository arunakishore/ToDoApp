package todo.core.ta.rdbms.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import todo.core.domain.BaseDomain;

@MappedSuperclass
public class BaseDomainImpl implements BaseDomain, Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long pk;

	@Column(name = "status", length = 25, nullable = false)
	private String status;

	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	protected Date creationDate;

	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
	protected Date lastModifiedDate;

	@Override
	public Long getPK() {
		return this.pk;
	}

	@Override
	public void setPK(Long pk) {
		this.pk = pk;
	}

	@Override
	public String getStatus() {
		return this.status;
	}

	@Override
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	@Override
	public String toString() {
		return "BaseDomainImpl [pk=" + pk + ", status=" + status + ", creationDate=" + creationDate
				+ ", lastModifiedDate=" + lastModifiedDate + "]";
	}

}
