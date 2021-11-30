package meta.test;

import meta.csv.CsvMap;
import meta.database.persister.EntityManager;
import org.springframework.stereotype.Component;

/**
 * @author: AK-47
 * @date: 2021/11/24
 */
@Component
public class TService {

    CsvMap<Integer,TResource> resourceCsvMap;

    EntityManager<Integer,TEntity> entityManager;

}
