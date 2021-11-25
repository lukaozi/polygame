package meta.database;


import java.util.Map;

/**
 * @author: AK-47
 * @date: 2021/11/25
 */
public abstract class ChangeSupportEntity<PK> extends AbstractEntity<PK>{

    /**
     * 增量更新支持
     */
    private EntityUpdateSupport support = new EntityUpdateSupport(this.getClass());


    public Map<String,String> getChangeValueMap() {
        return support.getUpdateValueMap(this);
    }
}