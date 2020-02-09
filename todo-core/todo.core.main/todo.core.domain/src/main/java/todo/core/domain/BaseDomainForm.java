package todo.core.domain;

import java.util.List;

public class BaseDomainForm {

	private Long domainId;

	private BaseDomain baseDomain;

	private List<BaseDomain> baseDomains;

	public BaseDomain getBaseDomain() {
		return baseDomain;
	}

	public void setBaseDomain(BaseDomain baseDomain) {
		this.baseDomain = baseDomain;
	}

	public List<BaseDomain> getBaseDomains() {
		return baseDomains;
	}

	public void setBaseDomains(List<BaseDomain> baseDomains) {
		this.baseDomains = baseDomains;
	}

	public Long getDomainId() {
		return domainId;
	}

	public void setDomainId(Long domainId) {
		this.domainId = domainId;
	}

	public void populateBaseDomain(BaseDomain domain) {
	}

}
