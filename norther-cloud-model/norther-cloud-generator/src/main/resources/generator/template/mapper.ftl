package ${package};

import com.norther.cloud.common.basic.mapper.BaseMapper;
import ${tableClass.fullClassName};
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

<#assign dateTime = .now>
/**
 * @description ${tableClass.shortClassName}数据层
 * @author  jcb
 * @since  ${dateTime?string["yyyy-MM-dd HH:mm:ss"]}
*/
@Mapper
@Repository
public interface ${tableClass.shortClassName}Mapper extends BaseMapper<${tableClass.shortClassName}> {

}