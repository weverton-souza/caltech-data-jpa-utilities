package caltech.data.jpa.utilities.interfaces;

import caltech.data.jpa.utilities.abstracts.AbstractDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Weverton Souza.
 * Created on 19/09/19
 */
@Repository
public interface IRepository<D extends AbstractDomain, K> extends JpaRepository<D, K> {
}
