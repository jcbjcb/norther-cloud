package ${package};

import com.norther.cloud.common.basic.rest.BaseController;
import ${package?substring(0,package?last_index_of('.'))}.service.${tableClass.shortClassName}Biz;
import ${tableClass.fullClassName};
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<#assign dateTime = .now>
/**
* @description ${tableClass.shortClassName}控制层
* @author  jcb
* @since  ${dateTime?string["yyyy-MM-dd HH:mm:ss"]}
*/
@RestController
@RequestMapping("/${tableClass.variableName}")
public class ${tableClass.shortClassName}Controller extends BaseController<${tableClass.shortClassName}Biz, ${tableClass.shortClassName}> {

}
