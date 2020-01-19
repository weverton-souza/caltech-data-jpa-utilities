package caltech.data.jpa.utilities.abstracts;

import caltech.data.jpa.utilities.interfaces.IDomain;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

/**
 * @author Weverton Souza.
 * Created on 16/06/19
 */
@MappedSuperclass
public abstract class AbstractDomain implements IDomain {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    protected UUID id;
    private Date createdDate;
    private Date lastModifiedDate;

    public AbstractDomain() {
        this.createId();
    }

    private void createId() {
        this.id = UUID.randomUUID();
    }

    @Override
    public IDomain setId(final UUID id) {
        this.id = id;
        return this;
    };

    @Override
    public UUID getId() {
        return id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        IDomain that = (IDomain) o;
        return Objects.equals(id, that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
