package caltech.data.jpa.utilities.abstracts;

import caltech.data.jpa.utilities.interfaces.IDataTransferObject;

import java.util.Objects;
import java.util.UUID;

/**
 * @author Weverton Souza.
 * Created on 30/06/19
 */
public abstract class AbstractDataTransferObject implements IDataTransferObject {
    protected UUID id;

    public UUID getId() {
        return id;
    }

    public IDataTransferObject setId(UUID id) {
        this.id = id;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        IDataTransferObject that = (IDataTransferObject) o;
        return Objects.equals(id, that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
