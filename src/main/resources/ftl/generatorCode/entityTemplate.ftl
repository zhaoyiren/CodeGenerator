package com.xiongyi.entity.${packageName}.${objectNameLower};

/** 
 * 说明： ${TITLE}
 * 创建人：XY
 * 创建时间：${nowDate?string("yyyy-MM-dd")}
 * @version
 */
 public class ${objectName} {
 
 	<#list fieldList as var>
		private String ${var[0]};	//${var[2]}
	</#list>
	
	
 	<#list fieldList as var>
	public String get${var[0]}() {
		return ${var[0]};
	}
	public void set${var[0]}(String ${var[0]}) {
		this.${var[0]} = ${var[0]};
	}
		</#if>
	</#list>
 
 }