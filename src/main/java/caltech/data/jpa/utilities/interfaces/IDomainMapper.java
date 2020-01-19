package caltech.data.jpa.utilities.interfaces;

import caltech.data.jpa.utilities.abstracts.AbstractDataTransferObject;
import caltech.data.jpa.utilities.abstracts.AbstractDomain;

import java.util.List;

/**
 * @author Weverton Souza.
 * Created on 19/09/19
 */
public interface IDomainMapper<DOMAIN extends AbstractDomain, DTO extends AbstractDataTransferObject> {
    DTO toDTO(final DOMAIN domain);
    DOMAIN toDomain(final DTO dto);
    List<DTO> toPageDTO(final List<DOMAIN> items);
}
