package ${package};

import com.norther.cloud.common.basic.biz.BaseBiz;
import ${package?substring(0,package?last_index_of('.'))}.mapper.${tableClass.shortClassName}Mapper;
import ${tableClass.fullClassName};
import org.springframework.stereotype.Service;

<#assign dateTime = .now>
/**
* @description ${tableClass.shortClassName}业务层
* @author  jcb
* @since  ${dateTime?string["yyyy-MM-dd HH:mm:ss"]}
*/
@Service
public class ${tableClass.shortClassName}Biz extends BaseBiz<${tableClass.shortClassName}Mapper, ${tableClass.shortClassName}> {

}
